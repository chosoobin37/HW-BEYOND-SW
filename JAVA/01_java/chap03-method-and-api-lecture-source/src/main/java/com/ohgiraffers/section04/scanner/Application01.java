package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력받기 */
//        java.util.Scanner sc= new java.util.Scanner(System.in);
        Scanner sc= new Scanner(System.in);

        /* 목차. 1) 문자열 입력 받기 */
        System.out.print("이름을 입력하세요: ");
        String name1 = sc.next();                   // (buffer에서) 공백이나 개행 전까지 문자열 반환
        String name2 = sc.nextLine();               // (buffer에서) 공백이나 개행 포함해 문자열 전부 반환
        System.out.println("입력하신 이름은: "+name1);
        System.out.println("입력하신 이름은: "+name2);

        /* 목차. 2) 정수형 입력 받기 */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는: "+age);

        /* 목차. 3) 실수형 입력 받기 */
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는: "+height);

        /* 목차. 4) 논리형 입력 받기 */
        System.out.print("true와 fasle 중에 한 가지를 입력하세요: ");
        boolean isTrue= sc.nextBoolean();
        System.out.println("입력하신 값은: "+isTrue+"입니다.");

        sc.nextLine();                              // 중간에 buffer에 남은 공백 및 개행 제거용 nextLine()

        /* 목차. 5) 문자형 입력 받기 */
        System.out.print("아무 알파벳 하나를 입력하세요: ");
        char answer= sc.nextLine().charAt(0);           // 0번째를 character형으로 입력 받음, method chaining
                                                    // enter를 buffer에 저장X
        System.out.println("입력하신 문자는: "+answer+"입니다.");


    }
}
