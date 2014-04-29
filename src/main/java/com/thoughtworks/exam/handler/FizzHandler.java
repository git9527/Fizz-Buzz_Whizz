package com.thoughtworks.exam.handler;

import com.thoughtworks.exam.FizzBuzzWhizz;

/**
 * 如果所报数字是第一个特殊数（3）的倍数，那么不能说该数字，而要说Fizz
 * @author zhangsn
 *
 */
public class FizzHandler extends AbstractHandler {

	private int standard;

	public FizzHandler(AbstractHandler baseHandler, FizzBuzzWhizz fizzBuzzWhizz) {
		super(baseHandler);
		this.standard = fizzBuzzWhizz.getFirst();
	}

	@Override
	public String handle(int number) {
		if (number % standard == 0) {
			return "Fizz";
		}
		return super.getHandler().handle(number);
	}

}
