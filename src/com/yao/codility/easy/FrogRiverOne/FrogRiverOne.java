package com.yao.codility.easy.FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

//100% do myself
	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4, 3}; 
		int X = 5;
		System.out.println(FrogRiverOne.solution(X,A));
	}
	public static int solution(int X, int[] A) {
		
		Set<Integer> aSet = new HashSet<Integer>();
		
		for (int i = 1; i <= X; i++) {
			aSet.add(i);
		}

		for (int i = 0; i < A.length; i++) {
			aSet.remove(A[i]);
			System.out.print(i + " : "+aSet.size());
			if (aSet.size() == 0) {
				return i;
			}
		}
		return -1;
		
		
	}



}
