package com.yao.codility.easy.CyclicRotation;


public class CyclicRotation {

	public static void main(String[] args) {
		int input = 805306373  ;
//		int[] inputArray = {3,8,9,7,6};
//		int[] inputArray = {0, 0, 0};
		int[] inputArray = {1, 2, 3, 4};
		System.out.println(CyclicRotation.solution(inputArray,4));
	}
	public static int[] solution(int[] A, int K) {
		int[] resultArray = new int[A.length];
		
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[(i+A.length+K)%A.length] = A[i];
		}
		
		for (int i : A) {
			System.out.print(","+i);
		}
		System.out.println();
		for (int i : resultArray) {
			System.out.print(","+i);
		}
		return resultArray;
	}
	
	

}
