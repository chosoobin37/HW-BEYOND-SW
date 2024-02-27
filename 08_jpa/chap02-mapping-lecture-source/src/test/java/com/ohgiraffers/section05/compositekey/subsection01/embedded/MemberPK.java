package com.ohgiraffers.section05.compositekey.subsection01.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

/* 설명.    
 *  EmbeddableType -> 하나의 값의 묶음이자 불볍 객체로 다루는 타입
 *  setter X, 필드값에 변화흫 주고 싶으면 새로운 필드를 가지는 새로운 객체 생성 필요
 *  equals, hashCode Override 필수
 *  VO와 유사하며, @EmbeddedId로 복합키를 표현하고자 할 때도 사용 가능
* */

@Embeddable
public class MemberPK implements Serializable {

    @Column(name = "member_no")
    private int memberNo;

    @Column(name = "member_id")
    private String memberId;

    public MemberPK() {
    }

    public MemberPK(int memberNo, String memberId) {
        this.memberNo = memberNo;
        this.memberId = memberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberPK memberPK = (MemberPK) o;
        return memberNo == memberPK.memberNo && Objects.equals(memberId, memberPK.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberNo, memberId);
    }
}