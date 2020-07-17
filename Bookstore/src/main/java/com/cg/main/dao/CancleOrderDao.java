package com.cg.main.dao;

import com.cg.main.entities.Order;

public interface CancleOrderDao {
	public boolean findOrder(int orderId);
	public Order getOrderDetails(int orderId);
	public void updateOrderStatus(int orderId,String orderStatus);
}
