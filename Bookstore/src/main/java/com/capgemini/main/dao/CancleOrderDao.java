package com.capgemini.main.dao;

import com.capgemini.main.entities.Order;

public interface CancleOrderDao {
public boolean findOrder(int orderId);
public Order getOrderDetails(int orderId);
}
