package com.thoughtworks.exam.handler;

import com.thoughtworks.exam.FizzBuzzWhizz;

/**
 * 如果所报数字包含了第一个特殊数，那么也不能说该数字，而是要说相应的单词，比如本例中第一个特殊数是3，那么要报13的同学应该说Fizz。
 * 如果数字中包含了第一个特殊数，那么忽略规则3和规则4，比如要报35的同学只报Fizz，不报BuzzWhizz。
 * @author zhangsn
 *
 */
public class FizzContainsHandler extends AbstractHandler{
	
	private int standard;

	public FizzContainsHandler(AbstractHandler baseHandler,FizzBuzzWhizz fizzBuzzWhizz) {
		super(baseHandler);
		this.standard = fizzBuzzWhizz.getFirst();
	}

	@Override
	public String handle(int number) {
		if (String.valueOf(number).contains(String.valueOf(standard))){
			return "Fizz";
		}
		return super.getHandler().handle(number);
	}
	
}
