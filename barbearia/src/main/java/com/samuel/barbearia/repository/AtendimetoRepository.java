package com.samuel.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuel.barbearia.model.Atendimento;

@Repository
public interface AtendimetoRepository extends JpaRepository<Atendimento, Integer>{

}
