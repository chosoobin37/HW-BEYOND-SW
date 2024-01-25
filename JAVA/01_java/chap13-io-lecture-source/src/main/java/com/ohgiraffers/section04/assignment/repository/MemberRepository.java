package com.ohgiraffers.section04.assignment.repository;

import com.ohgiraffers.section04.assignment.aggergate.Blood_Type;
import com.ohgiraffers.section04.assignment.aggergate.Member;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/* 설명. 데이터와 입출력을 위해 만들어지며, 성공실패 결과를 반환하는 클래스 */
public class MemberRepository {

    /* 설명. 프로그램이 켜지자 마자 (MemberRepository()가 실행되자마자 파일에 dummy 데이터 추가 및 입력 */
    public MemberRepository() {
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(1, "user01", "pass01", 20, new String[]{"발레", "수영"}, Blood_Type.A));
        members.add(new Member(2, "user02", "pass02", 20, new String[]{"발레", "수영"}, Blood_Type.A));
        members.add(new Member(3, "user03", "pass03", 20, new String[]{"발레", "수영"}, Blood_Type.A));

        saveMembers(members);
    }

    private void saveMembers(ArrayList<Member> members){
        ObjectOutputStream oos = null;

        try {
            oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream
                    ("src/main/java/com/ohgiraffers/section04/assignment/db/memberDB.dat")));

            for(Member m: members) {
                oos.writeObject(m);
            }

            oos.flush();            // 출력 시에는 flush 해줄 것
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(oos!=null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


