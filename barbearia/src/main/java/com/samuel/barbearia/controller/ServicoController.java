package com.samuel.barbearia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.barbearia.model.Servico;
import com.samuel.barbearia.service.ServicoService;

@RestController
@RequestMapping("/api")
public class ServicoController {
	
	@Autowired
	ServicoService servicoService;
	
	@GetMapping(value = "/servicos")
	public ResponseEntity< List<Servico>> findAll() {
		return new ResponseEntity<List<Servico>>(servicoService.findAll(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/servicos/{id}")
	public ResponseEntity<Servico> findById(@PathVariable Integer id) {
		return new ResponseEntity<>(servicoService.findById(id).get(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/servicos")
	public ResponseEntity<Servico> save(@RequestBody Servico entity) {
		return new ResponseEntity<Servico>(servicoService.save(entity),HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/servicos/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		servicoService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
