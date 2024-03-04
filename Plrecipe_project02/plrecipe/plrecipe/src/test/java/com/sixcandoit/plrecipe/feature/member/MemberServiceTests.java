package com.sixcandoit.plrecipe.feature.member;

import com.sixcandoit.plrecipe.feature.member.dto.MemberDTO;
import com.sixcandoit.plrecipe.feature.member.entity.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class MemberServiceTests {

    @Autowired
    private Member memberService;

    @Test
    void viewAllMember() {
        List<MemberDTO> member = memberService.selectAllMember();
        member.forEach(System.out::println);

        assertNotNull(member);
    }

    @ParameterizedTest
    @ValueSource(strings = {"kim123@kakao.com"})
    void selectMemberByLikePost(String memberEmail) {
        List<MemberDTO> memberList3 = memberService.selectMemberByLikePost(memberEmail);
        memberList3.forEach(System.out::println);

        assertTrue(!memberList3.isEmpty());
    }
}