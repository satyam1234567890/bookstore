package com.cg.main.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.main.entities.Order;

@Repository
public class CancleOrderDaoImp implements CancleOrderDao {


	@Autowired
	EntityManager entityManager;
	@Override
	public boolean findOrder(int orderId) {
		// TODO Auto-generated method stub
		return entityManager.contains(entityManager.find(Order.class, orderId));
		
	}

	@Override
	public Order getOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return entityManager.find(Order.class, orderId);
	
	}

	@Override
	public void updateOrderStatus(int orderId, String orderStatus) {
		// TODO Auto-generated method stub
		entityManager.find(Order.class, orderId).setOrderStatus(orderStatus);
		
	}

}
