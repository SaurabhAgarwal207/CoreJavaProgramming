
package com.saurabh.basicPrograms;

import java.util.Scanner;

/**
 * @author Saurabh Agarwal Dec 27, 2020 Factorial Program Demo
 */
public class FactorialOfNumber {

	/**
	 * @param args
	 */
	static int factorial(int num) {
		int sum = 1;
		for (int i = 2; i <= num; i++) {
			sum = sum * i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number to find out Factorial");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("Factorial of " + num + " is: " + factorial(num));
	}

}
