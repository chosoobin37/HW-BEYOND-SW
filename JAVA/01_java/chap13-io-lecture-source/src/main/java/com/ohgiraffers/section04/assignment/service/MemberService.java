package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.repository.MemberRepository;

/* 설명. Transaction 성공실패 여부 확인 및 회원 관련 비지니스 로직 처리하는 클래스 */
public class MemberService {
    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }
}
