package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPriority {

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");	
	}
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority = 0)
	public void test2()
	{
		System.out.println("test 2");
	}
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("test 3");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
}
