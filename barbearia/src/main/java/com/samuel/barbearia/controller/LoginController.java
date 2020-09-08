package com.samuel.barbearia.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.barbearia.model.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("autenticar")
public class LoginController {
	
	@PostMapping
	public ResponseEntity<LoginResponse> save(@RequestBody Usuario entity) {
		
		String token = Jwts.builder().setSubject(entity.getLogin()).signWith(SignatureAlgorithm.HS512, "samu")
				.setExpiration(new Date(System.currentTimeMillis() + 10 * 60 * 1000)).compact();
		LoginResponse loginResponse = new LoginResponse(token);
		return new ResponseEntity<LoginResponse>(loginResponse,HttpStatus.OK);
	}
	
	
	private class LoginResponse{
		
		public String token;
		
		public LoginResponse(String token) {
			this.token = token;
		}
	}

}
