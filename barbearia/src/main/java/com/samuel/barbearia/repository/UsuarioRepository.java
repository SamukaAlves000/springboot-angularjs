package com.samuel.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.samuel.barbearia.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

	@Query(value = "SELECT u FROM Usuario u WHERE u.login =:pnome ")
	public Usuario buscaPorLogin(@Param("pnome") String login);
}
