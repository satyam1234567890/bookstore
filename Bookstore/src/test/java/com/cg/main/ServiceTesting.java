package com.cg.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.main.service.orderInformationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTesting {

	@Autowired
	orderInformationService service;

	@Test
	public void cancleOrder()
	{
		String exceptedValue="Order is Cancelled";
		String actualValue=service.cancleOrder(1);
		assertEquals(exceptedValue,actualValue);
	}
	@Test
	public void alreadyCancleOrder()
	{
		String exceptedValue="Order is already Cancelled";
		String actualValue=service.cancleOrder(1);
		assertEquals(exceptedValue,actualValue);
	}
	
	@Test
	public void cantCancelledOrder()
	{
		String exceptedValue="Cannot Cancelled Order, Order is already Shipped";
		String actualValue=service.cancleOrder(2);
		assertEquals(exceptedValue,actualValue);
	}
}
