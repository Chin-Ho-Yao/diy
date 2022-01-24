package com.yao.codility.easy.PassingCars;

public class PassingCars {

	public static void main(String[] args) {
		int[] A = {0,1,0,1,1}; 
		System.out.println(PassingCars.solution(A));
	}
	//TODO 
	//第一個遇到零，往後還沒遇到0之前遇到每個1都是+1
	//遇到第二個0之後遇到每個1都是+2
	//以此類推直到結束
	public static int solution(int[] A) {
		int pairs = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				System.out.println("i : " + i);
				for (int j = i+1; j < A.length; j++) {
					if (A[j] == 1) {
						System.out.println("j : " + j);
						pairs ++;
					}
				}
			}
		}
		if (pairs > 1000000000) {
			return -1;
		}else {
			return pairs;
		}
	}
	//50% timeout
//	public static int solution(int[] A) {
//		int pairs = 0;
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] == 0) {
//				System.out.println("i : " + i);
//				for (int j = i+1; j < A.length; j++) {
//					if (A[j] == 1) {
//						System.out.println("j : " + j);
//						pairs ++;
//					}
//				}
//			}
//		}
//		if (pairs > 1000000000) {
//			return -1;
//		}else {
//			return pairs;
//		}
//	}


}
