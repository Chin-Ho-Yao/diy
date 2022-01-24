package com.yao.codility.easy.StoneWall;

import java.util.Stack;

/**
 * Created by Jack Yao on 2022/1/7 10:54 PM
 */
public class StoneWall {
    public static void main(String[] args) {
        int[] H = {8,8,5,7,9,8,7,4,8}  ;
        System.out.println(StoneWall.solution(H));
    }
    public static int solution(int[] H) {

        Stack<Integer> hStack = new Stack<>();
        int blocksCount = 0;
        for (int i = 0; i < H.length; i++) {

            System.out.println("----------" +i+ "------------");
            System.out.println("----" + H[i]);
            System.out.println("--" + hStack);

            while (hStack.isEmpty())


            if (hStack.isEmpty() && i ==0){
                hStack.push(H[i]);
                blocksCount++;
            }else if (hStack.peek() == H[i]){
                //donothing
            }else if(hStack.peek() < H[i]){
                blocksCount++;
                hStack.push(H[i]);
            }else if(hStack.peek() > H[i]){

            }




        }

        return 0;
    }
}

