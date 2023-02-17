package com.ruoyi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ControllerTest {

    @Value("${ruoyi.name}")
    private String name;

    @Value("${ruoyi.version}")
    private String version;

    @GetMapping("info")
    public String get() {
        return name + version;
    }
}