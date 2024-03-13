package com.sixcandoit.plrecipe_member.query.controller;

import com.sixcandoit.plrecipe_member.query.dto.MemberDTO;
import com.sixcandoit.plrecipe_member.query.service.MemberService;
import com.sixcandoit.plrecipe_member.query.vo.ResponseMember;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/plrecipe-member")
public class MemberController {

    private final MemberService memberService;
    private final ModelMapper modelMapper;

    @Autowired
    public MemberController(MemberService memberService, ModelMapper modelMapper) {
        this.memberService = memberService;
        this.modelMapper = modelMapper;
    }

    // 회원전체조회
    @GetMapping("/members")
    public List<MemberDTO> selectAllMember() {
        return memberService.selectAllMember();
    }

    // 회원ID로 회원 조회
    @GetMapping("/searchMember/{memberId}")
    public ResponseEntity<ResponseMember> selectMemberById(@PathVariable("memberId")int memberId) {

        MemberDTO memberDTO = memberService.selectMemberById(memberId);
        ResponseMember returnValue = modelMapper.map(memberDTO, ResponseMember.class);

        return ResponseEntity.status(HttpStatus.OK).body(returnValue);
    }

}