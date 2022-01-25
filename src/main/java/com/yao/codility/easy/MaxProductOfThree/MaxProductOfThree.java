package com.yao.codility.easy.MaxProductOfThree;



import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		int[] A = { 2, 1, 2, 2, 1, 2, 3, 1, 4, 4 };
		System.out.println("answer : " + MaxProductOfThree.solution(A));
	}

	public static int solution(int[] A) {
		 int result = 0;

	        //撈出正最大三個，負最大三個，負如果只有一個就不考慮負值 > 這樣太複雜	ㄆ
	        Arrays.sort(A);
	        
			 int product1 = A[A.length-1]*A[A.length-2]*A[A.length-3];
			 int product2 = A[0]*A[1]*A[A.length-1];
	        
	        return  Math.max(product1, product2);
	}



}
