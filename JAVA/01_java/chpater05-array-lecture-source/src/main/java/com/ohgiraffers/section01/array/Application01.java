package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application01 {

    public static void main(String[] args) {
        /* 수업목표. 배열 및 배열의 사용 목적 이해 */
        /* 필기.
         *  동일한 자료형의 묶음 -> 연속된 메모리 공간에 값 저장하고 사용하기 위한 용도
         *  heap 영역에 new 연산자 이용하여 할당
        * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;


        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        /* 필기. 이와 같은 작업을 배열 활용해 표현 */

        int[] arr = new int[5];
//        arr[0]=10;
//        arr[1]=20;
//        arr[2]=30;
//        arr[3]=40;
//        arr[4]=50;

        /* 설명. 각 배열에 접근해 각각 값 대입 */
        for (int i = 0; i < 5; i++) {
            arr[i] += 10*(i+1);
            System.out.println(arr[i]);
        }

        /* 설명. 각 배열에 접근해 값 불러와 출력하기 */
        System.out.println("배열의 길이: "+arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = "+arr[i]);
        }

        /* 설명. 1차원 배열을 한 번에 문자열로 출력할 때 간단히 출력하기 */
        System.out.println(Arrays.toString(arr));
    }
}
