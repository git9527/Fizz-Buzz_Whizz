package com.thoughtworks.exam.handler;

import com.thoughtworks.exam.FizzBuzzWhizz;

/**
 * 如第一个特殊数和第三个特殊数的倍数，那么不能说该数字，而是要说FizzWhizz
 * @author zhangsn
 *
 */
public class FizzWhizzHandler extends AbstractHandler {

	private FizzBuzzWhizz fizzBuzzWhizz;

	public FizzWhizzHandler(AbstractHandler baseHandler, FizzBuzzWhizz fizzBuzzWhizz) {
		super(baseHandler);
		this.fizzBuzzWhizz = fizzBuzzWhizz;
	}

	@Override
	public String handle(int number) {
		if (number % fizzBuzzWhizz.getFizzWhizz() == 0) {
			return "FizzWhizz";
		}
		return super.getHandler().handle(number);
	}

}
