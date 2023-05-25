package com.curso.java12a17;

public class SwitchExpressionsApp {

	public static void main(String[] args) {
		
		OrderStatus status = OrderStatus.COOKING;
		
		switch (status) {
		case COOKING:
		case ORDERED:
			System.out.println("Pedido no listo");
			break;
		case DELIVERED:
			System.out.println("Pedido entregado");
			break;
		default:
			System.out.println("Error en el pedido");
		};
		
		var result = switch (status) {
			case COOKING, ORDERED -> "Pedido no listo";
			case DELIVERED -> "Pedido entregado";
			default -> "Error en el pedido";
		};
		
		var num = 2;
		
		var resultado = switch (num) {
			case 1 -> {
				System.out.println("en uno");
				yield "Uno";
			}
			default -> throw new IllegalArgumentException("Unexpected value: " + num);
		};

	}
	
	enum OrderStatus {
		ORDERED, COOKING, DELIVERED, CANCELLED
	}

}
