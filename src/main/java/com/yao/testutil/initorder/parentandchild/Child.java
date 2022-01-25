package com.yao.testutil.initorder.parentandchild;
//父類Static->子類static->父類預設{}->父類建構函式->子類預設{}->子類建構函式
public class Child extends Parent{
	static {System.out.println("static Child  1");}
	
	private static String num1 = Log.initialLog("static Child num1");

	static {System.out.println("static Child static 2");}
	
	{System.out.println("non-static Child ");}
	
	public Child() {
		System.out.println("Child Constructor");
	}
	
	public void Hello() {
		System.out.println("non-static Child Hello");
	}
	
	public static void StaticHello() {
		System.out.println("static Child Hello");
	}
	
	public static void main(String[] args) {
//		Child child = new Child();
		new Child().Hello();
		Child.StaticHello();
		
	}
}
