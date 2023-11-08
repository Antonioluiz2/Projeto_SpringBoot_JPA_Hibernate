package com.antonioluiz.portifolio.entities.enums;

public enum OrdersStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5),;

	private int code;
	
	private  OrdersStatus(int code) {
		this.code=code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrdersStatus valueOf(int code) {
		for (OrdersStatus v : OrdersStatus.values()) {
			if (v.getCode() == code) {
				return v;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus Code");
	}

}
