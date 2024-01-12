package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner를 이용한 다양한 자료형 값 입력받기 */
//        java.util.Scanner sc= new java.util.Scanner(System.in);
        Scanner sc= new Scanner(System.in);

        /* 목차. 1) 문자열 입력 받기 */
        System.out.println("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은: "+name);

        /* 목차. 2) 정수형 입력 받기 */


        /* 목차. 3) 실수형 입력 받기 */


        /* 목차. 4) 논리형 입력 받기 */


        /* 목차. 5) 문자형 입력 받기 */


    }
}
