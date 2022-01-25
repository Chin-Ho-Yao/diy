package com.yao.codility.easy.Dominator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DominatorTest {

	@Test
	void testMain() {
		Dominator dominator = new Dominator();
		int[] A = {3,4,3,2,3,-1,3,3} ;

		int result = dominator.solution(A);
		
		assertEquals(0, result);
		
		//TODO 測試N is an integer within the range [0..100,000];
		//TODO each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
		//TODO 100個loop
		
		for (int i = 0; i < 100; i++) {
			int[] B = new int[(int) Math.round((Math.random()*100001))];//var array B in length 0~100000 randomly
			for (int j = 0; j < B.length; j++) {
				if (j == 0) {
					B[j] = Integer.MIN_VALUE;
					continue;
				}
				B[j] = (int) Math.round((Math.random()*2147483647));//var an integer within the range [−2,147,483,648..2,147,483,647]

			}
			//FIXME 印出來看看
//			System.out.println("B[j]  : [ ");
//			for (int j : B) {
//				System.out.println(j+", ");
//
//			}
//			System.out.println(" ]");
			
			int result2 = dominator.solution(B);
			System.out.println("B[B.length/2] : " + B[B.length/2]);
			System.out.println("result2 : " + result2);
			assertEquals(B[B.length/2], result2);
		}
		

		
		
	}

}
