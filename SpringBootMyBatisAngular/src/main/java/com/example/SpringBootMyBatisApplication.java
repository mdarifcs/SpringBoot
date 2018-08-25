package com.example;

import org.apache.ibatis.type.Alias;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mappers")
@Alias("com.example.vo")
public class SpringBootMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyBatisApplication.class, args);
	}
	
}
