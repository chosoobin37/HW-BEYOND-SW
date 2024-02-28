package com.ohgiraffers.springdatajpa.menu.repository;

import com.ohgiraffers.springdatajpa.menu.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CategoryRepository extends JpaRepository<Category, Integer> {

    /* 설명. findAll 메소드 사용 가능하지만, jpql 또는 native sql로도 작성 가능 */
//    @Query(value = "SELECT m FROM Category m ORDER BY m.categoryCode ASC ")
    @Query(value = "SELECT category_code, category_name, ref_category_code FROM tbl_category " +
            "ORDER BY category_code ASC ", nativeQuery = true)
    List<Category> findAllCategory();
}
