package com.sixcandoit.plrecipe_member.feature.member.service;

import com.sixcandoit.plrecipe_member.feature.member.dto.MemberDTO;
import com.sixcandoit.plrecipe_member.feature.member.entity.Member;
import com.sixcandoit.plrecipe_member.feature.member.repository.MemberMapper;
import com.sixcandoit.plrecipe_member.feature.member.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {
    private final ModelMapper mapper;
    private final MemberMapper memberMapper;
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(ModelMapper mapper, MemberMapper memberMapper, MemberRepository memberRepository) {
        this.mapper = mapper;
        this.memberMapper = memberMapper;
        this.memberRepository = memberRepository;
    }

//    @Override
//    public MemberDTO selectMemberById(int memberId) {
//        Member member = memberRepository.findById(memberId).orElseThrow(IllegalArgumentException::new);
//        return mapper.map(member, MemberDTO.class);
//    }
    @Override
    public void registMember(MemberDTO memberDTO) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateTest = format.format(date);

        Member member = mapper.map(memberDTO, Member.class);
        member.setJoinDate(dateTest);

        memberRepository.save(member);
    }

    @Override
    public void modifyMember(MemberDTO modifyMember) {

    }

//    @Override
//    public void modifyMember(MemberDTO modifyMember) {
//    }

    //    ---------------------------------------------------------------
    @Override
    public List<MemberDTO> selectAllMember() {
        return memberMapper.selectAllMember();
    }

    @Override
    public MemberDTO selectMemberById(int memberId) {
        Optional<Member> userEntity = memberRepository.findById(memberId);
        MemberDTO userDTO = mapper.map(userEntity, MemberDTO.class);

        return userDTO;
    }

    @Override
    public List<MemberDTO> selectMemberByLikePost(int memberId) {
        return memberMapper.selectMemberByLikePost(memberId);
    }

//    @Override
//    public List<MemberDTO> selectMemberById(int memberId) {
//        return memberMapper.selectMemberById(memberId);
//    }

}