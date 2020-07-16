package com.capgemini.main.dao;

import com.capgemini.main.entities.OrderInformation;

public interface CancleOrderDao {
public boolean findOrder(int orderId);
public OrderInformation getOrderDetails(int orderId);
public void updateOrderStatus(int orderId,String orderStatus);
}
