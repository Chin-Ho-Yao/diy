package com.yao.codility.easy.FrogJmp;

public class FrogJmp {

	public static void main(String[] args) {
		int X = 10; 
		int Y = 85;
		int D = 30 ;
		System.out.println(FrogJmp.solution(X,Y,D));
	}
	public static int solution(int X, int Y, int D) {
		System.out.println((float) (Y-X)/D);
		System.out.println(Math.ceil((float) (Y-X)/D));
		System.out.println((int)Math.ceil((float) (Y-X)/D));
		
		return (int)Math.ceil((float) (Y-X)/D);
	}
	
//	22%
//	public static int solution(int X, int Y, int D) {
//		
//		int count = 1;
//		if (Y-X >0) {
//			count = Y/D;
//			if (Y % D != 0) {
//				count ++;
//			}
//		}else {
//			return count;
//		}
//		
//		return count;
//	}
	
//	40%
//	public static int solution(int X, int Y, int D) {
//		
//		int count = 0;
//		int nowPosition = X;
//		
//		while (nowPosition < Y) {
//			nowPosition += D;
//			count ++;
//		}
//		
//		return count;
//	}
//	

}
