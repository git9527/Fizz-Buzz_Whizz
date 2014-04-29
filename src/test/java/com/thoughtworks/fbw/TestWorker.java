package com.thoughtworks.fbw;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.thoughtworks.exam.NumberWorker;

public class TestWorker {

	@Test
	public void test_print_to_100() {
		NumberWorker worker = new NumberWorker(3, 7, 5);
		List<String> list = worker.getNumbers();
		for (int i = 1; i <= list.size(); i++) {
			System.out.println(i + ":" + list.get(i - 1));
		}
	}

	@Test
	public void test_single_number() {
		NumberWorker worker = new NumberWorker(3, 5, 7);
		Assert.assertEquals(45, worker.getNumber(45));
	}
}
