package com.thoughtworks.exam.handler;

import com.thoughtworks.exam.FizzBuzzWhizz;

/**
 * 如第二个特殊数和第三个特殊数的倍数，那么不能说该数字，而是要说FizzBuzz
 * @author zhangsn
 *
 */
public class BuzzWhizzHandler extends AbstractHandler {

	private FizzBuzzWhizz fizzBuzzWhizz;

	public BuzzWhizzHandler(AbstractHandler baseHandler, FizzBuzzWhizz fizzBuzzWhizz) {
		super(baseHandler);
		this.fizzBuzzWhizz = fizzBuzzWhizz;
	}

	@Override
	public String handle(int number) {
		if (number % fizzBuzzWhizz.getBuzzWhizz() == 0) {
			return "BuzzWhizz";
		}
		return super.getHandler().handle(number);
	}

}
