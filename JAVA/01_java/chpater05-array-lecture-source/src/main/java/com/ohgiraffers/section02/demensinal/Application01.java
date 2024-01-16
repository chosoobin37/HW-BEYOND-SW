package com.ohgiraffers.section02.demensinal;

import java.util.Arrays;

public class Application01 {

    public static void main(String[] args) {
        /* 수업목표. 다차원 배열의 구조 이해 및 사용 */
        /* 필기.
         *  다차원 배열 -> 2차원 이상의 배열 (일반적으로 사람의 인지 범위에 맞게 최대 3차원 고려)
        * */

        int[][] iArr1;
        int[][] iArr2;

        iArr1 = new int[3][2];          // 2칸짜리 1차원 배열 3개 관리 (관리하는 1차원 배열의 길이 동일) -> 정변 배열
        iArr2 = new int[3][];           // 크기 현재 미정 (관리하는 1차원 배열의 길이 동일 X) -> 가변 배열

        int num=0;
        for (int i = 0; i < iArr1.length; i++) {                // 1차원 배열 고르는 for문
            for (int j = 0; j < iArr1[i].length; j++) {         // 선택된 1차원 배열의 길이만큼 반복하는 for문
                iArr1[i][j] = num++;
            }
            System.out.println(Arrays.toString(iArr1[i]));
        }

        int length = 1;
        for (int i = 0; i < iArr2.length; i++) {                // 1차원 배열 고르는 for문
            iArr2[i] = new int[++length] ;
            for (int j = 0; j < iArr2[i].length; j++) {         // 선택된 1차원 배열의 길이만큼 반복하는 for문
                iArr2[i][j] = num++;
            }
            System.out.println(Arrays.toString(iArr2[i]));
        }

//        iArr1[0]=new int[2];
//        iArr1[1]=new int[3];

    }
}
