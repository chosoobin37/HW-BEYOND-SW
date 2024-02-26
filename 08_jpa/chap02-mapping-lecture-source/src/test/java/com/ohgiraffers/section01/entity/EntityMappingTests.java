package com.ohgiraffers.section01.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityMappingTests {

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
    public void 테이블_만들기_테스트() {

        // given
        Member member = new Member();
        member.setMemberNo(1);
        member.setMemberId("user01");
        member.setMemberPwd("pass01");
        member.setNickname("조먹밥");
        member.setPhone("010-1234-5678");
        member.setEmail("chomuckbab@naver.com");
        member.setAddress("서울시 마포구");
        member.setEnrollDate(new java.util.Date());
        member.setMemberRole("ROLE_MEMBER");
        member.setStatus("Y");

        // when
        entityManager.persist(member);

        // then
        Member foundMember = entityManager.find(Member.class, 1);
        assertEquals(member, foundMember);
    }
}
