package com.basic;

public class MyType_Castingg {
public static void main(String[] args) {
	int a=127;
	long c=a;
	System.out.println(c);//widening casting 1
	byte b=6;
	long d=b;
	System.out.println(d);//widening casting 2
	int e=(int)c;
	System.out.println(e);//narrowing casting 1
	
}
}
