package com.sixcandoit.plrecipe_member.feature.member.service;

import com.sixcandoit.plrecipe_member.feature.member.dto.MemberDTO;
import com.sixcandoit.plrecipe_member.feature.member.entity.Member;

import java.util.List;

public interface MemberService {

    List<MemberDTO> selectAllMember();
    MemberDTO selectMemberById(int memberId);
    List<MemberDTO> selectMemberByLikePost(int memberId);

    void registMember(MemberDTO memberDTO);
    void modifyMember(MemberDTO modifyMember);
}
