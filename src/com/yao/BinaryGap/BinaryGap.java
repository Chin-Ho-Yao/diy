package com.yao.BinaryGap;

public class BinaryGap {
	public static void main(String[] args) {
		int input = 805306373  ;
		System.out.println(BinaryGap.solution(input));
	}
	public static int solution(int N) {
		
		int gap = 0;
		int maxGap = 0;
		
		if (N == 1) {
			return 0;
		}
		for (char c : Integer.toBinaryString(N).toCharArray()) {
			if(c == '0') {
				gap ++;
			}else if (c == '1') {
				if (gap > maxGap) {
					maxGap = gap;
				}
				gap = 0;
			}
		}
		
		
		return maxGap;
	}
}
