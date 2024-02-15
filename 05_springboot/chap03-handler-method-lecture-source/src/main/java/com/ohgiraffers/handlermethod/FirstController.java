package com.ohgiraffers.handlermethod;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
/* 설명. 현재의 Controller 클래스에 작성할 핸들러 메소드들이
    모두 /first/xxx의 요청을 받게 될 때 -> 클래스에 Annotation 추가 가능 */

@RequestMapping("/first")
public class FirstController {

    /* 설명. 반환형이 void인 핸들러 메소드 -> 요청 경로 자체가 view의 경로 및 이름을 반환한 것으로 바로 해석 */
    @GetMapping("/regist")

//    public String regist() {
//        return "regist";
//    }
    public void regist() {
    }

    @PostMapping("regist")
    
    /* 설명. request를 쓰게 된다면 request 개념은 사용자의 입력값이 존재, model은 동적 페이지의 재료를 담는 용도로 사용 */ 
//    public String registMenu(HttpServletRequest request) {
    public String registMenu(WebRequest request, Model model) {
        String name = request.getParameter("name");
        System.out.println("name = " + name);

        int price = Integer.valueOf(request.getParameter("price"));
        int categoryCode = Integer.valueOf(request.getParameter("categoryCode"));

        String message
                = name + "을(를) 신규 메뉴 목록의 " + categoryCode + "번 카테고리에 "
                + price + "원으로 등록하였습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }
}
