package com.yao.codility.easy.Distinct;

import java.util.*;

public class Distinct {

	public static void main(String[] args) {
		int[] A = { 2, 1, 2, 2, 1, 2, 3, 1, 4, 4 };
		System.out.println("answer : " + Distinct.solution(A));
	}

	// 傻眼只是找不同職，不是找哪個值只有出現一次，搞錯題目
	public static int solution(int[] A) {
		// write your code in Java SE 8
		Set<Integer> aSet = new HashSet<Integer>();
		for (int a : A) {
			aSet.add(a);
		}
		return aSet.size();
	}
//	//傻眼只是找不同職，不是找哪個值只有出現一次，搞錯題目
//	public static int solution(int[] A) { 
//		HashMap result = new HashMap();
//		for (int i : A) {
//			result.put(i, i);
//		}
//		return result.size();
//	}
//	//16%
//	public static int solution(int[] A) { 
//		if(A.length == 0){
//			return 0 ;
//		}
//		
//		Arrays.sort(A);
//		for (int i : A) {
//			System.out.print(","+i);
//		}
//		System.out.println();
//		int result = A[0];
//		int count = 0;
//		for(int i = 0 ; i < A.length - 1 ; i++){
//			System.out.println("---------------"+i+"-------------- ");
//			System.out.println("A["+i+"] = " + A[i]);
//			
//			count++;
//			
//			if(A[i] < A[i+1]){
//				result ++;
//				System.out.println(i + "result : "+result);
//				System.out.println(i + "count : "+count);
//				if (count == 1) {
//					return result -1 ;
//				}else {
//					count = 0;
//				}
//			}
//			
//			
//		}
//		
//		
//		return result;
//	}

	// 16%

}
