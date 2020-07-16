package com.capgemini.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.main.dao.CancleOrderDao;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTesting {
	
	@Autowired
	CancleOrderDao cancleDao;
	
	/*
	@Test
	public void checkOrderNotExist()
	{
		boolean expectedValue=false;
		boolean actualValue=cancleDao.findOrder(100);
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	public void checkOrderExist()
	{
		boolean expectedValue=true;
		boolean actualValue=cancleDao.findOrder(100);
		assertEquals(expectedValue,actualValue);
	}
	*/
	
	
	
	
	
	

}
