package gx.github.autoconfigurer.controller;

import gx.github.autoconfigurer.config.MyProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springbootstudy
 * @description: 通过自动装配注册的控制器
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-06-11 14:18
 **/
@RestController
public class AutoCreatController {

    MyProperties myProperties;

    public AutoCreatController(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    @RequestMapping("/")
    public String sayMessage() {
        return myProperties.getMessage();
    }
}
