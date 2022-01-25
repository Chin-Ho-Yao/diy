package com.yao.classcastdemo.monitor;

public class MyMonitorUpperCase {

	public static void main(String[] args) {
		new MyMonitorUpperCase().run(new LCD());
		new MyMonitorUpperCase().run(new CRT());
		new MyMonitorUpperCase().run(new Plasma());
	}
	public void run(Monitor monitor) {
		monitor.displayText();
		monitor.displayGraphics();
	}
	

}

class Monitor {
	public void displayText() {
		
	}
	public void displayGraphics() {
		
	}
}

class LCD extends Monitor{
	public void displayText() {
		System.out.println("LCD displayText");
	}
	public void displayGraphics() {
		System.out.println("LCD displayGraphics");
		//teset
	}
}

class CRT extends Monitor{
	public void displayText() {
		System.out.println("CRT displayText");
	}
	public void displayGraphics() {
		System.out.println("CRT displayGraphics");
		
	}
}

class Plasma extends Monitor{
	public void displayText() {
		System.out.println("Plasma displayText");
	}
	public void displayGraphics() {
		System.out.println("Plasma displayGraphics");
		
	}
}

