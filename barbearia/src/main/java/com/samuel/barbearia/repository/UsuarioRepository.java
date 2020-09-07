package com.samuel.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuel.barbearia.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
