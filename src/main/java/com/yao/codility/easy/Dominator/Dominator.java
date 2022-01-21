package com.yao.codility.easy.Dominator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Dominator {
	public static void main(String[] args) {
		int[] A = {3,4,3,2,3,-1,3,3} ;
		for (int i : A) {
			System.out.println(i + ", ");
		}
		
		
		
//		int[] B = new int[5];
//		System.out.println(B.length);
		//var array B in length 0~100000 randomly
//		for (int i = 0; i < 100; i++) {
//			
//			System.out.println(Math.round((Math.random()*100001)));
//		}
		
		//var an integer within the range [−2,147,483,648..2,147,483,647]
//		for (int i = 0; i < 100; i++) {
//			
//			System.out.println(Math.round((Math.random()*2147483647)));
//		}
//		int element = Integer.MIN_VALUE;
		
		
		
//		for (int i = 0; i < 100; i++) {
			int[] B = new int[(int) Math.round((Math.random()*100001))];//var array B in length 0~100000 randomly
			System.out.println("B.length : " + B.length);
			
			
			System.out.println("B : [ ");

			for (int j = 0; j < B.length; j++) {
				System.out.println("------------------------------------------Loop : " + j);

				if (j == 0) {
					B[j] = Integer.MIN_VALUE;
					continue;
				}
				B[j] = (int) Math.round((Math.random()*2147483647));//var an integer within the range [−2,147,483,648..2,147,483,647]
				System.out.println("B[j] : " + B[j]);

			}
			System.out.println(" ]");

			//FIXME 印出來看看
			System.out.println("B[j]  : [ ");
			for (int j : B) {
				System.out.println(j+", ");

			}
			System.out.println(" ]");
			
			System.out.println("B[B.length/2] : " + B[B.length/2]);
//		}
		
		
//		System.out.println(1/2);
//		System.out.println("result :"  +new Dominator().solution(A));
	}
	public int solution(int[] A) {
		int result = 0;


		if (A.length == 0) {
			return -1;
		}
//		System.out.println("A.length/2 : " + A.length/2);

		int dominator = A[A.length/2];
		
//		System.out.println("dominator : " + dominator);
		for (int i = 0; i <= A.length/2; i++) {
//			System.out.println("--------------------------------Loop : "+ i);
			if (A[i] == dominator) {
				result = A[i];
				return i;
			}
		}
		if (result == 0) {
			return A.length/2 + 1;
		}
		
		
		return result;
	}


}
