package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. 표준입출력 이해 및 활용 */

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("문자열 입력: ");
        try {
            String value=br.readLine();

            System.out.println("value: "+value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        BufferedWriter bw = null;
        OutputStreamWriter osw = null;
        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);

        try {
            bw.write("println 정상작동 ...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
