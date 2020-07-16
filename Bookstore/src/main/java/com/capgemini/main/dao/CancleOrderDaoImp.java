package com.capgemini.main.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.capgemini.main.entities.OrderInformation;

@Repository
public class CancleOrderDaoImp implements CancleOrderDao {

	
	@Autowired
	EntityManager entityManager;
	@Override
	public boolean findOrder(int orderId) {
		// TODO Auto-generated method stub
		return entityManager.contains(entityManager.find(OrderInformation.class, orderId));
		
	}

	@Override
	public OrderInformation getOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return entityManager.find(OrderInformation.class, orderId);
	
	}

	@Override
	public void updateOrderStatus(int orderId, String orderStatus) {
		// TODO Auto-generated method stub
		entityManager.find(OrderInformation.class, orderId).setOrderStatus(orderStatus);
		
	}
	


}
