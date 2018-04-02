package com.zhiyong.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller("/home")
@ComponentScan
@Configuration
public class WechatApplication {

	@RequestMapping("/")
	public String index(){
		return "forward:/index.html";
	}


	public static void main(String[] args) {
		SpringApplication.run(WechatApplication.class, args);
	}
}
