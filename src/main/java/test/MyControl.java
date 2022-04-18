package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControl {
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "美女亲个嘴吗❤️";
    }
}
