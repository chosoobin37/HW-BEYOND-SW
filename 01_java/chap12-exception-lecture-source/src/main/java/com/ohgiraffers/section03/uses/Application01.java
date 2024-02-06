package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 예외처리를 많이 사용하는 io 패키지에서 사용하는 구문 이해 */
        /* 설명.     
         *  예외처리를 가장 많이 사용하게 되는 상황에서 try-catch 구문 실제 상황과 유사하게 연습
         *  문법보다 호출 흐름에 포커스
        * */
        System.out.println(new File("test.dat").getAbsoluteFile());

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test1.dat"));

            String s="";
//            System.out.println(br.readLine());

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일 못 찾겠어잉");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            /* 필기.
            *   예외처리 구문과 상관없이 반드시 수행해야 하는 경우 -> finally에 작성
            *   보통 사용한 자원을 반납할 목적으로 사용 */
            try {
                /* 설명. 
                 *  스트림이 생성되지 않았을 때 접근해서 close() 메소드 호출 -> NullPointerException 발생 가능
                 *  따라서, NullPointerException 방지 위한 if문 활용
                * */
                if (br != null) {

                    /* 설명.
                     *  입출력에서 사용한 스트림을 닫아주는 메소드
                     *  API에서 확인하면 IOException을 thorws 하는 메소드 ->
                     *  finally 블럭 안이어도 또 예외 처리 중첩으로 해야하함
                    * */
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
