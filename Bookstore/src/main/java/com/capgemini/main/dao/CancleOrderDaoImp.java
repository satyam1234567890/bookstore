package com.capgemini.main.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.main.entities.Order;

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
	
	//for demo purpose we make this function

}
