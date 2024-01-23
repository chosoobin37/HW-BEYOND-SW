package com.ohgiraffers.section01.list.dto;

import java.awt.print.Book;

public class BookDTO implements Comparable{
    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public BookDTO() {

    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 설명. 가격에 대해 오름차순 기준 설정
        -> Comparable interface + compareTo method overriding */

    /* 필기.
     *  우리가 원하는 필드의 오름차순 또는 내림차순 설정 가능
     *  필드 4개 -> 총 8가지의 정렬 기준 가능 (각 필드당  오름차순 또는 내림차순 가능)
     *  정렬은 compareTo 메소드가 반환하는 int형의 부호에 따라 정해지며,
     *  부호가 반대로 될 경우 오름차순과 내림차순의 개념이 반대로 적용
     *  오름차순 -> 매개변수로 넘어온 것을 빼주는 형태로 작성 (String형 제외)
    * */
    @Override
    public int compareTo(Object o) {
//        return this.price - ((BookDTO) o).price;
//      오름차순 정렬
        return ((BookDTO) o).price - this.price;        
        // 내림차순 정렬 (부호 이용해서 정렬 순서 정하기 때문에 변수 위치 통해 결과값 부호변경)
        // 변수 순서 바꾸거나 전체 값에 - 부호 붙이면 내림차순으로 변경 가능
    }
}
