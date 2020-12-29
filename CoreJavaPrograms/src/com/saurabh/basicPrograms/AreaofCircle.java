/******************
 * author: Saurabh Agarwal 
 * Date: 27-Dec-2020
 * Program to find Area of Circle taking radius vale as 
 * input and showing output area up to 3 decimal places.
 */
package com.saurabh.basicPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Please enter radius");
		Scanner scan = new Scanner(System.in);
		radius = scan.nextInt();
		area =  ((double)(22 * radius * radius) / 7);
		System.out.println("Area of Circle is :" + df.format(area));
		scan.close();
	}

}
