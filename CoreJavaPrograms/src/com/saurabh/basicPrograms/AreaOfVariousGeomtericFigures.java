/************
 * Author : Saurabh Agarwal
 *  Date: 27-Dec-2020
 *  Program for calculating area's of different geometric figures
 */
package com.saurabh.basicPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfVariousGeomtericFigures {

	static double areaofRectangle(int l, int b) {
		return ((double) l * b);
	}

	static double areaOfIsoceles(int a, int b) {
		return ((double) (b / 4 * Math.sqrt((4 * a * a) - (b * b))));
	}

	static double areaOfParallelogram(double h, double b) {
		return (h*b);
	}

	static double areaOfRohmbus(double d1, double d2) {

		return ((d1*d2)/2);
		
	}

	static double areaOfEquilateral(int s) {

		return (( Math.sqrt(3)/4)* (s*s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************");
		System.out.println("1." + "Area of Rectangle");
		System.out.println("2." + "Area of Isoceles triangle");
		System.out.println("3." + "Area of Parellelogram");
		System.out.println("4." + "Area of Rhombus");
		System.out.println("5." + "Area of Equilateral triangle");
		System.out.println("****************");
		System.out.println("Please select Geometric Figure to calculate area");
		Scanner scan = new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("#.###");
		int number = scan.nextInt();

		switch (number) {
		case 1:
			int l, b;
			System.out.println("Enter length");
			l = scan.nextInt();
			System.out.println("Enter breadth");
			b = scan.nextInt();
			System.out.println("Area of Rectangle is :" + areaofRectangle(l, b));
			break;
		case 2:
			int s1, s2;
			System.out.println("Enter lenth of side1");
			s1 = scan.nextInt();
			System.out.println("Enter lenth of side2");
			s2 = scan.nextInt();
			System.out.println("Area of Isoceles traingle is: " + df.format(areaOfIsoceles(s1, s2)));
			break;
		case 3:
			//area of Parallelogram
			double breadth,height;
			System.out.println("Enter height");
			height= scan.nextDouble();
			System.out.println("Enter Breadth");
			breadth=scan.nextDouble();
			System.out.println("area of Parallelogram is: "+ areaOfParallelogram(height,breadth));
			break;
		case 4:
			//are of rohmbus
			double diagonal1,diagonal2;
			System.out.println("Enter length of Diagonal1");
			diagonal1= scan.nextDouble();
			System.out.println("Enter length of Diagonal2");
			diagonal2=scan.nextDouble();
			System.out.println("Area of Rohmbus is : "+areaOfRohmbus(diagonal1, diagonal2));
			break;
		case 5:
			//area of equilateral 
			int side;
			System.out.println("Enter length of side");
			side=scan.nextInt();
			System.out.println("Area of Equilateral trainagle is :"+df.format(areaOfEquilateral(side)));
			break;
		default:
			System.out.println("Please enter a valid value");
			break;
			
		}
		scan.close();
	}

}
