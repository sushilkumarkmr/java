package com.basic;

public class MyConstruct {
	public MyConstruct() {
	System.out.println("Today Cricket Match Between India and South Africa");
	}
	public MyConstruct(int s) {
		System.out.println("Score of Indian Team: "+s);
		}
	public MyConstruct(long t) {
		System.out.println("Score of South Africa Team: "+t);
		}
	public MyConstruct(long s,long t ) {
		System.out.println("Indian Team Won by "+(s-t));
		}
	
	public static void main(String[] args) throws Throwable {
		MyConstruct u=new MyConstruct();
		MyConstruct v=new MyConstruct(189);
		MyConstruct w=new MyConstruct(165);
		MyConstruct y=new MyConstruct(189, 165);
		u.finalize();
		v.finalize();
		w.finalize();
		y.finalize();
	}
}
