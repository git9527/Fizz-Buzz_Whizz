package com.thoughtworks.fbw;

import org.junit.Assert;
import org.junit.Test;

import com.thoughtworks.exam.FizzBuzzWhizz;

public class TestInit {

	@Test(expected = RuntimeException.class)
	public void test_check_range(){
		new FizzBuzzWhizz(7, 5, 0);
	}
	
	@Test
	public void test_fizz_buzz(){
		Assert.assertEquals(35, new FizzBuzzWhizz(7, 5, 9).getFizzBuzz());
		Assert.assertEquals(12, new FizzBuzzWhizz(4, 6, 9).getFizzBuzz());
		Assert.assertEquals(4, new FizzBuzzWhizz(4, 2, 9).getFizzBuzz());
	}
	
	@Test
	public void test_fizz_buzz_whizz(){
		Assert.assertEquals(315, new FizzBuzzWhizz(7, 5, 9).getFizzBuzzWhizz());
		Assert.assertEquals(36, new FizzBuzzWhizz(4, 6, 9).getFizzBuzzWhizz());
		Assert.assertEquals(36, new FizzBuzzWhizz(4, 2, 9).getFizzBuzzWhizz());
	}
}
