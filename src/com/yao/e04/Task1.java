package com.yao.e04;

import com.yao.codility.easy.BinaryGap.BinaryGap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack Yao on 2022/1/8 10:44 AM
 */
public class Task1 {
    public static void main(String[] args) {
        int[] A = {2,1,3,5,4}  ;
        System.out.println(Task1.solution(A));
    }
    public static int solution(int[] A) {
        List<Integer> list = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println("----------" +i+ "------------");
            System.out.println("----" + A[i]);
            System.out.println("--" + list);
            list.add(A[i]);
            for (int j = 0; j < A[i]; j++) {
                if (list.contains(j+1)){
                    //donothing
                }else {
                    break;
                }

            }
            result ++;
        }

        return result;
    }
}
