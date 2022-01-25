package com.yao.codility.easy.Brackets;

import java.util.Stack;

public class Brackets {
	public static void main(String[] args) {
		String input = "";
		System.out.println(Brackets.solution(input));
	}

	public static int solution(String S) {
		if (S.length() == 0) {
			return 1;
		}

		char[] cArr = S.toCharArray();
		if (cArr[0] == ')' || cArr[0] == ']' || cArr[0] == '}') {
			return 0;
		}

		Stack<Character> stacks = new Stack<Character>();
		for (int i = 0; i < S.length(); i++) {
			System.out.println("------------" + i + "-------------");
			System.out.println("-------" + cArr[i] + "");
			if (cArr[i] == '(') {
				stacks.push(cArr[i]);
			} else if (cArr[i] == '[') {
				stacks.push(cArr[i]);
			} else if (cArr[i] == '{') {
				stacks.push(cArr[i]);
			} else {
				if (stacks.empty()) {
					return 0;
				}
				if (cArr[i] == ')') {
					if (stacks.peek() == '(') {
						stacks.pop();
					} else {
						return 0;
					}
				}
				if (cArr[i] == ']') {
					if (stacks.peek() == '[') {
						stacks.pop();
					} else {
						return 0;
					}
				}
				if (cArr[i] == '}') {
					if (stacks.peek() == '{') {
						stacks.pop();
					} else {
						return 0;
					}
				}
			}

			System.out.println("stacks.size() : " + stacks.size());
			System.out.println("stacks : " + stacks);
		}

		System.out.println("stacks.size() : " + stacks.size());
		if (stacks.size() == 0) {
			
			return 1;
		}

		return 0;
	}
}
