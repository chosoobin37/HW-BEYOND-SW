package com.ohgiraffers.section03.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

/* 설명.
 *  Service 계층 이후부터는 xml 방식, javaconfig 방식, remix 방식 중 선택
 *  remix -> mybatis 설정은 javaConfig, 쿼리 다루기는 xml 방식 사용
 *  DAO -> 추상 메소드를 지닌 인터페이스로 만드는 데 인터페이스와 mapper용 xml은 3가지 준수해야 함 
 *  1) xml 파일 -> mapper용 인터페이스(DAO에 해당하는 인터페이스)와 같은 경로에 위치
 *  2) xml 파일의 namespace -> mapper용 인터페이스로 작성 (fullname)
 *  3) xml 파일명 -> mapper용 인터페이스명 동일
* */

import static com.ohgiraffers.section03.remix.Template.getSqlSession;
public class MenuService {
    public List<MenuDTO> findAllMenu() {

        SqlSession sqlSession = getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = menuMapper.selectAllMenus();
        System.out.println("remix 방식으로 service 계층까지 잘 조회되는지 확인 ...");
        menus.forEach(System.out::println);

        return menus;
    }

}
