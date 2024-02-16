package com.ohgiraffers.handlermethod;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

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

        // Servlet
        int price = Integer.valueOf(request.getParameter("price"));
        int categoryCode = Integer.valueOf(request.getParameter("categoryCode"));

        String message
                = name + "을(를) 신규 메뉴 목록의 " + categoryCode + "번 카테고리에 "
                + price + "원으로 등록하였습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @GetMapping("modify")
    public void modify() {
    }

    /* 설명. request의 parameter로 넘어오는 값들의 key 값과 일치하는 변수명 작성하고 @RequestParam 어노테이션 적용
     *   -> 자동으로 값을 꺼내고 해당 매개변수의 자료형에 맞게 변환 처리까지 완료, @RequestParam 생략 가능
     *   Spring부터는 Controller의 파싱 작업 간소화 */

    /* 설명.
     *  @RequestParam 속성
     *  1) defaultValue -> 사용자의 입력값이 없거나("")
     *                      request의 parameter 키 값과 일치하지 않는 매개변수 명 사용 시 매개변수가 가질 default 값 작성
     *  2) name -> request parameter의 키 값과 다른 매개변수 명 사용하고 싶을 경우 request parameter의 키 값 작성
     * */

    // SpringBoot
    // @RequestParam 생략 가능 (Model model, String name, int modifyPrice
    @PostMapping("modify")
    public String modifyMenu(Model model,
                             @RequestParam(defaultValue = "default value", name = "name") String name,
                             @RequestParam(defaultValue = "0") int modifyPrice) {
        String message = name + " 메뉴의 가격을 " + modifyPrice + "원으로 변경하였습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @PostMapping("modify2")
    public String modifyMenu(Model model, @RequestParam Map<String, String> parameter) {

        String modifyName = parameter.get("name2");
        int modifyPrice = Integer.valueOf(parameter.get("modifyPrice2"));

        String message = modifyName + " 메뉴의 가격을 " + modifyPrice + "원으로 변경하였습니다.";
        model.addAttribute("message", message);

        return "first/messagePrinter";
    }

    @GetMapping("search")
    public void searchMenu() {
    }

    /* 설명. 핸들러 메소드에 우리가 작성한 클래스를 메개변수로 작성하면 스프링이 객체를 만들어 주고 setter로 값도 주입해 준다.(커맨드 객체) */
    /* 설명. @ModleAttribute 어노테이션 활용 -> 커맨드 객체를 모델에도 담아주며, 어트리뷰트의 키 값 지정 가능 (키 값 X -> 낙타봉 표기법이 키값) */
    @PostMapping("search")
    public String searchMenu(MenuDTO menu) {
        System.out.println("menu = " + menu);

        return "first/searchResult";
    }

    @GetMapping("login")
    public void login() {
    }

    @PostMapping("login")
    public String sessionTest1(HttpSession session, @RequestParam String id) {
        session.setAttribute("id", id);
        return "first/loginResult";
    }
}
