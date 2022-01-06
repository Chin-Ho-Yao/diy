package com.yao.codility.easy.Brackets;

/**
 * Created by Jack Yao on 2022/1/6 10:19 PM
 */
public class Brackets {
    public static void main(String[] args) {

        String input = "[()()]";
        System.out.println("answer : " + Brackets.solution(input) );
    }
    public static int solution(String S){

        char[] sChars = S.toCharArray();

        if (sChars[0] == ')'||sChars[0] == ']'||sChars[0] == '}'){
            return 0;
        }

        int count = 1;
        for (int i = 1; i < sChars.length; i++) {
            System.out.println("-------------"+i+"------------");
            System.out.println("count : " + count + " sChars[count-1] : " + sChars[count-1] + " sChars[i] : " + sChars[i] );
//            後來補上
            if (count > sChars.length/2){
                return 0;
            }
            if (sChars[i] == ')'){
                if (sChars[count-1] == '('){
                    count--;
                    if (count == 0){
                        return 1;
                    }
                }else {
                    return 0;
                }
            }else if (sChars[i] == ']'){
                if (sChars[count-1] == '['){
                    count--;
                    if (count == 0){
                        return 1;
                    }
                }else {
                    return 0;
                }
            }else if (sChars[i] == '}'){
                if (sChars[count-1] == '{'){
                    count--;
                    if (count == 0){
                        return 1;
                    }
                }else {
                    return 0;
                }
            }else {

                count++;
            }
        }
        return 0;
    }

//    25%
//    public static int solution(String S){
//
//        char[] sChars = S.toCharArray();
//
//        if (sChars[0] == ')'||sChars[0] == ']'||sChars[0] == '}'){
//            return 0;
//        }
//
//        int count = 1;
//        for (int i = 1; i < sChars.length; i++) {
//            System.out.println("-------------"+i+"------------");
//            System.out.println("count : " + count + " sChars[count-1] : " + sChars[count-1] + " sChars[i] : " + sChars[i] );
//            if (sChars[i] == ')'){
//                if (sChars[count-1] == '('){
//                    count--;
//                    if (count == 0){
//                        return 1;
//                    }
//                }else {
//                    return 0;
//                }
//            }else if (sChars[i] == ']'){
//                if (sChars[count-1] == '['){
//                    count--;
//                    if (count == 0){
//                        return 1;
//                    }
//                }else {
//                    return 0;
//                }
//            }else if (sChars[i] == '}'){
//                if (sChars[count-1] == '{'){
//                    count--;
//                    if (count == 0){
//                        return 1;
//                    }
//                }else {
//                    return 0;
//                }
//            }else {
//
//                count++;
//            }
//        }
//        return 0;
//    }
}
