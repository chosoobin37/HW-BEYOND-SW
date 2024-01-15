package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 배열에 초기화 되는 자료형별 기본값 이해 */
        /* 필기.
         *  값의 형태 별 기본값
         *  정수(0), 실수(0.0), 논리(false), 문자(\u0000). 참조(null)
         * */

        int[] iArr = new int[5];
        System.out.println(Arrays.toString(iArr));
        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr));

        /* 설명. 크기 할당 시 다른 초기값을 할당하고 싶을 때 */
        int[] iArr2 = {10, 11, 12, 13, 14};
        int[] iArr3 = new int[]{10, 11, 12, 13, 14};

        /* 설명. 문자열도 배열로 저장 가능 */
        String[] sArr={"apple", "banana", "cherry", "orange"};

        /* 설명. 다양한 출력 방법 (1차원 배열) */

        /* 설명. 1. 단순 for문 사용 */
        for (int i = 0; i < sArr.length; i++) {
            System.out.println(sArr[i]);
        }

        /* 설명. 2. Arrays.toString */
        System.out.println(Arrays.toString(sArr));

        /* 설명. 2. Arrays.toString */
        for (String str: sArr) {
            System.out.println(str);

        }
    }

}
