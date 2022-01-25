package com.yao.classcastdemo.downcast;

public class C {
	public static void main(String[] args) {
		A a1 = new A();
		a1.aMethmod();//自己沒問題
		System.out.println("---------------------------------------1");
		A a2 = new B(); 
		a2.aMethmod();//B向上轉型成A所以B獨有的方法都遺失了
		
		System.out.println("---------------------------------------2");
		B b1 = new B(); //自己沒問題
		b1.aMethmod();
		b1.bMethod1();
		b1.bMethod2();
		System.out.println("---------------------------------------3");
		
		A a3 = new A(); //向下轉型編譯可以過，但執行會出錯
		if (a3 instanceof B) {
			B b2 = (B)a3;
			b2.aMethmod();
			b2.bMethod1();
			b2.bMethod2();
		}
		
	}
}

class A {
	void aMethmod() {
		System.out.println("A method");
	}

}

class B extends A{
	void bMethod1() {
		System.out.println("B method1");
		
	}
	void bMethod2() {
		System.out.println("B method2");
		
	}
}
