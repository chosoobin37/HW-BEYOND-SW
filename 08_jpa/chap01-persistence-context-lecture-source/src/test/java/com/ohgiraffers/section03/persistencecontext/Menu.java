package com.ohgiraffers.section03.persistencecontext;

import jakarta.persistence.*;

// 엔티티 객체로 만들기 위한 어노테이션, 다른 패키지에 동일한 이름의 클래스가 존재하면 안 됨
@Entity(name = "section03_menu")
// 데이터 베이스에 매핑 될 테이블 이름 설정
@Table(name = "tbl_menu")
public class Menu {

    @Id                                                 // PK에 해당하는 속성에 지정
    @Column(name = "menu_code")                         // 데이터베이스에 대응되는 컬럼명 지정
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 값을 데이터베이스에 생성하도록 지정 (PK 제약조건)
                                                        // 데이터베이스는 테이블에 새로운 행이 추가될 때마다
                                                        // 기본키 열에 고유한 값을 자동으로 설정
    private int menuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    @Column(name = "category_code")
    private int categoryCode;

    @Column(name = "orderable_status")
    private String orderabelStauts;

    public Menu() {
    }

    public Menu(int menuCode, String menuName, int menuPrice, int categoryCode, String orderabelStauts) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderabelStauts = orderabelStauts;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
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

    public String getOrderabelStauts() {
        return orderabelStauts;
    }

    public void setOrderabelStauts(String orderabelStauts) {
        this.orderabelStauts = orderabelStauts;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuPrice='" + menuPrice + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", orderabelStauts='" + orderabelStauts + '\'' +
                '}';
    }
}
