package com.saurabh.basicPrograms;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,pow,result=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		num= scan.nextInt();
		System.out.println("Enter power");
		pow= scan.nextInt();
		if(num>=0 && pow==0)
			result=1;
		else if(num==0 && pow>=1)
			result=0;
		else {
			for(int i=1;i<=pow;i++)
				result=result*num;			
		}
		System.out.println("Value of "+num+" to power of "+pow+" is :"+result);
		scan.close();
	}

}
