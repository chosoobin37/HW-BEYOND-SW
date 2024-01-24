package com.ohgiraffers.section03.fileStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. BufferedWriter와 BufferedReader 이해 및 사용 */
        /* 필기.
         *  내부적으로 버퍼 활용해서 입출력 성능 향상
         *  추가적인 메소드 제공
        * */

        BufferedWriter bw = null;
        try {
            bw=new BufferedWriter(
                    new FileWriter("src/main/java/com/ohgiraffers/section03/fileStream/testBuffered.txt"));

                bw.write("드디어 푸바오가 당근을 먹을 수 있어 ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(bw!=null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
