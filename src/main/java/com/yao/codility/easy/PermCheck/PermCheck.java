package com.yao.codility.easy.PermCheck;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4, 3 };
		int X = 5;
		System.out.println("answer : " + PermCheck.solution(X, A));
	}

	//6min 
	public static int solution(int X, int[] A) {

		Set<Integer> aSet = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			aSet.add(i + 1);
			System.out.println(i + " : aSet.size() : " + aSet.size());
		}

		for (int i = 0; i < A.length; i++) {
			if (aSet.contains(A[i])) {
				aSet.remove(A[i]);
				System.out.println(i + " : aSet.size() : " + aSet.size());
				if (aSet.size() == 0) {
					return 1;
				}
			}else {
				return 0;
			}
		}


		return 0;

	}

}
