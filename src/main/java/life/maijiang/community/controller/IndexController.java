package life.maijiang.community.controller;/*
 *auth:zoukai
 *@DATE 2019/11/6 14:49
 *package: life.maijiang.community.controller
 *className: HelloController
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}
