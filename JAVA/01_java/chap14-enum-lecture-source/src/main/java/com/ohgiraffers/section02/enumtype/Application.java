package com.ohgiraffers.section02.enumtype;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 열거형(Enum)을 이용하여 상수 열거 패턴 단점 해결 */
        /* 설명. 1) 열거 타입으로 선언된 인스턴스 -> 싱글톤으로 관리, 인스턴스가 한 개임을 보장
        *   순서 개념의 인덱스 X, 인스턴스 O */
        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;
        Subjects subject3 = Subjects.JAVA;

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목이다.");
        } else {
            System.out.println("두 과목은 다른 과목이다.");
        }

        /* 설명. 2) 단일 인스턴스임을 보장 -> == 연산자 이용한 비교 가능*/
        if (subject1 == subject3) {
            System.out.println("싱글톤");
        }

        /* 설명. 3) toString()/name() 이용해 필드명 문자로 변경 용이 (switch 없이도) */
        System.out.println(Subjects.JAVA.toString());
        System.out.println(Subjects.JAVA.name());

        /* 설명. 4) values()를 이용해 상수값 배열 반환, 이를 이용해 연속처리*/
        Subjects[] subjects = Subjects.values();
        for (Subjects s : subjects) {
            System.out.println(s.toString());
            System.out.println(s.ordinal());
            System.out.println(s.name());
            System.out.println();
        }

        /* 설명. 5) 타입 안전성 보장 */
        printSubjects(Subjects.JAVA);
//        printSubjects(0);         // Subjects 타입 아니라서 에러 발생
    }

    private static void printSubjects(Subjects subjects) {
    }
}
