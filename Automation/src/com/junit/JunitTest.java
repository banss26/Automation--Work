package com.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTest {
	
	@BeforeClass
	public  static void Beforeclass()
	{
		System.out.println("Beforeclass test");
	}

@Before
	public void before()
	{
		System.out.println("before test");
	}
	@Test
	public void test1() {
		System.out.println("this is test1");
	}
	@Test
	@Ignore
	public void test2() {
		System.out.println("this is test2");
	}
	
	@After
	public void After()
	{
		System.out.println("After test");
	}
	@AfterClass
	public static void Afterclass()
	{
		System.out.println("Afterclass test");
	}
}
