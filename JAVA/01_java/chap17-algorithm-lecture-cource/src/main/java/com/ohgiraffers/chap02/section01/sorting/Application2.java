package com.ohgiraffers.chap02.section01.sorting;

import java.util.Scanner;

/* 수업목표. 선택정렬 이해 */
/* 필기.
 *  Selected Sort -> 대상 데이터에서 최대나 최소 데이터를 찾아 맨 앞 혹은 맨 뒤와 교환하는 방법
 *  배열의 모든 요소에 대해 반복적
 *  시간 복잡도 O(n^2) -> 비효율적
* */
public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 설명. 입력 데이터 받기 */
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();                  // 공백을 구분자로 하여 하나씩 입력 됨.
        }
        /* 설명. 알고리즘 실행 */
        solution(length, arr);

        /* 설명 정렬 결과 출력하기 */
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void solution(int length, int[] arr) {
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;

            /* 설명. j 범위에서 가장 큰 값을 maxIndex에 저장 */
            for (int j = i + 1; j < length; j++) {
                if (arr[i] < arr[j]) {
                    maxIndex = j;
                    int temp = arr[i];
                    arr[i] = arr[maxIndex];
                    arr[maxIndex] = temp;
                }
            }
        }
    }
}
