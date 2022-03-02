package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //http에서의 body부에 내가 직접 데이터를 넣어주겠다는 의미
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; //hello spring -> 데이터를 직접 넣어주기 때문에 html관련코드 같은것이 한개도 없음
    }


    @ResponseBody

    static class Hello{
        private String name;
    }


}
