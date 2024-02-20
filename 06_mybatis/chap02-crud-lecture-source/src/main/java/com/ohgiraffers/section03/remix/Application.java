package com.ohgiraffers.section03.remix;

import java.util.Scanner;

/* 설명. remix 핵심 -> DAO 계층을 인터페이스로 만들고 추상메소드만 남기는 방식*/
/* 설명. 쿼리가 있는 부분 -> XML로 작성 (mapper용 쿼리) */
public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuController menuController = new MenuController();

        do {
            System.out.println("===== 메뉴 관리 =====");
            System.out.println("1. 메뉴 전체 조회");
            System.out.println("2. 메뉴 코드로 메뉴 조회");
            System.out.println("3. 신규 메뉴 추가");
            System.out.println("4. 메뉴 수정");
            System.out.println("5. 메뉴 삭제");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 관리 번호를 입력하세요. ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    menuController.findAllMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        } while (true);
    }
}
