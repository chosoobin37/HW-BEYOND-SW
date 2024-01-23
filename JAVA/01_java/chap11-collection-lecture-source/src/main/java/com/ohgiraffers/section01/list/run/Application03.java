package com.ohgiraffers.section01.list.run;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. LinkedList 이해 */
        List<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size() + "개의 자료가 담김.");
        System.out.println();

        /* 설명. List 계열 출력하는 4가지 방법 */

        /* 설명. 1) toString() 활용하기 */
        System.out.println("linkedList = " + linkedList);
        System.out.println();

        /* 설명. 2) for문 활용하기 */
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println();

        /* 설명. 3) for-each문 (향상된 for문) 활용하기 */
        for (String str : linkedList) {
            System.out.println(str);
        }
        System.out.println();

        /* 설명. 4) iterator 활용하기 */
        /* 설명. 반복문 안에서 next()를 두 번 이상 사용하는 경우
        *   -> 의도한 것이 아니라면 변수 활동 때문에 유의해서 사용할 것 */
        Iterator<String> iter = linkedList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        /* 설명. 1번 인덱스(2번째)의 과일 수정 */ 
        linkedList.set(1, "pineapple");
        System.out.println(linkedList);

        /* 설명. list가 관리하는 요소들 제거 */ 
        linkedList.clear();
        System.out.println(linkedList);

        /* 설명. 요소가 없는 list 객체에 대해 boolean 값으로 확인 */ 
        System.out.println(linkedList.isEmpty());

    }
}
