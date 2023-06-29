package com.soft;

public class Factorialtest {

	public int findFactorial(int number) {

		int fact = 1;

		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
