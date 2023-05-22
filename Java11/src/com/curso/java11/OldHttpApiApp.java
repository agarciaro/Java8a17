package com.curso.java11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OldHttpApiApp {

	public static void main(String[] args) throws IOException {
		
		final var uri = "https://www.boredapi.com/api/activity";
		
		var url = new URL(uri);
		var httpURLConnection = (HttpURLConnection) url.openConnection();
		
		httpURLConnection.setRequestMethod("GET");
		if(httpURLConnection.getResponseCode() == 200) {
			System.out.println(readResponse(httpURLConnection.getInputStream()));
		} else {
			System.out.println("Algo fué mal");
		}

	}

	private static String readResponse(InputStream inputStream) throws IOException {
		var content = new StringBuilder();
		var line = "";
		try(var bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
			while((line = bufferedReader.readLine()) != null) {
				content.append(line);
			}
		}
		return content.toString();
	}

}
