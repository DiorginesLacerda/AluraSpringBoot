package br.com.alura.salavip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;


@SpringBootApplication
@Controller
public class SalavipApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalavipApplication.class, args);
	}
}
