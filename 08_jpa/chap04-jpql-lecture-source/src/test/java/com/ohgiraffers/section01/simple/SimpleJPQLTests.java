package com.ohgiraffers.section01.simple;

import jakarta.persistence.*;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleJPQLTests {

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
    
    /* 설명.
     *  JPQL 기본 문법
     *  1) SELECT, UPDATE, DELETE 등의 키워드 사용은 SQL과 동일
     *  2) INSERT -> persist() 메소드 사용
     *  3) 키워드는 대소문자 구문X, 엔티티 및 속성은 대소문자 구분 (유의)
     *  4) 엔티티 -> 별칭 필수 사용 (별칭 없이 작성 시 에러 발생)
     * */

    /* 설명.
     *  JPQL 사용 방법
     *  1) 작성한 JPQL(문자열) -> entityManager.createQuery() 메소드 통해 쿼리 객체로 만듦
     *  2) 쿼리 객체 -> TypedQuery, Query 두 가지 종류
     *  2-1) TypedQuery -> 반환할 타입을 명확하게 지정하는 방식일 때 사용, 
     *                      쿼리 객체의 메소드 실행 결과로 지정한 타입 반환
     *  2-2) Query -> 반환할 타입을 명확하게 지정할 수 없을 때 사용, 
     *                  쿼리 객체 메소드의 실행 결과로 Object 또는 Object[] 반환 
     *  3) 쿼리 객체에서 제공하는 메소드를 호출해 쿼리 실행 및 데이터베이스 조회
     *  3-1) getSingleResult() -> 결과가 정확히 한 행일 경우 사용, 없거나 많은 경우 예외 발생
     *  3-2) getResultList() -> 결과가 2행 이상일 경우 사용, 컬렉션 반환, 없으면 빈 컬렉션 반환
     * */
    
    @Test
    public void TypeQuery를_이용한_단일행_단일열_조회_테스트() {
 
        String jpql = "SELECT m.menuName FROM menu_section01 as m WHERE m.menuCode = 7";
        TypedQuery<String> query = entityManager.createQuery(jpql, String.class);

        String resultMenuName = query.getSingleResult();

        System.out.println("resultMenuName = " + resultMenuName);

        assertEquals("민트미역국", resultMenuName);
    }

    @Test
    public void Query를_이용한_단일행_단일열_조회_테스트() {
        String jpql = "SELECT menuName FROM menu_section01 WHERE menuCode = 7";
        Query query = entityManager.createQuery(jpql);

        Object resultMenuName = query.getSingleResult();

        assertTrue(resultMenuName instanceof String);
        assertEquals("민트미역국", resultMenuName);
    }

    @Test
    public void TypedQuery를_이용한_다중행_다중열_조회_테스트() {

        /* 설명. JPQL에서는 entity의 별칭을 적으면 모든 속성(컬럼)을 조회 */
        String jpql = "SELECT m FROM menu_section01 as m";
        TypedQuery<Menu> query = entityManager.createQuery(jpql, Menu.class);

        List<Menu> foundMenuList = query.getResultList();

        assertTrue((!foundMenuList.isEmpty()));
        foundMenuList.forEach(System.out::println);
    }

    /* 설명. SQL과 다르지 않은 몇 가지 종류의 연산자 테스트 */
    @Test
    public void distinct를_활용한_중복제거_여러_행_조회_테스트() {
        String jpql = "SELECT DISTINCT m.categoryCode FROM menu_section01 m";
        TypedQuery<Integer> query = entityManager.createQuery(jpql, Integer.class);
        List<Integer> categoryCodeList = query.getResultList();

        assertTrue(!categoryCodeList.isEmpty());
        categoryCodeList.forEach(System.out::println);
    }

    @Test
    public void in_연산자를_활용한_테스트_조회() {

        /* 설명. 카데고리 코드가 6번 또는 10번인 메뉴들 조회 */
        String jqpl = "SELECT m FROM menu_section01 m WHERE m.categoryCode IN (6, 10)";
        List<Menu> menuList = entityManager.createQuery(jqpl, Menu.class).getResultList();

        assertTrue(!menuList.isEmpty());
        menuList.forEach(System.out::println);
    }

    @Test
    public void like_연산자를_활용한_조회_테스트() {

        String jpql = "SELECT m FROM menu_section01 m WHERE m.menuName LIKE '%마늘%'";
        List<Menu> menuList = entityManager.createQuery(jpql, Menu.class).getResultList();

        assertTrue(!menuList.isEmpty());
        menuList.forEach(System.out::println);
    }

}
