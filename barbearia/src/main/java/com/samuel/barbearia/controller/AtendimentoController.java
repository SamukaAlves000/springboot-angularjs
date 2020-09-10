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

import com.samuel.barbearia.model.Atendimento;
import com.samuel.barbearia.service.AtendimentoService;

@RestController
@RequestMapping("atendimento")
public class AtendimentoController {

	@Autowired
	AtendimentoService atendimentoService;
	
	@GetMapping
	public ResponseEntity< List<Atendimento>> findAll() {
		return new ResponseEntity<List<Atendimento>>(atendimentoService.findAll(),HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<Atendimento> save(@RequestBody Atendimento entity) {
		return new ResponseEntity<Atendimento>(atendimentoService.save(entity),HttpStatus.OK);
	}
}
