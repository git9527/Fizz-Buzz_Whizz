package com.thoughtworks.exam.handler;

import com.thoughtworks.exam.FizzBuzzWhizz;

/**
 * 如果所报数字是第二个特殊数（5）的倍数，那么要说Buzz
 * @author zhangsn
 */
public class BuzzHandler extends AbstractHandler {

	private int standard;

	public BuzzHandler(AbstractHandler baseHandler, FizzBuzzWhizz fizzBuzzWhizz) {
		super(baseHandler);
		this.standard = fizzBuzzWhizz.getSecond();
	}

	@Override
	public String handle(int number) {
		if (number % standard == 0) {
			return "Buzz";
		}
		return super.getHandler().handle(number);
	}

}
