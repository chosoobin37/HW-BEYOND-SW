package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {
    public void TestSimpleDoWhileStatement() {

        /* 수업목표. do-while 문 단독 사용에 대한 흐름 이해 및 적용 */
        
        do {
            System.out.println("실행 가능?");
        } while(false);                             // ; 주의
        System.out.println("반복 종료 이후");
    }
    public void TestDoWhileExample() {
        
        /* 수업목표. do-while 문의 흐름 이해 및 적용 */
        Scanner sc = new Scanner(System.in);
        String str ="";                                 // 변수 선언 위치 주의
        boolean flag=false;
        do {
            if(flag) {
                System.out.println("올바른 문자를 다시 입력하십시오: ");
            }
            System.out.print("finish! 를 정확히 입력하시오.: ");
            str=sc.nextLine();
            System.out.println(str+"(이)라고 입력하셨습니다.");
        } while(!str.equals("finish!"));            // equals method -> String compare, '=='
                                                    // str 문자열의 값이 'finish!'와 일치하면 false 처리되게 작성
        System.out.println("감사합니다.");
    }
}
