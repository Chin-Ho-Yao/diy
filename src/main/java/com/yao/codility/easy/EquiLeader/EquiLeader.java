package com.yao.codility.easy.EquiLeader;

import java.util.HashMap;
import java.util.Map;


public class EquiLeader {
	
	public static void main(String[] args) {
		int[] A = {4,3,4,4,4,2} ;
		System.out.println(new EquiLeader().solution(A));
		
		
		//test
//		Map<Integer, Integer> map = new HashMap<>();
//		map.put(1, 111);
//		map.put(2, 222);
//		map.put(333, 333);
//		System.out.println("map : " + map);
//		Map<Integer, Integer> rightMap = map;
//		System.out.println("rightMap : " + rightMap);
		
	}
	
	public int solution(int[] A) {
		//陣列大小只有一就不用看了
		int count = 0;
		
		if (A.length == 1){
			return 0;
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		//把所有數字出現次數記下來
		for (int i = 0; i < A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i])+1);
			}else {
				map.put(A[i], 1);
			}
		}
		
		int maxCount = 0;
		int maxCountValue = 0;
		for (int i : map.keySet()) {
			int currentCount = map.get(i);
			if (currentCount > maxCount) {
				maxCount = currentCount;
				maxCountValue = i;
			}
		}
		int leaderValue = 0;
		int leaderCount = 0;
		
		if (maxCount > (0.5) * (A.length)) {
			leaderValue = maxCountValue;
			leaderCount = maxCount;
		}else {
			return 0;
		}
		
		
	
		
    
    	return count;
       
    }
	
	
	//不要用map
//	public int solution(int[] A) {
//		//陣列大小只有一就不用看了
//		if (A.length == 1){
//			return 0;
//		}
//		
//		Map<Integer, Integer> rightMap = new HashMap<>();
//		Map<Integer, Integer> leftMap = new HashMap<>();
//		//把所有數字出現次數記下來
//		for (int i = 0; i < A.length; i++) {
//			if (rightMap.containsKey(A[i])) {
//				rightMap.put(A[i], rightMap.get(A[i])+1);
//			}else {
//				rightMap.put(A[i], 1);
//				leftMap.put(A[i], 0);
//			}
//		}
//		System.out.println("rightMap : " + rightMap);
//		System.out.println("leftMap : " + leftMap);
//		
//		//開始遍歷記數
//		int count = 0;
//		int maxLeftNum = 0;
//		int secondMaxLeftNum = 0;
//		int secondmaxRightNum = 0;
//		
//		for (int i = 0; i < A.length; i++) {
//			if (leftMap.containsKey(A[i])) {
//				leftMap.put(A[i], leftMap.get(A[i])+1);
//				rightMap.put(A[i], rightMap.get(A[i])-1);		//確認不會變成負的?
//			}else {
//				leftMap.put(A[i], 1);
//			}
//			//FIXME 這邊開始邏輯正確?次數還要再遍歷一遍挑最大次大?
//			maxLeftNum = 0;
//		}
//    
//    	return count;
//       
//    }
	
}
