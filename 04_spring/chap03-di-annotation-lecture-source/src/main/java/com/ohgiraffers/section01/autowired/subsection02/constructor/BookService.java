package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;

    /* 설명.
     *  BookDAO 타입의 빈 객체를 생성자를 통해 주입 받음
     *  @Autowired를 생성자에 작성하고 주입 받을 타입의 bean을 매개변수로 작성 -> 기본 생성자 X
     *  -
     *  생성자 주입의 이점
     *  1) 필드에 final 키워드 사용 가능
     *  2) 순환참조를 스프링 시작(컨테이너 생성 시)과 동시에 확인 및 에러 발생 시켜줌
     *  3) 중간에 값이 오염되지 않음을 확신하고 사용 가능 -> 불변성 보장
     *  4) 테스트 코드 작성 시 테스트 코드에 @Autowired 또는 주입받는 대상의 setter 등을 추가하지 않고 순수 자바 코드로 테스트 가능
     * */

    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    /* 설명. 도서 목록 전체 조회 */
    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    /* 설명. 도서 번호로 도서 조회 */
    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.searchBookBySequence(sequence);
    }
}
