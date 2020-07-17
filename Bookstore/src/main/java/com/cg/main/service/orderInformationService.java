package com.cg.main.service;

public interface orderInformationService {
	public boolean findOrderById(int orderId);
	public String cancleOrder(int orderId);
}
