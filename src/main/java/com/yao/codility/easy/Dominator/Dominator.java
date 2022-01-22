package com.yao.codility.easy.Dominator;

import java.util.HashMap;
import java.util.Map;

import com.yao.testutil.lambda.MathSum;

public class Dominator {
	public static void main(String[] args) {
		int[] A = {3,4,3,2,3,-1,3,3} ;
		for (int i : A) {
			System.out.println(i + ", ");
		}
	}
	
	//https://github.com/Mickey0521/Codility/blob/master/Dominator.java
    public int solution(int[] A) {

    	//1.use map to count each element 
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			}else {
				map.put(A[i], 1);
			}
		}
    	
    	//2.find max count and the dominator
    	int maxCount = 0;
    	int dominator = 0;
    	for (int key : map.keySet()) {
			if (maxCount < map.get(key)) {
				maxCount = map.get(key);
				dominator = key;
			}
		}
    	
    	if (maxCount > A.length/2) {
		}else {
	    	return -1;
		}
    	
    	for (int i = 0; i < A.length; i++) {
			
    		if (dominator == A[i]) {
    			return i;
    		}
		}
    	return -1;
       
    }
	
//	
//	//50%
//	public int solution(int[] A) {
//		int result = 0;
//
//
//		if (A.length == 0) {
//			return -1;
//		}
////		System.out.println("A.length/2 : " + A.length/2);
//
//		int dominator = A[A.length/2];
//		
////		System.out.println("dominator : " + dominator);
//		for (int i = 0; i <= A.length/2; i++) {
////			System.out.println("--------------------------------Loop : "+ i);
//			if (A[i] == dominator) {
//				result = A[i];
//				return i;
//			}
//		}
//		if (result == 0) {
//			return A.length/2 + 1;
//		}
//		
//		
//		return result;
//	}


}
