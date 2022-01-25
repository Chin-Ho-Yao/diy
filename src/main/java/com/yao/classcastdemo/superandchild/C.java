package com.yao.classcastdemo.superandchild;

public class C {
	public static void main(String[] args) {
		//the child function will override the superclass which has same name of function
		A a1 = new B();
		a1.a1(); 
//		a1.a2();//這邊會遺失B的a2()，因為向上轉型了A本來就沒有a2()
		B a2 = new B();
		a2.a1();
		a2.a2();//這邊就存在B的a2()
		
	}
}

class A {
	public void a1() {
		System.out.println("super class");
	}

}

class B extends A{
	public void a1() {
		System.out.println("a1 child class");
	}
	public void a2() {
		System.out.println("a2 child class");
	}
	
}
