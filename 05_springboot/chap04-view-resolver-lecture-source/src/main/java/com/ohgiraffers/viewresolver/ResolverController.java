package com.ohgiraffers.viewresolver;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/*")
public class ResolverController {

    /* 설명. 서블릿 때와 마찬가지로 포워딩을 통해 값 전달 가능 */
    @GetMapping("string")
    public String stringReturning(Model model) {
        model.addAttribute("forwardMessage", "문자열로 View 이름 반환 ...");

        return "result";
    }

    /* 설명. 서블릿 때와 마찬가지로 파라미터를 활용하지 않고서는 리다이렉트를 통해 값 전달 불가능
     *   -> 스프링은 가능 */
    @GetMapping("string-redirect")
    public String stringRedirect(Model model) {
        model.addAttribute("message1", "문자열로 View 이름 반환하며 Redirect ...");

        return "redirect:/";
    }

    /* 설명. 스프링의 RedirectAttribute라는 객체에 attr을 담으면 리다이렉트 시에도 값 유지 (전달할 상태)  */
    @GetMapping("string-redirect-attr")
    public String stringRedirectAttribute(RedirectAttributes rttr) {
        rttr.addFlashAttribute("flashMessage1", "리다이렉트 attr 사용하여 redirect ...");

        return "redirect:/";
    }

    /* 설명. 기존에 핸들러 메소드가 void 또는 String으로만 반환 -> ModelAndView로 반환도 가능 */
    /* 설명. 단순 forward -> String 반환 및 Model을 활용하는 코드와 ModelAndView를 활용한 코드와 차이 X */
    @GetMapping("modelandview")
    public ModelAndView modelAndViewTest(ModelAndView mv) {
        mv.addObject("message2", "ModelAndView를 이용한 foward ...");
        mv.setViewName("result");

        return mv;
    }

    @GetMapping("modelandview-redirect")
    public ModelAndView modelAndViewRedirect(ModelAndView mv) {

        /* 설명. MoedelAndView를 통한 Redirect -> addObject 처리한 게 parameter로 넘어감
         *   -> ?가 있는 쿼리스트링 형태로 넘어감 */
        mv.addObject("message2", "ModelandView를 이용한 redirect");
        mv.setViewName("redirect:/");

        return mv;
    }

    @GetMapping("modelandview-redirect-attr")
    public ModelAndView modelAndViewRedirectFlashAttribute(ModelAndView mv,
                                                           RedirectAttributes rttr) {
        rttr.addFlashAttribute("flashMessage2",
                "ModelAndView를 이용한 redirect attr");

        mv.setViewName("redirect:/");

        return mv;
    }
}
