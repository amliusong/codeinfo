package com.heran.codeinfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.heran.codeinfo.*.mapper")
public class CodeinfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeinfoApplication.class, args);
    }
}
