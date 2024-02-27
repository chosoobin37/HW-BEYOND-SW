package com.ohgiraffers.section04.enumtype;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumTypeMappingTests {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @BeforeAll
    public static void initFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory("jpatest");
    }

    @BeforeEach
    public void initManager() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }

    @AfterEach
    public void closeManager() {
        entityManager.close();
    }

    @Test
    public void enum_타입_매핑_테스트() {

        Member member = new Member();
        member.setMemberNo(1);
        member.setMemberId("user01");
        member.setMemberPwd("pass01");
        member.setNickname("조먹밥");
        member.setPhone("010-1234-5678");
        member.setEmail("chomuckbab@naver.com");
        member.setAddress("서울시 마포구");
        member.setEnrollDate(new java.util.Date());
        member.setMemberRole(RoleType.MEMBER);
        member.setStatus("Y");

        entityManager.persist(member);

        Member foundMember = entityManager.find(Member.class, member.getMemberNo());
        assertEquals(member.getMemberNo(), foundMember.getMemberNo());
        System.out.println("foundMember = " + foundMember);
    }
}
