package com.capgemini.main;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.capgemini.main.controller.OrderInformationController;
import com.capgemini.main.service.CancleOrderService;

public class RestControllerTesting extends BookstoreApplicationTests {

	

	private MockMvc mockMvc;
	
	@Mock
	CancleOrderService service;

	
	@InjectMocks
	private OrderInformationController controller;
	
	
	
	
	@Before
	public void setup() throws Exception {
	
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	//demo test
	@Test
	public void demoTest() throws Exception
	{
		mockMvc.perform(get("/hello"))
		.andExpect(status().isOk())
		.andExpect(content().string("Hello"));
	
	
	}
	
	/*
	@Test
	public void cancleOrder1() throws Exception
	{
		mockMvc.perform(get("/CancleOrder/{orderID}"))
		.andExpect(status().isOk())
		.andExpect(content().string("Order is Cancelled")); 
	}
	
	
	@Test
	public void cancleOrder2() throws Exception
	{
		mockMvc.perform(get("/CancleOrder/{orderID}"))
		.andExpect(status().isOk())
		.andExpect(content().string("Order is already Cancelled"));
	}
	
	
	@Test
	public void cancleOrder3() throws Exception
	{
		mockMvc.perform(get("/CancleOrder/{orderID}"))
		.andExpect(status().isOk())
		.andExpect(content().string("Cannot Cancelled Order, Order is already Shipped"));
	}
	
	@Test
	public void cancleOrder4() throws Exception
	{
		mockMvc.perform(get("/CancleOrder/{orderID}"))
		.andExpect(status().isOk())
		.andExpect(content().string("Order Id Not Found"));
	}
	*/

}
