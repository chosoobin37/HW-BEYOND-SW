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
    public void testNestedIfElseStatement() {

        /* 수업목표. 중첩된 if-else문 단독 사용에 대한 흐름 이해 및 적용 */
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 한 개를 입력하시오: ");
        int input = sc.nextInt();

        /* 설명. 정수를 하나 입력 받아서 양수와 음수 구분 뒤 양숭리 때만 짝수, 홀수 판별 (각 상태 모두 출력) */
        if (input > 0) {                    // 양수인 경우
            System.out.println("양수");
            if (input % 2 == 0) {           // 양수이면서 짝수
                System.out.println("짝수");
            } else {                        // 양수이면서 홀수
                System.out.println("홀수");
            }

        } else {                            // 0 or 음수
            System.out.println("0 또는 음수");
        }
    }
}
