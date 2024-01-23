package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        /*  */
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

//        for (int i = 0; i < bookList.size(); i++) {
//            System.out.println(bookList.get(i));
//        }

        Collections.sort(bookList);

        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }
}
