package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import java.io.*;

public class Application04 {
    public static void main(String[] args) {

        /* 수업목표. 객체단위 입출력 보조스트임을 이해하고 활용할 수 있다. */
        MemberDTO[] memArr = new MemberDTO[3];
        memArr[0] = new MemberDTO("User01", "pass01", "홍길동", "hong123@gmail.com", 20, '남');
        memArr[1] = new MemberDTO("User02", "pass02", "유관순", "you345@gmail.com", 16, '여');
        memArr[2] = new MemberDTO("User03", "pass03", "강감찬", "korea678@gmail.com", 42, '남');

        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream(        // Serializable 인터페이스를 구현하지 않으면 오류 발생.
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));
            for (int i = 0; i < memArr.length; i++) {
                objOut.writeObject(memArr[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (objOut != null) objOut.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* 설명. 출력이 된 객체를 입력받아 확인하기 위한 새로운 MemberDTO[] 생성 */
        MemberDTO[] inputMembers = new MemberDTO[memArr.length];

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObject.txt")));

            int i = 0;
            while (true) {
                inputMembers[i] = (MemberDTO)(ois.readObject());
                i++;
            }

        } catch (EOFException e) {
            System.out.println("객체 단위 파일 입력 완료.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            /* 설명. 입력받아 새로운 MemberDTO[]에 저장된 회원들 확인 */
            for (MemberDTO each : inputMembers) {
                System.out.println(each);
            }
        }
    }
}