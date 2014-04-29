package com.thoughtworks.exam;

/**
 * @author zhangsn
 * 
 */
public class FizzBuzzWhizz {

	private int a;

	private int b;

	private int c;

	/**
	 * a,b的最小公倍数
	 */
	private int fizzBuzz;

	/**
	 * b,c的最小公倍数
	 */
	private int buzzWhizz;

	/**
	 * a,c的最小公倍数
	 */
	private int fizzWhizz;

	/**
	 * a,b,c的最小公倍数
	 */
	private int fizzBuzzWhizz;

	public FizzBuzzWhizz(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.checkRange();
		this.initFizzBuzzWhizz();
	}

	private void initFizzBuzzWhizz() {
		int fbDivisor = this.getCommonDivisor(b, a);
		this.fizzBuzz = a * b / fbDivisor;
		int bwDivisor = this.getCommonDivisor(b, c);
		this.buzzWhizz = b * c / bwDivisor;
		int fwDivisor = this.getCommonDivisor(a, c);
		this.fizzWhizz = a * c / fwDivisor;
		int fbwDivisor = this.getCommonDivisor(fizzBuzz, c);
		this.fizzBuzzWhizz = fizzBuzz * c / fbwDivisor;
	}

	private int getCommonDivisor(int m, int n) {
		while (true) {
			if ((m = m % n) == 0)
				return n;
			if ((n = n % m) == 0)
				return m;
		}
	}

	private void checkRange() {
		if (a == b)
			throw new RuntimeException("the first number{" + a + "} should not equals to second number{" + b + "}");
		if (a == c)
			throw new RuntimeException("the first number{" + a + "} should not equals to third number{" + c + "}");
		if (b == c)
			throw new RuntimeException("the second number{" + b + "} should not equals to third number{" + c + "}");
		if (0 >= a || a >= 10)
			throw new RuntimeException("the first number{" + a + "} should between 1 and 9");
		if (0 >= b || b >= 10)
			throw new RuntimeException("the second number{" + b + "} should between 1 and 9");
		if (0 >= c || c >= 10)
			throw new RuntimeException("the third number {" + c + "}should between 1 and 9");
	}

	public int getFirst() {
		return a;
	}

	public int getSecond() {
		return b;
	}

	public int getThird() {
		return c;
	}

	public int getFizzBuzz() {
		return fizzBuzz;
	}
	
	public int getBuzzWhizz(){
		return buzzWhizz;
	}
	
	public int getFizzWhizz(){
		return fizzWhizz;
	}

	public int getFizzBuzzWhizz() {
		return fizzBuzzWhizz;
	}

}
