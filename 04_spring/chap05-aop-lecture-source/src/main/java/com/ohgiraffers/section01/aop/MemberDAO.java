package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberDAO {
    private final List<MemberDTO> memberList;

    public MemberDAO() {
        memberList = new ArrayList<>();
        memberList.add(new MemberDTO(0, "유관순"));
        memberList.add(new MemberDTO(1, "홍길동"));
    }
    public List<MemberDTO> selectAllMembers() {
        return memberList;
    }
    public MemberDTO selectMemberBy(int index) {
        System.out.println("DAO의 index: " + index);
        System.out.println(memberList.get(index));
        return memberList.get(index);
    }
}
