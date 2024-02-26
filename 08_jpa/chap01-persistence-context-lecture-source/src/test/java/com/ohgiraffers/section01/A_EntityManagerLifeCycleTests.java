package com.ohgiraffers.section01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

public class A_EntityManagerLifeCycleTests {

    /* 필기.
     *  엔티티 매니저 팩토리(EntityManagerFactory)란?
     *  엔티티 매니저를 생성할 수 있는 기능을 제공하는 팩토리 클래스
     *  thread-safe 하기 때문에 여러 스레드가 동시에 접근해도 안전 -> 서로 다른 스레드 간 공유해서 재사용
     *  thread-sage 한 기능을 요청 스코프마다 생성하기에는 비용(시간 및 메모리) 부담이 크므로
     *  application 스코프와 동일하게 싱글톤으로 생성해서 관리하는 것이 효율적
     *  -> 데이터베이스를 사용하는 애플리케이션 당 한 개의 EntityManagerFactory 생성
     *  - 
     *  엔티티 매니저(EntityManager)란?
     *  엔티티 매니저는 엔티티를 저장하는 메모리 상의 데이터베이스를 관리하는 인스턴스
     *  엔티티 저장, 수정, 삭제, 조회하는 등의 엔티티와 관련된 모든 일 처리
     *  엔티티 매니저는 thread-safe X -> 동시성 문제 발생 가능
     *  따라서 스레드 간 공유 X, web -> 일반적으로 request scope와 일치시킴
     *  - 
     *  영속성 컨텍스트(PersistenceContext)란?
     *  엔티티 매니저를 통해 엔티티 저장 및 조회할 경우 -> 엔티티 매니저는 영속성 컨텍스트에 엔티티 보관 및 관리
     *  영속성 컨텍스트는 엔티티를 key-value 방식으로 저장하는 저장소
     *  영속성 컨텍스트는 엔티티 매니저를 생성할 때 같이 하나 만들어짐
     *  엔티티 매니저를 통해서 영속성 컨텍스트에 접근 및 관리 가능
    * */

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

    @Test
    public void 엔티티_매니저_팩토리와_매니저_생명주기_확인() {
        System.out.println("entityManagerFactory.hashCode: " + entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode: " + entityManager.hashCode());
    }

    @Test
    public void 엔티티_매니저_팩토리와_매니저_생명주기_확인2() {
        System.out.println("entityManagerFactory.hashCode: " + entityManagerFactory.hashCode());
        System.out.println("entityManager.hashCode: " + entityManager.hashCode());
    }

    @AfterAll
    public static void closeFactory() {
        entityManagerFactory.close();
    }

    @AfterEach
    public void closeManager() {
        entityManager.close();
    }
}
