package com.capgemini.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class OrderInformationController {
	
	
	@GetMapping("/hi")
	public String helloWorld()
	{
		return "Hello";
	}

	
	/*@GetMapping("/CancleOrder/{OrderId}")
	public ResponseEntity<String> DepositSlip(@PathVariable long accountNumber)   {
		if(findOrderId()=="True")
		{
			//continue 
			  return new ResponseEntity<String>//order details.
			 
		}
		else
		throw new UserException("Order not Exists");
		
		
	}*/
}
