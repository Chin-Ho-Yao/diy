package test;

import java.util.HashMap;
import java.util.Hashtable;


public class Test {




	public static void main(String[] args) {
		try {
			
			int a = 10/0;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.toString();
			System.out.println("-------1-----");
			System.out.println(e.toString());

			
			System.out.println("-------2-----");
			System.out.println(e);
			System.out.println("-------3-----");
			e.printStackTrace();
			System.out.println("-------4-----");
			System.out.println(e.getClass());
			System.out.println("-------5-----");
			System.out.println(e.getMessage());
			System.out.println("-------6-----");
			System.out.println("-------7-----");

		}


	}

}
