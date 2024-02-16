package exceptionhandler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class MainController {
    @RequestMapping(value = {"/", "/main"})
    public String main() {
        return "main";
    }
}
