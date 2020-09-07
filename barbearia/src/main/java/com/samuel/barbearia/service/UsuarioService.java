package com.samuel.barbearia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.barbearia.model.Usuario;
import com.samuel.barbearia.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public Usuario save(Usuario entity) {
		return usuarioRepository.save(entity);
	}
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	
}
