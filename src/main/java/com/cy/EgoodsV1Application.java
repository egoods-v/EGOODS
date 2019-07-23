package com.cy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.cy.egoods.dao")
@SpringBootApplication
public class EgoodsV1Application {

	public static void main(String[] args) {
		SpringApplication.run(EgoodsV1Application.class, args);
	}

}
