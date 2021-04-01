package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		System.out.println("plus="+plus(128));
	}

	public static int plus(int n) {
		int count = 1;
		n %=10;
		System.out.println("(1)"+n);
		n %=10;
		System.out.println("(1)"+n);
		System.out.println("(1)"+128%10%10);
		
		n /=2;
		System.out.println("(2)"+n);
		n /=2;
		System.out.println("(2)"+n);
		return count;
	}

}
