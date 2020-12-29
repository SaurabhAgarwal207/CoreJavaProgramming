package com.saurabh.basicPrograms;

import java.util.Scanner;

public class ProductDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter price of product");
		Scanner scan = new Scanner(System.in);
		int price = scan.nextInt();
		System.out.println("Enter discount percentage");
		int percent= scan.nextInt();
		double sellprice= price-((double)price*percent/100);
		System.out.println("Selling price is : "+sellprice);
		scan.close();
	}

}
