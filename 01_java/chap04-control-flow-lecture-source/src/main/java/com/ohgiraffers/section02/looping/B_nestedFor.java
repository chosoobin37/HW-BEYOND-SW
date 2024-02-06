package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine() {

        /* 수업목표. 중첩된 for 문의 흐름 이해 및 적용 */

        /* 설명.
         *  2단
         *  2*1=2
         *  2*2=4
         *  ...
         *  9*8=72
         *  9*9=81
        * */

        for (int i = 2; i < 10; i++) {                  // 단수 -> 2~9
            System.out.println("\n" + i + "단의 곱");
            for (int j = 1; j < 10 ; j++) {             // 곱해지는 수 -> 1~9
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }

    public void printUpgradeGugudanFromTwoToNine() {

        /* 수업목표. inner for 문을 메소드로 개별 모듈화 (하나의 기능으로 간주) */
        for (int dan = 2; dan < 10 ; dan++) {
            System.out.println(dan+"단 출력");
            printGugudanOf(dan);
            System.out.println();
        }
    }
    /* 설명. 단수를 넘기면 1~9단까지 곱해서 숫자 출력하는 기능 */
    private void printGugudanOf(int dan) {
        for (int su = 0; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }
    /* 설명. 아래와 같은 별 모양이 나오도록 작성
    *   정수를 입력하시오: 5
    *       *
    *      **
    *     ***
    *    ****
    *   *****
    *  */
    public void printStars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        int input=sc.nextInt();
        for (int i =1; i <=input ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
