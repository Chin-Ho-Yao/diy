package com.yao.testutil.initorder.parentandchild;

public class Parent {

	public Parent() {
		System.out.println("Parent Constructor");
	}
	
	static {System.out.println("static Parent  1");}
	
	private static String num1 = Log.initialLog("static Parent num1");
	
	{System.out.println("non-static Parent ");}
	
	
	static {System.out.println("static Parent static 2");}
	
	public void Hello() {
		System.out.println("Parent Hello");
	}
}
