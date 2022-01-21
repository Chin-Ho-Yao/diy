package com.yao.codility.easy.Triangle;

import java.util.Arrays;

public class Triangle {


	public static void main(String[] args) {
		int[] A = { 2, 1, 2, 2, 1, 2, 3, 1, 4, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE };
		System.out.println("answer : " + Triangle.solution(A));
	}

	public static int solution(int[] A) {

	        //符合兩邊和大於第三邊就可以是三角形
	        Arrays.sort(A);
	        for (int i = 0; i < A.length-2; i++) {
	        	//100%缺轉型成Long
	        	if (Long.valueOf(A[i])+Long.valueOf(A[i+1])>A[i+2]) {
					return 1;
				}
			}
	        return 0;
	}
	//93%
//	public static int solution(int[] A) {
//		
//		//符合兩邊和大於第三邊就可以是三角形
//		Arrays.sort(A);
//		for (int i = 0; i < A.length-2; i++) {
//			
//			if (A[i]+A[i+1]>A[i+2]) {
//				return 1;
//			}
//		}
//		return 0;
//	}




}
