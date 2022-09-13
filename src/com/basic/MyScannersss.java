package com.basic;

import java.util.Scanner;

public class MyScannersss {

public static void main(String[] args) {
	System.out.println("Enter your Name:");
    Scanner a=new Scanner(System.in);
    String name= a.next();//String input prints directly using next() in scanner
    System.out.println(name);
	System.out.println("Enter your Father Name:");
    String name1= a.nextLine();//String input comes immediately after next() with entering initial space
    System.out.println(name1);
    System.out.println("My Name is: "+name);
    System.out.println("My Father Name is: "+name1);
    a.close();
}
}
