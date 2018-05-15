package com.whu.cherry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.whu.cherry.dao")
public class CherryApplication {

	public static void main(String[] args) {

		SpringApplication.run(CherryApplication.class, args);
	}
}
