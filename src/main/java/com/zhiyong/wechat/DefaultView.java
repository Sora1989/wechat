package com.zhiyong.wechat;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @program: wechat
 * @description: 默认主页
 * @author: zjxu
 * @create: 2018/3/30 17:44
 **/
@Configuration
public class DefaultView extends WebMvcConfigurationSupport {

    //在WebMvcConfigurationSupport中是protected修饰的，只能给子类使用
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
