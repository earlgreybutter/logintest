package com.example.cococat;

import java.math.BigDecimal;

import com.example.cococat.domain.Currency;
import com.example.cococat.domain.CurrencyRepository;
import com.example.cococat.domain.User;
import com.example.cococat.domain.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private CurrencyRepository currencyRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(){
		return args -> {
			//            Save demo data after start    
			userRepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG")); 
            currencyRepository.save(new Currency("US Dolar", "USD", new BigDecimal(100), new BigDecimal(3.92)));    
            currencyRepository.save(new Currency("Euro", "EUR", new BigDecimal(300), new BigDecimal(4.52)));    
		};
	}
}
