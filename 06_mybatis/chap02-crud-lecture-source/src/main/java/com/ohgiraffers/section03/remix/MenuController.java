package com.ohgiraffers.section03.remix;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }

    public void findAllMenu() {

        List<MenuDTO> menus = menuService.findAllMenu();    // findAllMenu()에서 반환되는 것은 MenuDTO 객체들의 목록, 그 목록은 list<menuDTO> 형태로 menus변수에 할당

        if(!menus.isEmpty()) {
            printResult.printMenus(menus);
        } else {
            printResult.printErrorMessage("전체 메뉴 조회 실패!");
        }
    }


    public void findMenuBy(Map<String, String> parameter) {
        // 전달 받은 매개변수(Map)에서 menuCode키에 해당하는 값을 가져와 정수로 변환
        int menuCode = Integer.valueOf(parameter.get("menuCode"));

        MenuDTO menu = menuService.findMenuBy(menuCode);

        if(menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage(menuCode + "번의 메뉴는 없습니다.");
        }
    }

    public void registMenu(Map<String, String> parameter) {
        String menuName = parameter.get("menuName");
        int menuPrice = Integer.valueOf(parameter.get("menuPrice"));
        int categoryCode = Integer.valueOf(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(menuName);
        menu.setMenuPrice(menuPrice);
        menu.setCategoryCode(categoryCode);

        if(menuService.registMenu(menu)) {
            printResult.printSuccessMessage("regist");
        } else {
            printResult.printErrorMessage("메뉴 추가 실패!");
        }
    }

    public void modifyMenu(Map<String, String> parameter) {
        int menuCode = Integer.valueOf(parameter.get("menuCode"));
        String menuName = parameter.get("menuName");
        int menuPrice = Integer.valueOf(parameter.get("menuPrice"));

        MenuDTO menu = new MenuDTO();
        menu.setMenuCode(menuCode);
        menu.setMenuName(menuName);
        menu.setMenuPrice(menuPrice);

        if(menuService.modifyMenu(menu)) {
            printResult.printSuccessMessage("modify");
        } else {
            printResult.printErrorMessage("메뉴 수정 실패!");
        }
    }

    public void removeMenu(Map<String, String> parameter) {
        int menuCode = Integer.valueOf(parameter.get("menuCode"));
        if(menuService.removeMenu(menuCode)) {
            printResult.printSuccessMessage("remove");
        } else {
            printResult.printErrorMessage("메뉴 삭제 실패!");
        }
    }
}