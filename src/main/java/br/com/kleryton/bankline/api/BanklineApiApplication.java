package br.com.kleryton.bankline.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//Inserido para corrigir erro de requizição do Swagger na base URL: localhost:8080/
@EnableSwagger2
public class BanklineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanklineApiApplication.class, args);
	}

}
