package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. 오버플로우에 대해 이해 */
        /* 필기.
         *  자료형 별 값의 최대 범위를 벗어나는 경우
         *  발생한 carry를 버림처리하고 sign bit를 반전시켜 최소값으로 순환
        * */

        /* 목차. 1) 오버플로우 */
        byte num1 = 126;            // byte 자료형의 양의 최대 저장 범위값

        num1 ++;                    // num1 = num1 + 1;과 의미상 동일
        System.out.println("num1 = " + num1);

        num1 ++;
        System.out.println("num1 = " + num1);

        num1 ++;
        System.out.println("num1 = " + num1);

        /* 목차. 2) 언더플로우 */
        byte num2 = -127;           // byte 자료형의 양의 최소 저장 범위값

        num2 --;                    // num2 = num2 - 1;과 의미상 동일
        System.out.println("num2 = " + num2);

        num2 --;
        System.out.println("num2 = " + num2);

        num2 --;
        System.out.println("num2 = " + num2);

        /* 설명.
         *  일반적으로 많이 사용하는 int형 최댑갓 -> 약 21억
         *  이 범위를 벗어난 계산 _> 오버플로우 발생
        * */

        int firstNum = 1000000;
        int seconNum = 700000;

        int multi = firstNum*seconNum;

        System.out.println("firstNum * secondNUm = " + multi);

    }
}
