package com.ohgiraffers.section03.stringbuilder;

public class Application02 {
    public static void main(String[] args) {
        
        /* 수업목표. StringBuilder의 자주 사용되는 메소드 용법 이해 */
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        /* 필기. capacity(): 용량을 정수형으로 반환하는 메소드 (초기 16byte 할당) */
        for (int i = 0; i < 50; i++) {
            sb.append(i);

            /* 설명. 용량은 초과할 것 같은 (*2 +2)만큼씩 증가 */
            System.out.println("sb: " + sb);
            System.out.println("capacity: " + sb.capacity());
            System.out.println("hashCode: " + System.identityHashCode(sb));
        }

        StringBuilder sb2 = new StringBuilder("javamariaDB"); // 문자열 크기 + 16byte
        
        /* 필기.
         *  delete(): 시작 인덱스와 종료 인덱스를 이용해 문자열에서 원하는 부분의 문자열 제거
         *  deleteCharAt(): 문자열 인덱스를 이용해 문자 하나 제거
        * */

        System.out.println("delete(): " + sb2.delete(2, 5));
        System.out.println("deleteCharAt(): "+sb2.deleteCharAt(0));
    }
}
