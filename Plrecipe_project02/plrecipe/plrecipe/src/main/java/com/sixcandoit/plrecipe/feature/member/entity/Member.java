package com.sixcandoit.plrecipe.feature.member.entity;

import com.sixcandoit.plrecipe.feature.member.dto.MemberDTO;
import com.sixcandoit.plrecipe.feature.member.repository.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Member {

    private final MemberMapper memberMapper;

    @Autowired
    public Member(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<MemberDTO> selectAllMember() {
        return memberMapper.selectAllMember();
    }

    public List<MemberDTO> selectMemberByLikePost(String memberEmail) {
        return memberMapper.selectMemberByLikePost(memberEmail);
    }

}
