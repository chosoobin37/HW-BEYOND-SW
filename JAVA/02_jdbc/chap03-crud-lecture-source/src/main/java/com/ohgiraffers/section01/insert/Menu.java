package com.ohgiraffers.section01.insert;

public class Menu {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String oderableStatus;

    public Menu(int menuCode, String menuName, int menuPrice, int categoryCode, String oderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.oderableStatus = oderableStatus;
    }

    public Menu(String menuName, int menuPrice, int categoryCode, String oderableStatus) {
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.oderableStatus = oderableStatus;
    }

    public Menu() {
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", oderableStatus='" + oderableStatus + '\'' +
                '}';
    }

    public int getMenuCode() {
        return menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public String getOrderableStatus() {
        return oderableStatus;
    }
}
