package com.ohgiraffers.section01.xmlmapper;

public class MenuDTO {
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO() {
    }
    public MenuDTO(int menuCdoe, String menuName, int menuPrice, int categoryCode, String orderableStatus) {
        this.menuCode = menuCdoe;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuCdoe=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }

    public int getMenuCdoe() {
        return menuCode;
    }

    public void setMenuCdoe(int menuCdoe) {
        this.menuCode = menuCdoe;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }
}
