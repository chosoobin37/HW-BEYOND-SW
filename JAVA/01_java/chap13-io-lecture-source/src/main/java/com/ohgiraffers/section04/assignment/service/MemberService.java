package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.aggergate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.awt.*;
import java.util.ArrayList;

/* 설명. Transaction 성공실패 여부 확인 및 회원 관련 비지니스 로직 처리하는 클래스 */
public class MemberService {
    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    /* 설명. 회원이 한 명도 없어서 조회 결과가 없더라고 ArrayList 객체는 넘어온다. (Empty 상태로) */
    public void selectAllMembers() {
        ArrayList<Member> selectedMembers = mr.selectAllMembers();
        if (!selectedMembers.isEmpty()) {           // 회원이 한 명이라도 있을 경우 조회 가능
            System.out.println(" === service 까지 잘 반환되나 확인 ===");
            for (Member m : selectedMembers) {
                System.out.println(m);
            }
            return;                                 // 이후 코드와 상관 없이 메소드 종료
        }
        /* 설명. 조건이 맞지 않아 (조회할 회원이 없어) 출력을 하는 구문 (위의 조건이 맞으면 실행 X)
        *   else 안 쓰기 통해 구현 */
        System.out.println("아직 조회할 회원이 없습니다.");
        return;
    }
    /* 설명. 전달된 회원번호를 활용해  */
    public void selectMember(int memNo) {
        Member selectedMember = mr.selectMember(memNo);

        if (selectedMember != null) {
            System.out.println("회원 정보가 없습니다.");
        } else {
            System.out.println("조회된 회원은: " + selectedMember);
        }
    }
    /* 설명. 전달된 회원 번호를 홯용해 repository 에 있는 memberList 로부터 해당 회원 찾아 반환 받기 */

}
