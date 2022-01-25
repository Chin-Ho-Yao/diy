package com.yao.testutil.student;

public class TestStaticMethod {
	  static{System.out.println("TestStaticMethod static block is invoked");}  
	public static void main(String[] args) {
		System.out.println(" - VVVVV - main - XXXXX - ");
		Student s1 = new Student(1,"Jack");
		System.out.println("Before change s1.getCollege() : " + s1.getCollege());
		Student s2 = new Student(2,"Jacky");
		System.out.println("Before change s2.getCollege() : " + s2.getCollege());
//		
//		System.out.println("------------static --------------");
//
//		Student.staticChangeCollege();
//		System.out.println("After static change s1.getCollege() :" + s1.getCollege());
//
//		System.out.println("After static change s2.getCollege() :" + s2.getCollege());
//		System.out.println("------------non-static --------------");
//
//		s1.changeCollege();
//		System.out.println("After non-static change s1.getCollege() :" + s1.getCollege());
//		
//		System.out.println("After non-static change s2.getCollege() :" + s2.getCollege());
//		
		System.out.println(" - _____ - main - XXXXX - ");
	}
}
