package com.ohgiraffers.section01.xml;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;
public class MenuService {

    public void findMenuByPrice(int maxPrice) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.selectMenuByPrice(maxPrice);
        System.out.println("service: ");
        menus.forEach(System.out::println);
    }
    public void searchMenu(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        System.out.println("service: ");
        menus.forEach(System.out::println);

    }

    public void searchMenuBySupCategory(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuBySupCategory(searchCriteria);
        System.out.println("service: ");
        menus.forEach(System.out::println);

        if (menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB 연동에 실패했거나 검색 결과가 없습니다.");
        }
        sqlSession.close();
    }
    public void searchMenuByRandomMenuCode(List randomCode) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByRandomMenuCode(randomCode);

        if (menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB 연동에 실패했거나 검색 결과가 없습니다.");
        }
        sqlSession.close();
    }

    public void searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByCodeOrSearchAll(searchCriteria);

        if (menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("DB 연동에 실패했거나 검색 결과가 없습니다.");
        }
        sqlSession.close();

    }
}
