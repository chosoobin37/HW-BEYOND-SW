package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. FileReader 이해 및 활용 */
        /* 필기.
         *  FileReader -> 인코딩 방식에 맞게 한 글자씩 입력 받을 수 있는 스트림
         *  숫자/특수기호/영어 -> 1byte, 한글/그외 언어 -> 3byte (UTF-8기준)
         * */
        FileReader fr = null;

        try {
            fr = new FileReader
                    ("src/main/java/com/ohgiraffers/section02/stream/testReader.txt");
            int readChar = 0;
            while((readChar = fr.read()) != -1){
                System.out.print((char)readChar);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if(fr != null) fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}