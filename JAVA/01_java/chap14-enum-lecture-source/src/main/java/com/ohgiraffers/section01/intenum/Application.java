package com.ohgiraffers.section01.intenum;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 정수 열거 패턴과 단점 이해 (열거형 enum 아닐 때) */
        int subject1 = Subjects.JAVA;
        int subject2 = Subjects.HTML;

        /* 설명. 1) 둘 다 상수이자 숫자일 뿐인데 같은 숫자일 경우 구분 불가능 */
        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다.");
        }

        /* 설명. 2) 이름 충돌 방지를 위해 접두어 써서 구분 (이름과 번호가 같을 때) */

        /* 설명. 3) 변수명에 쓰인 이름.문자열 출력하기 어려움 (switch) */
        Scanner sc = new Scanner(System.in);
        System.out.print("과목 번호를 눌러주세요(0~2): ");
        int filedNo = sc.nextInt();

        String subName = "";
        switch (filedNo) {
            case Subjects.JAVA: subName="JAVA"; break;
            case Subjects.MARIADB: subName="MARIADB"; break;
            case Subjects.JDBC: subName="JDBC"; break;
        }
        System.out.println("선택한 과목명은 " + subName + "입니다.");

        /* 설명. 4) 같은 클래스에 속한 상수들은 순회(반복자/반복문 사용) 사용 불가능, 전체 필드 갯수 또한 알 수 없음 */

        /* 설명. 5) 타입 안정성 보장 불가 -> Subject.JAVA라는 것과 단순 정수값 구분 불가 */
        printSubject(Subjects.JAVA);
        printSubject(0);            // 아무 int값이나 전댈해도 해당 메소드 문제 없이 작동

    }

    private static void printSubject(int java) {
    }
}
