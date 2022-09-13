package com.basic;

import java.util.Scanner;

public class MyArmsNum2 {
public static void main(String[] args) {
	int b,c=0,temp;
	System.out.println("Enter your Number :");
    Scanner a=new Scanner(System.in);
    int arm= a.nextInt();
    temp=arm;
    while (arm>0) {
    	b=arm%10;
    	c=c+(b*b*b);
    	arm=arm/10;
    }
    if (c==temp) {
    	System.out.println("You have a entered a Armstrong Number: "+c);
    }
    else {
    	System.out.println("Sorry This is wrong entry");
    }
    a.close();
}
}
