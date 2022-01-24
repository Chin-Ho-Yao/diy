package com.yao.codility.easy.PermMissingElem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] A = {2,3,1,5}; 
		System.out.println(PermMissingElem.solution(A));
	}
	//do myself
	public static int solution(int[] A) {
		int result = 0;
		int sum = 0;
		int sumA = 0;
		for (int i = 0; i <= A.length; i++) {
			sum += i+1;
		}

		for (int i : A) {
			sumA += i;
		}
		return sum - sumA;
	}



}
