package com.yao.codility.easy.Nesting;

import java.util.Stack;

public class Nesting {
	public static void main(String[] args) {
//		String S ="(()(())())"; 
		String S ="(((()))())"; 
		System.out.println("answer : " + Nesting.solution(S));
	}

	public static int solution(String S) {
		
		
		
		
		//refer to https://app.codility.com/demo/results/trainingWPSH6W-AF4/
//		import java.util.Stack;
//		class Solution {
//		    public int solution(String S) {
//		        Stack<Character> stack = new Stack<Character>();
//		        for (int i = 0; i < S.length(); i++) {
//		            switch (S.charAt(i)) {
//		                case '(':
//		                    stack.push(S.charAt(i));
//		                    break;
//		                case ')':
//		                    if (stack.isEmpty() || stack.peek() != '(') return 0;
//		                    else stack.pop();
//		                    break;
//		            }
//		        }
//		        return stack.isEmpty() ? 1 : 0;
//		    }
//		}
		
		
		
		//遇到右括號就一定要有左括號可以抵消，別想太複雜

		char[] sArr = S.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i] == '(') {
				stack.push(sArr[i]);
			}else if (sArr[i] == ')') {
				if (stack.size() == 0 ) {
					return 0 ;
				}else {
					stack.pop();
				}
			}
		}
		if (stack.size() == 0) {
			return 1;
		}else {
			
			return 0;
		}
	}
//	37%
//	public static int solution(String S) {
//		if (S.length() == 0) {
//			return 0;
//		}
//		if (S.length() % 2 == 1) {
//			return 0;
//		}
//		
//		char[] sArr = S.toCharArray();
//		if (sArr[0] == ')') {
//			return 0;
//		}
//		
//		Stack<Character> stack = new Stack<Character>();
//		
//		for (int i = 0; i < sArr.length; i++) {
//			if (sArr[i] == '(') {
//				stack.push(sArr[i]);
//			}else if (sArr[i] == ')') {
//				stack.pop();
//				if (stack.size() == 0 && i != sArr.length-1) {
//					return 0;
//				}else if (stack.size() == 0) {
//					return 1;
//				}
//			}
//		}
//		return 0;
//	}




}
