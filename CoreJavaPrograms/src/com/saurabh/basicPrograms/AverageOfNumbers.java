package com.saurabh.basicPrograms;

import java.util.Scanner;

/**
 * @author Saurabh Agarwal Dec 27, 2020
 * Program for Average of Numbers
 */
public class AverageOfNumbers {

	static double average(int[] num) {
		int sum = 0;
		double avg;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}
		avg = ((double) sum / num.length);
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number of Elements");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int avgArray[] = new int[num];
		System.out.println("Enter all values");
		for (int i = 0; i < num; i++)
			avgArray[i] = scan.nextInt();
		System.out.println("Average of numbers is: " + average(avgArray));

	}

}
