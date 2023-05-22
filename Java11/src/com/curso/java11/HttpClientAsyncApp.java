package com.curso.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public class HttpClientAsyncApp {

	public static void main(String[] args) {
		final var uri = "https://www.boredapi.com/api/activity";
		
		var httpClient = HttpClient.newBuilder()
						.connectTimeout(Duration.ofSeconds(10))
						.build();
		
		var request = HttpRequest.newBuilder()
					.uri(URI.create(uri))
					.GET()
					.build();
		
		CompletableFuture<HttpResponse<String>> futureResult = httpClient.sendAsync(request, BodyHandlers.ofString());
		
		futureResult.thenApply(HttpResponse::body)
					.exceptionally(ex -> "Ops, algo salió mal")
					.thenAccept(System.out::println);
		
		System.out.println("asíncrono");
		
		var response = futureResult.join();
	}

}
