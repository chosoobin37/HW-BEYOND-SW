package com.ohgiraffers.section05.typecasting;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 자동 형변환 (implicit coercion) 규칙에 대해 이해 */
        /* 설명. 더 큰 자료형으로 옮겨도 문제 없이 자동형변환 후 대입 */

        byte bnum = 1;              // literal이 정수 -> java는 int로 인지하지만 int -> byte, int -> short는 자동 형변환

        short snum = 1;
        int inum = 1;
        long lnum = 1;

        /* 설명. 연산 시에도 자동으로 큰 쪽 자료형에 맞춰 낮은 자료형 자동 형변환 */
        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result = " + result1);

        /* 설명. 문자형 -> int형 자동 형변환 (반대도 가능) */
        int ch1 = 'a';
        int charNumber = ch1;
        System.out.println("chatNumber: " + charNumber);

        char ch2 = 65;
        System.out.println("ch2: " + ch2);


    }
}
