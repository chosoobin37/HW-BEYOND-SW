package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application01 {
    public static void main(String[] args) {
        
        /* 수업목표. Set 자료구조 특성 이해 및 hashSet 이용 */
//        HashSet<String> hset = new HashSet<>();
        Set<String> hset = new HashSet<>();
        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        /* 설명. Set에 저장된 자료 -> 넣은 순서 보장 X */
        System.out.println("hset: " + hset);

        /* 설명. 중복값은 Set에 추가X, 동등 객체 저장X -> equals 및 hashCode 오버라이딩 필수 */
        /* 설명. 중복되는 값이 있으면 새로 추가하려는 객체의 주소 튕겨나감 (덮어쓰지 않음) */
        hset.add(new String("mariaDB"));
        System.out.println("hset: " + hset);

        /* 설명. 인덱스 개념이 없는 Set -> iterator(반복자)를 돌리거나 배열로 바꿔야 확인 가능 */
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        Object[] objArr = hset.toArray();
        for (Object obj : objArr) {
            System.out.println((String) obj);
        }

        System.out.println("size(): " + hset.size());
        hset.clear();
        System.out.println("size(): " + hset.size());
        System.out.println("" + hset.isEmpty());
    }
}
