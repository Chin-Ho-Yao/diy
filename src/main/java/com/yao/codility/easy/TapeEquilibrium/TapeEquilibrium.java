package com.yao.codility.easy.TapeEquilibrium;

import java.util.HashSet;
import java.util.Set;


public class TapeEquilibrium {


	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4, 3}; 
		System.out.println(TapeEquilibrium.solution(A));
	}
	public static int solution(int[] A) {
		//100% https://github.com/karimhamdanali/codility/blob/master/src/codility/TapeEquilibrium.java
		int sumA = 0;
		
		for (int i : A) {
			sumA += i;
		}
		System.out.println("sumA : " + sumA);

		int sumBefore = 0;
		int sumAfter = 0;
		int minDiff = Integer.MAX_VALUE;
		
		for (int i = 1; i < A.length; i++) {
			sumBefore += A[i-1];
			sumAfter = sumA - sumBefore;
			minDiff = Math.min(minDiff, Math.abs(sumBefore-sumAfter));
			System.out.println(i + ": sum : " + sumBefore);
			System.out.println(i + ": minDiff : " + minDiff);
		}

		return minDiff;
	}
	// fail
//	public static int solution(int[] A) {
//		//100% reference to https://medium.com/@bob800530/codility-ch3-permmissingelem%E8%A7%A3%E6%B3%95-9d0c1df89e0c
//		int sum = 0;
//		int sumA = 0;
//		
//		Set<Integer> tapeGaps = new HashSet<Integer>();
//		for (int i : A) {
//			sumA += i;
//		}
//		System.out.println("sumA : " + sumA);
//		
//		for (int i = 0; i < A.length-1; i++) {
//			sum += A[i];
//			tapeGaps.add(sumA - sum);
//			System.out.println("sum : " + sum);
//			System.out.println("sumA - sum : " + (sumA - sum));
//		}
//		int minGap = sum;
//		
//		for (Integer tapeGap : tapeGaps) {
//			System.out.println("tapeGap : " + tapeGap);
//			System.out.println("minGap : " + minGap);
//			if (minGap >= tapeGap) {
//				minGap = tapeGap;
//			}
//		}
//		
//		return minGap;
//	}




}
