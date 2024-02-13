package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> bookList;

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 123456, "JAVA의 정석",
                "남궁재현", "도우출판", new Date()));
        bookList.put(2, new BookDTO(2, 222333, "푸바오의 하루",
                "강바오", "바오출판", new Date()));
    }

    @Override
    public List<BookDTO> findAllBook() {

        /* 설명. HashMap의 value들만 추출해 ArrayList 형태로 반환 (Map -> List) */
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO searchBookBySequence(int sequence) {
        return bookList.get(sequence);
    }
}
