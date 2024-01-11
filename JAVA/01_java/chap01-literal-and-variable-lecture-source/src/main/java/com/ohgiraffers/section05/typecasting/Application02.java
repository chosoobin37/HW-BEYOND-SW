package com.ohgiraffers.section05.typecasting;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 강제 형변환 규칙 이해 */
        /* 필기.
         *  강제 형변환 -> 바꾸려는 자료형으로 캐스트 연산자(자료형)를 이용하여 형변환
        * */

        long lnum = 800000000000L;              // 다운캐스팅 주의 -> 데이터 손실 감수
        int inum = (int)lnum;
        System.out.println("inum: "+inum);

        float avg = 31.235f;                    // 실수 변수에서 정수로 다운캐스팅 -> 소수점 이하 제거(버림)
        int floorNum = (int)avg;
        System.out.println("floorNum: "+floorNum);










    }
}
