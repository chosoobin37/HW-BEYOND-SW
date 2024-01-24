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
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}