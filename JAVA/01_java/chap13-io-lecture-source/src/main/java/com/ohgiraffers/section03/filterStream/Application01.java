package com.ohgiraffers.section03.filterStream;

import java.io.*;

public class Application01 {
    public static void main(String[] args) {
        /* 수업목표. BufferedWriter와 BufferedReader 이해 및 사용 */
        /* 필기.
         *  내부적으로 버퍼 활용해서 입출력 성능 향상
         *  추가적인 메소드 제공
         * */

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new FileWriter("src/main/java/com/ohgiraffers/section03/fileStream/testBuffered.txt"));

            bw.write("드디어 푸바오가 당근을 먹을 수 있어 \n");
            bw.write("드디어 푸바오가 워토우를 먹을 수 있어\n");
            bw.write("푸바오는 사과를 제일 좋아해 ~ ");

            /* 설명.
             *  버퍼를 이용해서 출력을 하는 경우 -> 버퍼 공간이 가득 차지 않으면 내보내기(출력)가 안 되는 경우 존재
             *  -> 버퍼에 담긴 내용을 강제로 내보내기 위해 flush() 활용
             *  (write를 했는데 파일에 값이 안 적혀있으면 flush() 활용)
             *  -
             *  stream을 close()하면 내부적으로 flush() 호출하긴 함
             * */
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        /* 설명. BufferedWriter를 활용한 한 줄씩 출력하기 */
        BufferedReader br = null;
        try {
            br = new BufferedReader(
                    new FileReader("src/main/java/com/ohgiraffers/section03/fileStream/testBuffered.txt"));
            String str = "";
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
                e.printStackTrace();
            } finally {
        try {
            if (br != null) br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            }
    }
}
