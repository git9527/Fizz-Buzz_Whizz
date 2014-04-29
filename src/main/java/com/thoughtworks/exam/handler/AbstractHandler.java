package com.thoughtworks.exam.handler;


public abstract class AbstractHandler {

	private AbstractHandler baseHandler;
	
	public AbstractHandler(AbstractHandler baseHandler){
		this.baseHandler = baseHandler;
	}
	
	public abstract String handle(int number);
	
	protected AbstractHandler getHandler() {
		return this.baseHandler;
	}
	
}
