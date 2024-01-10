package com.ohgiraffers.section01.literal;

public class Application01 {
    public static void main(String[] args) {

        // 한줄주석
        /* 범위주석 */
        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */
        /* 목차 1. 숫자 형태의 값 */
//      /* 목차 1-1. 정수 형태의 값 출력 */
        System.out.println(123);

        /* 목차. 1-2 싷수 형태의 값 출력 */
        System.out.println(1.234);

        /* 목차 2. 문자 형태의 값 출력 */
        System.out.println('a');                    // 문자는 single (')
        System.out.println('1');                    // 숫자도 single 붙이면 문자열 취급
        System.out.println('\u0000');               // 공백을 넣을 때 error 조심 \u0000 필수

        /* 목차 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");            // 문자열은 double(")
        System.out.println("a");                   // single 안에 문자열 2개 이상 -> compile error
        System.out.println(" ");

        /* 목차 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println("true");                 // double(") 붙이면 문자열 처리
        System.out.println(false);                  // only true or false -> 논리값








    }
}
