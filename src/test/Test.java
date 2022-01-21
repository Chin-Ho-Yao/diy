package test;

import java.util.HashMap;
import java.util.Hashtable;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {

	private static final Logger log = Logger.getLogger(Test.class);



	public static void main(String[] args) {
		BasicConfigurator.configure();

		log.debug(" - VVVVV - main - XXXXX - ");
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
			log.debug("" + e);
			System.out.println("-------7-----");
			log.debug("",e);

		}
		log.debug(" - _____ - main - XXXXX - ");


	}

}
