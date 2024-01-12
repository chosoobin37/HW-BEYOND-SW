package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement() {

        /* 수업목표. if-else문 단독 사용에 대한 흐름 이해 및 적용 */
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하시오: ");
        int input = sc.nextInt();

        if (input % 2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            System.out.println("입력하신 정수는 짝수입니다.");
        }
    }
}
