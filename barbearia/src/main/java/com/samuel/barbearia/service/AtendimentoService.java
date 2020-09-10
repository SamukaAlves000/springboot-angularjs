package com.samuel.barbearia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.barbearia.model.Atendimento;
import com.samuel.barbearia.repository.AtendimetoRepository;

@Service
public class AtendimentoService {
	@Autowired
	private AtendimetoRepository atendimetoRepository;
	
	public Atendimento save(Atendimento entity) {
		return atendimetoRepository.save(entity);
	}
	
	public Optional<Atendimento> findById(int id) {
		return atendimetoRepository.findById(id);
	}
	
	public List<Atendimento> findAll() {
		return atendimetoRepository.findAll();
	}
}
