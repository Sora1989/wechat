package com.zhiyong.wechat.controller;

import com.zhiyong.wechat.common.annotation.Log;
import com.zhiyong.wechat.common.utils.MD5Utils;
import com.zhiyong.wechat.common.utils.R;
import com.zhiyong.wechat.common.utils.ShiroUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.Subject;

/**
 * @program: wechat
 * @description: 首页
 * @author: zjxu
 * @create: 2018/4/2 11:26
 **/
@Controller
public class HomeController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MenuService menuService;
    @Autowired
    FileService fileService;
    @GetMapping({ "/", "" })
    String welcome(Model model) {

        return "redirect:/blog";
    }

    @Log("请求访问主页")
    @GetMapping({ "/index" })
    String index(Model model) {
        List<Tree<MenuDO>> menus = menuService.listMenuTree(getUserId());
        model.addAttribute("menus", menus);
        model.addAttribute("name", getUser().getName());
        FileDO fileDO = fileService.get(getUser().getPicId());
        if(fileDO!=null&&fileDO.getUrl()!=null){
            if(fileService.isExist(fileDO.getUrl())){
                model.addAttribute("picUrl",fileDO.getUrl());
            }else {
                model.addAttribute("picUrl","/img/photo_s.jpg");
            }
        }else {
            model.addAttribute("picUrl","/img/photo_s.jpg");
        }
        model.addAttribute("username", getUser().getUsername());
        return "index_v1";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @Log("登录")
    @PostMapping("/login")
    @ResponseBody
    R ajaxLogin(String username, String password) {

        password = MD5Utils.encrypt(username, password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return R.ok();
        } catch (AuthenticationException e) {
            return R.error("用户或密码错误");
        }
    }

    @GetMapping("/logout")
    String logout() {
        ShiroUtils.logout();
        return "redirect:/login";
    }

    @GetMapping("/main")
    String main() {
        return "main";
    }

}
