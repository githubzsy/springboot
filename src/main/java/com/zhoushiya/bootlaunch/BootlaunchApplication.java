package com.zhoushiya.bootlaunch;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.zhoushiya.bootlaunch.generator.**.mapper"})
public class BootlaunchApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootlaunchApplication.class, args);
    }
}
