package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    /* 설명.
     *  아래 3가지 -> ComponentScan 범위 안에 Annotation 달렸을 때 유효
     *  1) @Service에 의해 BooKService 타입의 bookService bean이 관리됨
     *  2) BookDAOImpl에 있는 @Repository에 의해 bookDAOImpl beans이 관리됨 (BookDAO 타입이기도 함)
     *  3) @Autowired에 의해 BookDAO 타입의 bean이 BookService의 필드인 bookDAO 필드에 주입됨 (대입)
     * */

    @Autowired
    //    ComponentScan 범위 안에 BookDAO 타입의 bean이 대입됨
    private BookDAO bookDAO;            // = private BookDAO bookDAO = new BookDAOImpl();

    public BookService() {
    }

    /* 설명. 도서 목록 전체 조회 */
    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }
}
