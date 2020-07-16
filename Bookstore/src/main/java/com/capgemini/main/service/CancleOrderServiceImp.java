package com.capgemini.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.main.dao.CancleOrderDao;
import com.capgemini.main.entities.OrderInformation;


public class CancleOrderServiceImp implements CancleOrderService {

	
	@Autowired
	CancleOrderDao cancleOrderDao;
	@Override
	public boolean findOrderById(int orderId) {
		// TODO Auto-generated method stub
		
		return cancleOrderDao.findOrder(orderId);
		
	}
	
	@Override
	public String cancleOrder(int orderId) {
		// TODO Auto-generated method stub
		
		OrderInformation orderDetails=new OrderInformation();
			orderDetails=cancleOrderDao.getOrderDetails(orderId);
			
			if(orderDetails.getOrderStatus().equals("Processing"))
			{
				cancleOrderDao.updateOrderStatus(orderId, "Cancelled");
				return "Order is Cancelled";
			}
			else if(orderDetails.getOrderStatus().equals("Cancelled"))
			{
				return "Order is already Cancelled";
			}
			else if(orderDetails.getOrderStatus().equals("Shipped"))
			{
				return "Cannot Cancelled Order, Order is already Shipped";
			}
			return null;
		
		 
	}

}
