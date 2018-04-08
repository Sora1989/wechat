package com.zhiyong.wechat.common;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Sora on 2018-03-31.
 */
@RestController("/")
public class welcomeController {

    @RequestMapping("/")
    public String index() {
        return "forward:/index.html";
    }
}
