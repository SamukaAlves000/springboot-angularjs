package com.samuel.barbearia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.barbearia.model.Usuario;
import com.samuel.barbearia.service.UsuarioService;

@RestController("api")
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity< List<Usuario>> findAll() {
		return new ResponseEntity<List<Usuario>>(usuarioService.findAll(),HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<Usuario> save(@RequestBody Usuario entity) {
		return new ResponseEntity<Usuario>(usuarioService.save(entity),HttpStatus.OK);
	}
	
}
