package com.ohgiraffers.section03.uses;

import java.awt.image.BufferStrategy;
import java.io.*;

public class Application02 {
    public static void main(String[] args) {

        /* 수업목표. try-with-resource 구문 문법 이해 및 활용 */
        try (BufferedReader br = new BufferedReader(new FileReader("test.dat"))) {
            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
