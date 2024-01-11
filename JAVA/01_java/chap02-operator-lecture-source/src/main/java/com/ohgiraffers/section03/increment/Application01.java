package com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. 단항 연산자이자 중감연산자인 연산다에 대해 이해하고 활용 */
        /* 필기.
         *  중감연산자
         *  피연산자의 앞 or 뒤에서 사용 가능
         *  '++' 1증가
         *  '--' 1감소
        * */

        /* 목차. 1) 증감연산자 단독 사용 */
        int num = 20;
        System.out.println("num: "+num);

        num++;
        System.out.println("num: "+num);

        ++num;
        System.out.println("num: "+num);

        num--;
        System.out.println("num: "+num);

        --num;
        System.out.println("num: "+num);

        /* 목차. 2) 증감연산자를 다른 연산자(대입, 출력)와 함꼐 사용 */
        int firstNum=20;
        int result1=firstNum++ * 3;

        System.out.println("result1: "+ result1);
        System.out.println("firstNum: "+ firstNum);
        System.out.println("firstNum: "+ firstNum++);
        System.out.println("firstNum: "+ ++firstNum);




    }
}
