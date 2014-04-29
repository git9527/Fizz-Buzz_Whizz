package com.thoughtworks.exam.handler;

import com.thoughtworks.exam.FizzBuzzWhizz;

/**
 * 如第一个特殊数和第二个特殊数的倍数，那么不能说该数字，而是要说FizzBuzz
 * @author zhangsn
 *
 */
public class FizzBuzzHandler extends AbstractHandler {

	private FizzBuzzWhizz fizzBuzzWhizz;

	public FizzBuzzHandler(AbstractHandler baseHandler, FizzBuzzWhizz fizzBuzzWhizz) {
		super(baseHandler);
		this.fizzBuzzWhizz = fizzBuzzWhizz;
	}

	@Override
	public String handle(int number) {
		if (number % fizzBuzzWhizz.getFizzBuzz() == 0) {
			return "FizzBuzz";
		}
		return super.getHandler().handle(number);
	}

}
