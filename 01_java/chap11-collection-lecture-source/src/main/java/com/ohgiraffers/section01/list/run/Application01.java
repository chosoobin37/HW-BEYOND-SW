package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. Collection Framework 이해 */
        ArrayList aList = new ArrayList();
//        다이아몬드 연산자 없는 generic class -> <Object>와 동일

        List list = new ArrayList();
//        Collection col = new ArrayList();
//        컬렉션 -> 다형성 적용한 형태로 많이 사용

        aList.add(123);             // String -> Object
        aList.add("fubao");         // 123 -> (Integer)123 -> Object
        aList.add("panda world");
        aList.add(new java.util.Date());

        System.out.println();
        System.out.println("alist: " + aList);
        System.out.println("첫번째 저장된 값: " + aList.get(0));
        System.out.println("두번째 저장된 값: " + aList.get(1));
        System.out.println("aList에 담긴 데이터 크기: " + aList.size());    // ArrayList에 추가한 값의 크기
        System.out.println();

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i).toString());
        }
        System.out.println();

        /* 필기.
         *  배열보다 ArrayList가 나은 점
         *  1. 초기 크기 할당 불필요        2. 중간에 값 추가 및 삭제 용이
        * */

        /* 설명. 배열과 ArrayList를 활용해 각각 원하는 인덱스에 값 추가 */
        int[] intArr = new int[5];
        int num = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = ++num;
        }
        System.out.println(Arrays.toString(intArr));
        System.out.println();

        int[] newArr = new int[intArr.length + 1];
        System.arraycopy(intArr, 0, newArr, 0, intArr.length);
        System.out.println(Arrays.toString(newArr));
        System.out.println();

        /* 설명. 2번 인덱스 자리에 7 끼워넣기 */
//        for (int 1 = newArr.length - 2; i > 1; i--)
        for (int i = newArr.length - 2; i > 1; i--) {
            newArr[i + 1] = newArr[i];
        }

        // 기존의 값을 뒤로 옮길 때 앞의 인덱스부터 옮기면 안됨
        System.out.println(Arrays.toString(newArr));
        newArr[2] = 7;
        System.out.println(Arrays.toString(newArr));
        System.out.println();

        /* 설명. ArrayList에서 제공하는 add 메소드 활용 */
        ArrayList<Integer> intArrList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intArrList.add(i + 1);
        }
        System.out.println(intArrList);
        intArrList.add(2, 7);
        System.out.println(intArrList);
        System.out.println();

        /* 설명. ArrayList는 중복 저장 허용 */
        System.out.println(aList);
        aList.add("fubao");
        aList.add(123);
        System.out.println(aList);
        System.out.println();

        /* 설명. set() 메소드로 원하는 인덱스 값을 원하는 값으로 수정 가능 */
        aList.set(1, 412);
        System.out.println(aList);
        System.out.println();

        /* 설명. remove() 메소드로 원하는 인덱스의 값 삭제  */
        aList.remove(1);
        System.out.println(aList);
        System.out.println();

        /* 설명. ArrayList를 활용해 정렬 진행 */
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("stringList = " + stringList);
        System.out.println();

        /* 설명. Collections의 sort() 메소드를 활용한 정렬 */
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);
        System.out.println();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(412);
        integerList.add(37);
        integerList.add(125);
        integerList.add(58);
        integerList.add(40);

        System.out.println("integerList = " + integerList);
        System.out.println();

        Collections.sort(integerList);
        System.out.println("integerList = " + integerList);
        System.out.println();

        /* 설명. 내림차순으로 바꾸기 위해 ArrayList -> LinkedList로 교체 */
        stringList = new LinkedList<>(stringList);
        Iterator<String>iter = ((LinkedList<String>)stringList).descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
