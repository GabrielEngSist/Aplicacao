package com.br.codenation.Aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@SpringBootApplication
@EnableScheduling
public class AplicacaoApplication {
	public static void main(String[] args) {
		SpringApplication.run(AplicacaoApplication.class, args);
	}
}
