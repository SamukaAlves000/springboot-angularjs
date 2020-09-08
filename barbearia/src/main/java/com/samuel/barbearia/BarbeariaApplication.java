 package com.samuel.barbearia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.samuel.barbearia.controller.TokenFilter;

@SpringBootApplication
public class BarbeariaApplication {

	
	@Bean
	public FilterRegistrationBean<TokenFilter> filtroJwt() {
		FilterRegistrationBean<TokenFilter> frb = new FilterRegistrationBean<TokenFilter>();
		extracted(frb);
		frb.addUrlPatterns("/api/*");
		return frb;
		
	}


	private void extracted(FilterRegistrationBean<TokenFilter> frb) {
		frb.setFilter(new TokenFilter());
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(BarbeariaApplication.class, args);;
	}

}
