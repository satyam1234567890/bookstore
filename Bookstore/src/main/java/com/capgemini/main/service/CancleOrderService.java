package com.capgemini.main.service;

public interface CancleOrderService {
	public boolean findOrderById(int orderId);
	public String cancleOrder(int orderId);

}
