package com.ohgiraffers.section04.comparison;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. 비교연산자에 대해 이해하고 활용 */ 
        /* 필기.
         *  비교연산자 -> 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자
         *  연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건식에서 주로 사용
        * */
        
        /* 목차. 1) 숫자값 비교 */
        System.out.println("-----");
        int inum1 = 10;
        int inum2 = 20;
        System.out.println(inum1 == inum2);
        System.out.println(inum1 != inum2);
        System.out.println(inum1 > inum2);
        System.out.println(inum1 >= inum2);
        System.out.println(inum1 < inum2);
        System.out.println(inum1 <= inum2);
        System.out.println("-----");

        /* 목차. 2) 문자값 비교 */
        char ch1 = 'a';             // 97
        char ch2 = 'A';             // 65
        System.out.println((int)ch2);

        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);
        System.out.println(ch1 > ch2);
        System.out.println(ch1 >= ch2);
        System.out.println(ch1 < ch2);
        System.out.println(ch1 <= ch2);
        System.out.println("-----");

        /* 목차. 3) 논리값 비교 */
        boolean isNumber1 = true;
        boolean isNumber2 = false;
        System.out.println(isNumber1 == isNumber2);
        System.out.println(isNumber1 != isNumber2);
//        System.out.println(isNumber1 > isNumber2);
//        System.out.println(isNumber1 >= isNumber2);
//        System.out.println(isNumber1 < isNumber2);
//        System.out.println(isNumber1 <= isNumber2);       // compile error -> 비교 불가
        System.out.println("-----");

        /* 목차. 4) 문자열값 비교 */
        String str1 = "java";
        String str2 = "java";
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
//        System.out.println(str1 > str2);
//        System.out.println(str1 >= str2);
//        System.out.println(str1 < str2);
//        System.out.println(str1 <= str2);         // -> compile error -> 비교 불가
        System.out.println("-----");

    }
}
