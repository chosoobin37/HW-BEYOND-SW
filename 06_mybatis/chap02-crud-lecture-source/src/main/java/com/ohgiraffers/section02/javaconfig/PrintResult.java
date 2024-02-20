package com.ohgiraffers.section02.javaconfig;

import java.util.List;

public class PrintResult {
    public void printMenus(List<MenuDTO> menuList) {
        menuList.forEach(System.out::println);
    }

    public void printErrorMessage(String message) {
        System.out.println("Error Message: " + message);
    }

    public void printMenu(MenuDTO menu) {
        System.out.println("menu = " + menu);
    }

    public void printSuccesMessage(String statusCode) {
        String successMessage = "";
        switch (statusCode) {
            case "regist":
                successMessage = "신메뉴 등록에 성공하였습니다.";
                break;
            case "modify":
                successMessage="메뉴 수정에 성공하였습니다.";
                break;
            case "remove":
                successMessage = "메뉴 삭제에 성공하였습니다.";
                break;
        }
        System.out.println("successMessage = " + successMessage);
    }
}
