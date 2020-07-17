package com.cg.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.main.dao.CancleOrderDao;
import com.cg.main.service.orderInformationService;



@RestController
public class orderInformationController {

	
	@Autowired
	orderInformationService service;
	
	@GetMapping("/DemoTest")
	public ResponseEntity<String> Demo()    {
		
			
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
	
	
	@GetMapping("/CancleOrder/{orderId}")
	public ResponseEntity<String> DepositSlip(@PathVariable int orderId)  {
		String result="Order Id Not Found";
		if(service.findOrderById(orderId))
		{
			
			result=service.cancleOrder(orderId);
			return new ResponseEntity<String>(result,HttpStatus.OK);
			 
		}
		else
			return new ResponseEntity<String>(result,HttpStatus.OK);
		
		
	}
}
