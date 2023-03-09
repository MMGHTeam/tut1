package ir.mmgh.springmvc.helloWorld.controller;

import java.time.LocalDateTime;

import ir.mmgh.springmvc.helloWorld.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/helloworld")
    public String handler(Model model) {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
        helloWorld.setDateTime(LocalDateTime.now().toString());
        model.addAttribute("helloWorld", helloWorld);
        return "helloworld";
    }

    @RequestMapping("/helloworld")
    public String handler2(Model model) {

        HelloWorld helloWorld2 = new HelloWorld();
        helloWorld2.setMessage("Hello World Example Using Spring MVC 52!!!");
        helloWorld2.setDateTime(LocalDateTime.now().toString());
        model.addAttribute("helloWorld2", helloWorld2);
        return "helloworld2";
    }
}
