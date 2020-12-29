/**********
 * Author: Saurabh Agarwal
 * Date: 27-Dec-2020
 * Program for Area of triangle
 */
package com.saurabh.basicPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int base, height;
		double area;
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Please Enter base value ");
		base = scan.nextInt();
		System.out.println("Enter height");
		height = scan.nextInt();
		area = ((double) (base * height) / 2);
		System.out.println("Area of triangle is : " + df.format(area));
		scan.close();
	}

}
