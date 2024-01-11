package com.ohgiraffers.section01.arithmetic;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. 산술연산자에 대해 이해하고 활용 */
        /* 필기.
         *  산술 연산자
         *  산술 연산자는 주로 사칙연산과 관련된 연산자 -> 가장 기본적이면서도 많이 사용되는 연산자
         *  연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개 인 이항 연산자로 분류
         *  피연산자들의 연산 방향은 왼쪽 -> 오른쪽
        * */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1+num2));
        System.out.println("num1 - num2 = " + (num1-num2));
        System.out.println("num1 * num2 = " + (num1*num2));

        double testNum = (num1 / (double) num2);
        double resultNum = (int)(testNum*100)/(double)100;
        System.out.println("resultNum: " + resultNum);

        System.out.println("num1 / num2 = " + (num1/(double)num2));
        System.out.println("num1 % num2 = " + (num1%num2));


    }
}
