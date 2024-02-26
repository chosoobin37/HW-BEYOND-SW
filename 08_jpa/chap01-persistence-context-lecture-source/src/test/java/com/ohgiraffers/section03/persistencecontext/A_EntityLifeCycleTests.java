package com.ohgiraffers.section03.persistencecontext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class A_EntityLifeCycleTests {
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

    /* 필기.
     *  영속성 컨텍스트는 엔티티 매니저가 엔티티 객체를 저장하는 공간으로 엔티티 객체 보관 및 관리
     *  엔티티 매니저가 생성될 때 하나의 영속성 컨텍스트 생성
     *  -
     *  엔티티의 생명 주기 -> 비영속, 영속, 준영속, 삭재 상태
    * */

    @Test
    public void 비영속성_테스트() {
        Menu foundMenu = entityManager.find(Menu.class, 11);
//        System.out.println("foundMenu = " + foundMenu);

        /* 설명. 영속 상태의 객체에서 값을 추출해 담더라도 새로 생성되어 영속성 컨텍스트와 관련 없는 객체는 비영속 상태 */
        Menu newMenu = new Menu();
        newMenu.setMenuCode(foundMenu.getMenuCode());
        newMenu.setMenuName(foundMenu.getMenuName());
        newMenu.setMenuPrice(foundMenu.getMenuPrice());
        newMenu.setCategoryCode(foundMenu.getCategoryCode());
        newMenu.setOrderabelStauts(foundMenu.getOrderabelStauts());

        boolean isTrue = (foundMenu == newMenu);

        assertFalse(isTrue);
    }

    @Test
    public void 영속성_연속_조회_테스트() {
        Menu foundMenu1 = entityManager.find(Menu.class, 11);
        Menu foundMenu2 = entityManager.find(Menu.class, 11);

        boolean isTrue = (foundMenu1 == foundMenu2);

        assertTrue(isTrue);
    }

    @Test
    public void 영속성_객체_추가_테스트() {

        /* 설명.
         *  이 예제에서는 menuCode 필드 값에 직접 값을 주고자 한다 -> auto_increment 사용 X
         *  @GeneratedValue 부분 주석 처리 후 테스트 작성
        * */
        Menu menuToRegist = new Menu();
        menuToRegist.setMenuCode(500);
        menuToRegist.setMenuName("얼그레이다쿠와즈");
        menuToRegist.setMenuPrice(6500);
        menuToRegist.setCategoryCode(10);
        menuToRegist.setOrderabelStauts("Y");

        entityManager.persist(menuToRegist);
        Menu foundMenu = entityManager.find(Menu.class, 500);

        boolean isTrue = (menuToRegist == foundMenu);

        assertTrue(isTrue);
    }

    @Test
    public void 영속성_객체_추가_값_변경_테스트() {
        
        Menu menuToRegist = new Menu();
        menuToRegist.setMenuCode(500);
        menuToRegist.setMenuName("얼그레이다쿠와즈");
        menuToRegist.setMenuPrice(6500);
        menuToRegist.setCategoryCode(10);
        menuToRegist.setOrderabelStauts("Y");

        entityManager.persist(menuToRegist);
        menuToRegist.setMenuName("자스민다쿠와즈");

        Menu foundMenu = entityManager.find(Menu.class, 500);

        assertEquals("자스민다쿠와즈", foundMenu.getMenuName());
    }
}
