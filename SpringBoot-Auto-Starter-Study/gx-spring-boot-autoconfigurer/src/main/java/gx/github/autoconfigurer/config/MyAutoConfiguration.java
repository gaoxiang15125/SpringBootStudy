package gx.github.autoconfigurer.config;

import gx.github.autoconfigurer.controller.AutoCreatController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springbootstudy
 * @description: 自定义自动装配实现类
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-06-11 14:22
 **/
@Configuration
// 判断是否存在配置信息，没有则不装载
@ConditionalOnProperty(value = "gx.info",matchIfMissing = true)
@EnableConfigurationProperties(MyProperties.class)
public class MyAutoConfiguration {

    MyProperties myProperties;

    @Autowired
    public MyAutoConfiguration(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    // 装载我们的Bean对象
    @Bean
    public AutoCreatController autoCreatController() {
        return new AutoCreatController(myProperties);
    }
}
