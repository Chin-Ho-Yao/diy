package com.yao.codility.easy.Fish;

import java.util.Stack;

public class Fish {
	public static void main(String[] args) {
		int[] A  = {4,3,2,1,5};
//		int[] B  = {0,0,0,0,0};
		int[] B  = {1,1,1,1,1};
		System.out.println("answer : " + Fish.solution(A,B));
	}

	public static  int solution(int[] A, int[] B) {
		// refer to https://github.com/Mickey0521/Codility/blob/master/Fish.java
		if (A.length == 0) {
			return 0;
		}
		
		int liveNum = A.length;
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < A.length; i++) {
			//downstream then push
			if (B[i] == 1) {
				stack.push(A[i]);
			}
			
			//upsteam then compare which fish is bigger, then pop
			if (B[i] == 0) {
				 while (!stack.empty()) {
					if (stack.peek() > A[i]) {
						liveNum--;
						break;
					}else {
						liveNum--;
						stack.pop();
					}
					
				}
			}
			
			
		}
		
		
		
		return liveNum;
	}
//	12%
//	public static  int solution(int[] A, int[] B) {
//		//找向上與向下最大，其包在中間的通通吃掉，最後這兩隻互吃剩一隻。
//		//這一支加上此範圍以外的魚就是答案
//		if (A.length == 0) {
//			return 0;
//		}
//		int upBigestFish = -1;
//		int downBigestFish = -1;
//		int upstreamBigestFishPosition = -1;
//		int downstreamBigestFishPosition = -1;
//		
//		for (int i = 0; i < A.length; i++) {
//			System.out.println("----------"+i+"-----------------");
//			System.out.println("--A[i] : "+A[i]);
//			if (upBigestFish < A[i] || downBigestFish < A[i]) {
//				if (B[i] == 0) {
//					downstreamBigestFishPosition = i;
//					downBigestFish =  A[i];
//				}else if(B[i] == 1){
//					upBigestFish =  A[i];
//					upstreamBigestFishPosition = i;
//				}
//			}
//			
//			System.out.println("upBigestFish : " + upBigestFish);
//			System.out.println("downBigestFish : " + downBigestFish);
//			System.out.println("upstreamBigestFishPosition : " + upstreamBigestFishPosition);
//			System.out.println("downstreamBigestFishPosition : " + downstreamBigestFishPosition);
//		}
//		if (upstreamBigestFishPosition == -1 || downstreamBigestFishPosition == -1) {
//			return A.length;
//		}
//		
//		return A.length - Math.abs(downstreamBigestFishPosition-upstreamBigestFishPosition);
//	}


}
