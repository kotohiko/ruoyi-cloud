package com.ruoyi.system;

import com.ruoyi.common.security.annotation.EnableCustomConfig;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;
import com.ruoyi.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 系统模块
 *
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class RuoYiSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiSystemApplication.class, args);
        System.out.println("""
                (♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ \s
                 .-------.       ____     __       \s
                 |  _ _   \\      \\   \\   /  /   \s
                 | ( ' )  |       \\  _. /  '      \s
                 |(_ o _) /        _( )_ .'        \s
                 | (_,_).' __  ___(_ o _)'         \s
                 |  |\\ \\  |  ||   |(_,_)'        \s
                 |  | \\ `'   /|   `-'  /          \s
                 |  |  \\    /  \\      /          \s
                 ''-'   `'-'    `-..-'             \s""");
    }
}
