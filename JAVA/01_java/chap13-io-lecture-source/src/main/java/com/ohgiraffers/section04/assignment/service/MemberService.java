package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. Transaction 성공실패 여부 확인 및 회원 관련 비즈니스 로직 처리 클래스 */
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void selectAllMembers() {
        ArrayList<Member> selectedMembers = mr.selectAllMembers();

        /* 설명. 회원이 한명도 없어서 조회 결과가 없더라도 ArrayList객체는 넘어온다.(Empty상태로) */
        if(!selectedMembers.isEmpty()) {        // 회원이 한명이라도 조회 된다면
//            System.out.println("==== service까지 잘 반환되어 오나 확인 ====");
            for(Member m: selectedMembers) {
                System.out.println(m);
            }
            return;                             // 이후 코드와 상관 없이 메소드 종료
        }

        /* 설명. 조건이 맞지 않은 경우 출력할 구문 (else 사용 X) -> 조회할 회원 X, 위의 조건이 맞으면 실행 X */
        System.out.println("현재 조회할 수 있는 회원이 없습니다.");
    }

    /* 설명. 전달된 회원 번호를 활용해 repository에 있는 memberList로부터 해당 회원 찾아 반환 받기 */
    public void selectMember(int memNo) {
        Member selectedMember = mr.selectMember(memNo);

        if(selectedMember == null) {
            System.out.println("존재하지 않는 회원입니다.");
        } else {
            System.out.println("조회된 회원: " + selectedMember);
        }
    }

    /* 설명. 입력받아 넘어온 회원이 가질 번호를 만들고 추가 후 repository로 전달 후 결과 확인 */
    public void registMember(Member member) {
//        System.out.println("사용자가 입력해서 넘겨준 Member 확인: " + member);

        int lastMemberNo = mr.selectLastMemberNo();
        member.setMemNo(lastMemberNo + 1);

        int result = mr.registMember(member);
        if(result == 1) {
            System.out.println(member.getId() + "님의 회원가입이 성공하였습니다.");
        }
    }
    public void deleteMember(int memNo) {
        int result = mr.deleteMember(memNo);
        if (result > 0) {
            System.out.println(memNo+"번 회원 탈퇴 성공하였습니다.");
            return;
        }

        System.out.println();
    }
}






