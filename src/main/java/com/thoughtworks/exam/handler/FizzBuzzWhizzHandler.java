package com.thoughtworks.exam.handler;

import com.thoughtworks.exam.FizzBuzzWhizz;

/**
 * 同时是三个特殊数的倍数，那么要说FizzBuzzWhizz
 * @author zhangsn
 *
 */
public class FizzBuzzWhizzHandler extends AbstractHandler {

	private FizzBuzzWhizz fizzBuzzWhizz;

	public FizzBuzzWhizzHandler(AbstractHandler baseHandler, FizzBuzzWhizz fizzBuzzWhizz) {
		super(baseHandler);
		this.fizzBuzzWhizz = fizzBuzzWhizz;
	}

	@Override
	public String handle(int number) {
		if (number % fizzBuzzWhizz.getFizzBuzzWhizz() == 0) {
			return "FizzBuzzWhizz";
		}
		return super.getHandler().handle(number);
	}

}
