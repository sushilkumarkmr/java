package com.basic;

public class MyInterface3 implements MyInterface, MyInterface1  {
	@Override
	public void getSubject() {
	System.out.println("Name of subject is Biology");
		
	}
	@Override
	public void getSubject2() {
		System.out.println("Biology is combination of Botany and Zoology");
		
	}
	@Override
	public void getSubject3() {
		System.out.println("Botany is studies of plants");
		
	}
	@Override
	public void getSubject4() {
		System.out.println("Zoology is studies of animals and human");
		
	}
	public static void main(String[] args) {
		MyInterface3 d=new MyInterface3();
	d.getSubject();
	d.getSubject2();
	d.getSubject3();
	d.getSubject4();
    }
}
