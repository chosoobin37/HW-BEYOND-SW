package com.ohgiraffers.section01.scope.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    /* 설명.
     *  bean Scope -> Spring Bean이 생성될 때 해당 인스턴스의 범위 의미 (Spring에서는 다양한 bean Scope 제공)
     *  1) singleton -> 하나의 인스턴스만을 생성, 모든 bean이 해당 인스턴스 공유하여 사용
     *  2) prototype -> 매번 새로운 인스턴스 생성
     *  3) request -> HTTP 요청 처리할 때마다 새로운 인스턴스 생성, 요청 처리 끝나면 인스턴스 폐기 (웹 어플리케이션 컨텍스트에만 해당)
     *  4) session -> HTTP 세션 당 하나의 인스턴스 생성, 세션 종료 시 인스턴스 폐기 (웹 어플리케이션 컨텍스트에만 해당)
     *  5) globalSession -> 전역 세션 당 하나의 인스턴스 생성, 전역 세션 종료 시 인스턴스 폐기 (포턴 어플리케이션 컨텍스트에만 해당)
    * */
    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

        /* 설명. 붕어빵, 딸기우유, 지리산암반수 bean 객체를 반환 받아 변수에 담기 */
        Product carpBerad = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);
        
        /* 설명. 첫번째 손님이 소핑 카트에 물건을 담는다 */
        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBerad);
        cart1.addItem(milk);

        /* 설명. 첫번째 손님의 쇼핑 카트에 담긴 물품 확인 */
        System.out.println("cart1에 담긴 물품: " + cart1.getItems());
        
        /* 설명. 두번째 손님이 쇼핑 카트를 꺼내 물건을 담음 */
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);

        /* 설명. 두번째 손님의 쇼핑 카트에 담긴 물품 확인 */
        System.out.println("cart2에 담긴 물품: " + cart2.getItems());

        /* 설명. singleton -> 객체 하나만 사용 */
        System.out.println(System.identityHashCode(cart1)==System.identityHashCode(cart2));
    }
}
