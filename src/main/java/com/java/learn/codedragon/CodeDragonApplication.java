package com.java.learn.codedragon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@SpringBootApplication
public class CodeDragonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeDragonApplication.class, args);
    }

    @RequestMapping()
    public String hello(){
        return "hello spring boot \n 谢谢阅读! 微信搜索：编程小龙";
    }

}
