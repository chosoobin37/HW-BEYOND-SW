package com.ohgiraffers.section01.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크 이해 */
        ArrayList aList = new ArrayList();
        // 다이아몬드 연산자 없는 generic class -> <Object>와 동일

        List list = new ArrayList();
//        Collection col = new ArrayList();        // 컬렉션 -> 다형성 적용한 형태로 많이 사용

        aList.add(123);
        aList.add("fubao");
        aList.add(new java.util.Date());

        System.out.println("alist: " + aList);
        System.out.println("첫번째 저장된 값: " + aList.get(0));
    }
}
