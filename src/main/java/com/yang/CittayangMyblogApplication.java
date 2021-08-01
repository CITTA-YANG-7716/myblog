package com.yang;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yang.dao")
public class CittayangMyblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(CittayangMyblogApplication.class, args);
	}

}
