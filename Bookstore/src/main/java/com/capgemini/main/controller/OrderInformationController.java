package com.capgemini.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.main.service.CancleOrderService;




@RestController
public class OrderInformationController {
	
	
	@Autowired
	CancleOrderService cancleOrderService;
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "Hello";
	}

	
	@GetMapping("/CancleOrder/{orderId}")
	public ResponseEntity<String> DepositSlip(@PathVariable int orderId)  {
		String result="Order Id Not Found";
		if(cancleOrderService.findOrderById(orderId))
		{
			
			result=cancleOrderService.cancleOrder(orderId);
			return new ResponseEntity<String>(result,HttpStatus.OK);
			 
		}
		else
			return new ResponseEntity<String>(result,HttpStatus.OK);
		
		
	}
	
	
}
