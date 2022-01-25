package com.yao.codility.easy.StoneWall;

import java.util.Stack;

import com.yao.codility.easy.Nesting.Nesting;

public class StoneWall {
	public static void main(String[] args) {
		int[] H ={8,8,5,7,9,8,7,4,8}; 
		System.out.println("answer : " + StoneWall.solution(H));
	}
	
	//
	public static int solution(int[] H) {
		Stack<Integer> stack = new Stack<>();
		int resultCount = 0;
		for (int i = 0; i < H.length; i++) {
			System.out.println("-------------------------------------------------Loop:"+i);
			System.out.println("H["+i + "] :" + H[i]);
			
			while (!stack.isEmpty() && stack.peek() > H[i]) {
				stack.pop();
				
			}
			
			if (stack.isEmpty()) {
				resultCount++;
				stack.push(H[i]);
				
			}else if (stack.peek() < H[i]) {
				resultCount++;
				stack.push(H[i]);
			}else if (stack.peek() == H[i]) {
				
			}
			
			
		}
		
		return resultCount;
	}
	
	
	//25 min 35% diy
//	public static int solution(int[] H) {
//		//左邊開始，只要高度改變就是block+1
//		//遇到更高的block+1，且上面可以放block直到降低到原本的高度，且其上個block也只能到其下面石頭的高度
//		//遇到更矮的block+1
//		//
//
//		if (H.length == 1) {
//			return 1;
//		}
//		Stack<Integer> stack = new Stack<>();
//		int maxHeight = 0;
//		int minHeight = 0;
//		int blocksCount = 0;
//		
//		for (int i = 0; i < H.length; i++) {
//			System.out.println("-------------------------------------------------Loop:"+i);
//			System.out.println("H["+i + "] :" + H[i]);
//			
//
//			System.out.println("maxHeight : " + maxHeight);
//			System.out.println("blocksCount : " + blocksCount);
//			System.out.println("minHeight : " + minHeight);
//			
//			if (i == 0) {
//				stack.push(H[0]);
//				maxHeight = H[0];
//				minHeight = H[0];
//				blocksCount ++;
//				for (Integer integer : stack) {
//					System.out.print(integer + ", ");
//				}
//				System.out.println();
//				continue;
//
//			}
//			System.out.println("stack.peek() : " + stack.peek());
//
//			if (H[i] == stack.peek()) {
//				maxHeight = Math.max(H[i], maxHeight);
//				
//				for (Integer integer : stack) {
//					System.out.print(integer + ", ");
//				}
//				System.out.println();
//			
//				
//			}else if (H[i] > stack.peek()) {
//				maxHeight = Math.max(H[i], maxHeight);
//				stack.add(H[i]);
//				blocksCount++;
//				
//				for (Integer integer : stack) {
//					System.out.print(integer + ", ");
//				}
//				System.out.println();
//
//				
//			}else if (H[i] < stack.peek()) {
//				
//				if (H[i] < minHeight) {
//					stack.clear();
//					stack.push(H[i]);
//					maxHeight = H[i];
//					minHeight = H[i];
//					blocksCount++;
//					for (Integer integer : stack) {
//						System.out.print(integer + ", ");
//					}
//					System.out.println();
//
//					
//				}else if (stack.contains(H[i])) {
//					for (Integer integer : stack) {
//						System.out.print(integer + ", ");
//					}
//					System.out.println();
//					continue;
//				}else {
//					stack.push(H[i]);
//					blocksCount++;
//					
//					for (Integer integer : stack) {
//						System.out.print(integer + ", ");
//					}
//					System.out.println();
//
//					
//				}
//			}
//
//		}
//
//		return blocksCount;
//
//	}
}
