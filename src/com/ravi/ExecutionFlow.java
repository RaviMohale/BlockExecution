package com.ravi;

public class ExecutionFlow {
	static int a = 10;
	int b = 20;

	
	 public ExecutionFlow() {
		System.out.println(" Constructor is Executing");
	}

	{
		System.out.println("Instance block is executing..");
		System.out.println(a);
		System.out.println(b);
	}
	static {
		System.out.println("Static block is executing...");
		System.out.println(a);
		//System.out.println(b);// we can not access instance variable in static block
	}

	void m1() {
		System.out.println("m1 instance method executing");
		System.out.println(a);
	}
	
	static void m2() {
		System.out.println("m2 static method");
		//System.out.println(b);
	}

	public static void main(String[] args) {
		ExecutionFlow ex = new ExecutionFlow();
		ex.m1();
		m2();
	}

}
