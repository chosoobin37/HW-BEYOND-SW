package com.ohgiraffers.section02.column;

import com.ohgiraffers.section01.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColumnMappingTests {
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
    public void closeManager() {entityManager.close();}

    @Test
    public void 컬럼에서_사용하는_속성_테스트() {
        // given
        com.ohgiraffers.section01.entity.Member member = new com.ohgiraffers.section01.entity.Member();
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
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(member);

        // then
        com.ohgiraffers.section01.entity.Member foundMember = entityManager.find(Member.class, 1);
        foundMember.setNickname("먹밥쿤 .. !!");

        entityTransaction.commit();
        assertEquals(member, foundMember);

    }

}