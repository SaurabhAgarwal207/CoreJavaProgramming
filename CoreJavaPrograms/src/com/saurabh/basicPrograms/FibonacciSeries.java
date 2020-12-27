
package com.saurabh.basicPrograms;

import java.util.Scanner;

/**
 * @author Saurabh Agarwal Dec 27, 2020 Program for Fibonacci Series
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total number for which you want Fibonacci Series");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a = 0;
		int b = 1, sum = 0;
		System.out.println("Fibbonacci Series is");
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < num; i++) {
			sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
		}
		scan.close();
	}

}
