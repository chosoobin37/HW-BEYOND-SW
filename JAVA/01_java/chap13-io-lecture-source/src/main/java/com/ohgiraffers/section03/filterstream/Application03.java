package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application03 {
    public static void main(String[] args) {

        /* 수업목표. 데이터타입 입출력 보조스트림을 이해하고 활용할 수 있다.(Reader 또는 Writer 계열 X) */
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(
                    new FileOutputStream
                            ("src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"));

            /* 설명. data 타입 별로 해당 데이터 타입에 만즌 출력 메소드를 활용하여 파일에 출력하기 (순서 중요) */

            dos.writeUTF("홍길동");
            dos.writeInt(20);
            dos.writeChar('A');

            dos.writeUTF("유관순");
            dos.writeInt(16);
            dos.writeChar('B');

            dos.writeUTF("강감찬");
            dos.writeInt(46);
            dos.writeChar('C');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        DataInputStream dis = null;

        try {
            dis = new DataInputStream(
                    new FileInputStream
                            ("src/main/java/com/ohgiraffers/section03/filterstream/testData.txt"));

            /* 설명. 입력받을 때도 출력 순서 지켜서 입력 */ 
            while(true) {
                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readChar());
            }

        } catch (EOFException e) {
            
            /* 설명. data 입출력 -> EOFEException 활용하여 파일의 끝까지 입력받는 것 처리 가능 */
            System.out.println("파일 읽기 완료 ...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}











