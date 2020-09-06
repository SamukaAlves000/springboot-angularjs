package com.samuel.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuel.barbearia.model.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico,Integer>{

}
