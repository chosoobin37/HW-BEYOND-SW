package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 입출력 스트림 이해 및 파일 대상 FileInputStream 사용 */
        FileInputStream fin = null;

        try {
            fin = new FileInputStream
                    ("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

//            System.out.println((char)fin.read());

            /* 필기.
             *  FileInputStream에서 제공하는 read()메소드를 활용 -> 데이터 1바이트씩 읽을 수 있다.
             *  read()메소드 -> int 값 반환, 더 이상 데이터 존재 X -> -1 (EOF: End Of File) 반환
             *  이 원리 활용 -> 파일의 끝까지 1바이트씩 읽고 처리 가능
             *  반환한 값이 int -> 문자로 활용하기 위해서는 char로 형변환 진행 필요
             * */

            int input = 0;
//            while((input = fin.read()) != -1) {
//                System.out.println((char)input);
//            }

            /* 설명. 파일로부터 읽어온 값 -> ArrayList에 누적 */
            List<Character> arr = new ArrayList<>();
            while((input = fin.read()) != -1) {
                arr.add((char) input);
            }

            for(char ch: arr) {
                System.out.print(ch);
            }

        } catch (FileNotFoundException e) {
            System.out.println("해당 파일 존재 X");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
