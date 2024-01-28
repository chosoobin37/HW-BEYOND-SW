package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application04 {
    public static void main(String[] args) {
        
        /* 수업목표. FileWriter 이해 및 활용 */
        FileWriter fw = null;
        try {
            fw = new FileWriter
                    ("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");
            fw.write('한');
            fw.write('글');
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fw!=null) fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
