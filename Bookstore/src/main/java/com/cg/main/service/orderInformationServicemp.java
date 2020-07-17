package com.cg.main.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.main.dao.CancleOrderDao;
import com.cg.main.entities.Order;

public class orderInformationServicemp implements orderInformationService {
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
		
		Order orderDetails=new Order();
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
