package com.thoughtworks.exam.handler;

public class NormalHandler extends AbstractHandler {

	public NormalHandler() {
		super(null);
	}

	@Override
	public String handle(int number) {
		return String.valueOf(number);
	}

}
