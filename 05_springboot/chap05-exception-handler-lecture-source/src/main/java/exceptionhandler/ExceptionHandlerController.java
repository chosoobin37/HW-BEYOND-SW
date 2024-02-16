package exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class ExceptionHandlerController {
    @GetMapping("simple-null")
    public String simpleNullPointerExceptionTest() {

        if (true) {
            throw new NullPointerException();
        }
        return "/";
    }

    @GetMapping("simple-user")
    public String simpleUserExceptionTest() throws MemberRegistException {

        if (true) {
            throw new MemberRegistException("회원 가입이 불가능합니다.");
        }
        return "/";
    }

    @GetMapping("annotation-null")
    public String annotationNullPointerExceptionTest() {
        String str = null;
        System.out.println("str/charAt(0): " + str.charAt(0));

        return "/";
    }

    /* 설명. 이 클래스만 해당되는 지역범위 예외처리 설정 */
    @ExceptionHandler(NullPointerException.class)
    public String nullPointerExcpetionHandler() {

        System.out.println("현재 Controller에서 NullPointer 발생 시 정확한 위치로 오는지 확인");

        return "error/nullPointer";
    }

    @GetMapping("annotation-user")
    public String useExceptionTest() throws MemberRegistException {
        if (true) {
            throw new MemberRegistException("회원가입이 불가능한 대상입니다.");
        }
        return "/";
    }

    /* 설명. Model과 해당 Exception 활용 가능 */
    @ExceptionHandler(MemberRegistException.class)
    public String userExceptionHanlder(Model model, MemberRegistException exception) {
        model.addAttribute("exception", exception);

        return "error/memberRegist";
    }
}
