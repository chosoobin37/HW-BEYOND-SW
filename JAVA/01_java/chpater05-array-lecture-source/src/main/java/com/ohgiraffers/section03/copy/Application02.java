package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 깊은 복사에 대해 이해 */
        /* 필기.
         *  깊은 복사
         *  1. for문을 이용한 동일한 인덱스값 일일이 복사
         *  2. Object의 clone()을 이용한 복사 (사용 빈도 최상)
         *  3. System의 arraycopy()를 이용한 복사
         *  4. Arrays의 copyOf()를 이용한 복사
        * */

        int[] originArr = new int[]{1, 2, 3, 4};
        print(originArr, "원본");                       // 얕은 복사

        /* 목차. 1) for문 활용 */
        int[] copyArr1 = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1, "for문을 사용한 사본");

        /* 목차. 2) clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone을 사용한 사본");

        /* 목차. 3) arraycopy()를 이용한 복사 */
        int[] copyArr3 = new int[originArr.length];
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length );
                        // 원본 array의 0번째부터 원본배열의 길이만큼 복사
        print(copyArr3, "arraycopy()를 사용한 복사");
        
        /* 목차. 4) copyOf()를 이용한 복사 */
        int[] copyArr4 = Arrays.copyOf(originArr, 2);
        print(copyArr4, "copyOf()를 이용한 복사");
        // 원본의 처음부터 원하는 길이따지만 복사 가능

        // 각각의 hashcode가 다르게 출력 -> 사본이 정상적으로 생성
    }
    
    private static void print(int[] arr, String desc) {         // originArr -> arr로 얕은 복사 발생

        System.out.println("======="+desc+"========");
        /* 설명. 전달받은 배열의 주소값 출력 */
        System.out.println("넘어온 배열의 hashCode: " + arr.hashCode());

        /* 설명. 전달받은 배열값 출력 */
        System.out.println(Arrays.toString(arr));

    }
}
