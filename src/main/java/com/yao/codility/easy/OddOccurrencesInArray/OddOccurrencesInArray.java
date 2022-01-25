package com.yao.codility.easy.OddOccurrencesInArray;

import java.util.HashSet;
import java.util.Set;


public class OddOccurrencesInArray {
	public static void main(String[] args) {
		int[] inputArray = {9,3,9,3,9,7,9};
		System.out.println(OddOccurrencesInArray.solution(inputArray));
	}
	public static int solution(int[] A) {
		int result = 0;
		Set<Integer> resultSet = new HashSet<Integer>();
		for (int i : A) {
			if (resultSet.contains(i)) {
				resultSet.remove(i);
			}else {
				resultSet.add(i);
			}
		}
		for (Integer integer : resultSet) {
			result = integer;
		}
		
		return result;
	}
	
}
