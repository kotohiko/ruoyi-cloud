package com.ruoyi.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RuoYiGatewayTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiGatewayTestApplication.class, args);
        System.out.println("""
                (♥◠‿◠)ﾉﾞ  若依网关启动成功   ლ(´ڡ`ლ)ﾞ \s
                 .-------.       ____     __         \s
                 |  _ _   \\      \\   \\   /  /     \s
                 | ( ' )  |       \\  _. /  '        \s
                 |(_ o _) /        _( )_ .'          \s
                 | (_,_).' __  ___(_ o _)'           \s
                 |  |\\ \\  |  ||   |(_,_)'          \s
                 |  | \\ `'   /|   `-'  /            \s
                 |  |  \\    /  \\      /            \s
                 ''-'   `'-'    `-..-'               \s""");
    }
}