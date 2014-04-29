package com.thoughtworks.exam.handler;

import com.thoughtworks.exam.FizzBuzzWhizz;

/**
 * 如果所报数字是第三个特殊数（7）的倍数，那么要说Whizz
 * @author zhangsn
 *
 */
public class WhizzHandler extends AbstractHandler {

	private int standard;

	public WhizzHandler(AbstractHandler baseHandler, FizzBuzzWhizz fizzBuzzWhizz) {
		super(baseHandler);
		this.standard = fizzBuzzWhizz.getThird();
	}

	@Override
	public String handle(int number) {
		if (number % standard == 0) {
			return "Whizz";
		}
		return super.getHandler().handle(number);
	}

}
