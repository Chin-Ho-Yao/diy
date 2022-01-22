package com.yao.classcastdemo.monitor;

public class MyMonitorNoUpperCase {
	public static void main(String[] args) {
		
		new MyMonitorNoUpperCase().run(new LCD());
		new MyMonitorNoUpperCase().run(new CRT());
		new MyMonitorNoUpperCase().run(new Plasma());
	}

	private void run(Monitor monitor) {
		// TODO Auto-generated method stub
		
	}

	private void run(LCD lcd) {
		// TODO Auto-generated method stub
		lcd.displayText();
		lcd.displayGraphics();
	}

	private void run(CRT crt) {
		// TODO Auto-generated method stub
		crt.displayText();
		crt.displayGraphics();
	}

	private void run(Plasma plasma) {
		// TODO Auto-generated method stub
		plasma.displayText();
		plasma.displayGraphics();
	}
	
	
	
}
