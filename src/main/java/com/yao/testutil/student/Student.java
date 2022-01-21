package com.yao.testutil.student;

public class Student {

	static{System.out.println("Student static block is invoked");}  
	int id ;
	String name;
	static String college = "ITSchool";
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("id = " + id + ", name = " + name);
	}
	
	void changeCollege() {
		college = "non-static change AITSchool";
	}
	static void staticChangeCollege() {
		college = "static change AITSchool";
	}
	
	
	public static String getCollege() {
		return college;
	}


	public static void setCollege(String college) {
		Student.college = college;
	}

}
