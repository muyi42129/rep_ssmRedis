package cn.bzy.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {
    private static Logger logger = Logger.getLogger(HelloController.class);
    @RequestMapping("/mvc")
    public String hello(){
        logger.info("info log !");
        logger.debug("debug log!");
        logger.error("error log!!!");
//        List li = new ArrayList();
//        System.out.println(li.get(0));
        return "home";
    }
}
