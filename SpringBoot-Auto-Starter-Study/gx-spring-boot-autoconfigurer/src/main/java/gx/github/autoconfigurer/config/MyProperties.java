package gx.github.autoconfigurer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: springbootstudy
 * @description: 自定义配置信息
 * @author: gaoxiang
 * @email: 630268696@qq.com
 * @create: 2021-06-11 14:15
 **/
@Data
@ConfigurationProperties("gx.info")
public class MyProperties {
    private String message;
}
