package com.basic;

public class MyAbstract2 extends MyAbstractinnn{

	@Override
	public void abstmethod() {
		String c="Jaya Arts College";
		System.out.println("Name of College: "+c);	
	}
	@Override
	public void abstmethod2() {
		String d="Bachelor of Science";
		System.out.println("Degree joined: "+d);
	}
@Override
public void student() {
	super.student();
}
@Override
public void student1() {
	super.student1();
}
public static void main(String[] args) {
	MyAbstract2 s=new MyAbstract2();
	s.student();
	s.student1();
	s.abstmethod();
	s.abstmethod2();
}
}
