package com.ruoyi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RuoYiConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuoYiConfigApplication.class, args);
        System.out.println("""
                (♥◠‿◠)ﾉﾞ  若依测试启动成功   ლ(´ڡ`ლ)ﾞ \s
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