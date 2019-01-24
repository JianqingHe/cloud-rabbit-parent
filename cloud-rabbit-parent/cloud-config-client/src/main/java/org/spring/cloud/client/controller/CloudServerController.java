package org.spring.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问cloud server
 *
 * @author hejq
 * @date 2019-01-24 10:17
 */
@RestController
@RefreshScope
public class CloudServerController {

    @Value("${foo}")
    String foo;

    /**
     * 访问cloud server 配置
     *
     * @return foo的字段值
     */
    @GetMapping("/hi")
    public String hi() {
        return "hello: " + foo;
    }
}
