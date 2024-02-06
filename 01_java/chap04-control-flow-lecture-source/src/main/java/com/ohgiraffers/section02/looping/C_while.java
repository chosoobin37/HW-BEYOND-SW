package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
    public void testSimpleWhileStatement() {
        /* 수업목표. while문 단독 사용에 대한 흐름 이해 및 적용 */
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }
    }
    public void testWhileExample() {
        /* 수업목표. 사용자가 'y' 라고 입력할 때까지 반복해서 확인하는 예제 (대소문자 구분 X) */
        Scanner sc = new Scanner(System.in);

        char answer ='\u0000';              // while 조건식에 활용하기 위해 변수 미리 선언(char 초기값 설정)

        while (!(answer=='y'||answer=='Y')) {
            System.out.print("y 또는 Y를 입력하시오: ");
            answer = sc.next().charAt(0);
        }

        System.out.println("정확한 문자를 입력하셨습니다.");
    }
}
