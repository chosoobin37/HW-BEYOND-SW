package com.ohgiraffers.section05.logical;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. 논리연산자에 대해 이해하고 활용 */
        /* 필기.
         *  논리 연산자 -> 논리값(true or false)을 취급하는 연산자
         *  논리 연산자의 종류
         *  1) 논리 연결 연산자: 두 개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은 왼쪽 -> 오른쪽
         *  두 개의 논리식을 판단하여 참과 거짓 판단
         *  1-1) && (논리 AND): 두 개의 논리식 모두 참일 경우 true, 둘 중 하나라도 거짓이면 false
         *  1-2) || (논리 OR): 두 개의 논리식 중 둘 중 하나라도 참이면 true, 둘 다 거짓일 때만 false
         *  2) 논리 부정 연산자: 피연산자가 하나인 단항연산자, 피연산자의 결합 방향은 왼쪽 -> 오른쪽
         *  2-1) !(NOT): 논리식의 결과가 참이면 false, 거짓이면 true
        * */

        /* 목차. 1) 논리 연산자 결과값 확인 */
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);
        System.out.println("-----");

        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);
        System.out.println("-----");

        System.out.println(!true);
        System.out.println(!false);
        System.out.println("-----");

        /* 목차. 2) 논리식에 논리연산자 활용 */
        /* 필기. 단-산-시(프트) (비)교-비-논(리) 삼-대 */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        System.out.println(num1<num2&&num3<num4);
        System.out.println(num1<num2&&num3>num4);
        System.out.println(num1>num2&&num3<num4);
        System.out.println(num1>num2&&num3>num4);
        System.out.println("-----");

        System.out.println(num1<num2||num3<num4);
        System.out.println(num1<num2||num3>num4);
        System.out.println(num1>num2||num3<num4);
        System.out.println(num1>num2||num3>num4);
        System.out.println("-----");

    }
}
