package com.ohgiraffers.section01.insert;

import java.util.Scanner;

/* 설명.
 *  Service 계층과 Repository 계층 구분 및 XML 파일에서부터 쿼리 호출 후 insert
* */
public class Application2 {
    
    /* 설명. view이자 controller 개념인 main에서부터 시작 */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴의 이름을 입력하세요: ");
        String menuName = sc.nextLine();
        System.out.print("메뉴의 가격을 입력하세요: ");
        int menuPrice = sc.nextInt();
        System.out.print("카테고리 코드를 입력하세요: ");
        int categoryCode = sc.nextInt();
        System.out.print("판매 상태를 입력하세요(Y/N): ");
        sc.nextLine();
        String orderableStatus = sc.nextLine();

        Menu registMenu = new Menu(menuName, menuPrice, categoryCode, orderableStatus);

        MenuService service = new MenuService();
        service.registMenu(registMenu);
    }

}
