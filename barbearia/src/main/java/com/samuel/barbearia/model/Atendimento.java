package com.samuel.barbearia.model;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TB_ATENDIMENTO")
@Data
public class Atendimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate data;
	private Time horario;
	private boolean status;
	private Integer avaliacao;
	private LocalDate dataAgendamento;
	@ManyToOne
    @JoinColumn(name = "PESSOA_ID",nullable = false)
	private Pessoa pessoa;
	@ManyToOne
    @JoinColumn(name="FUNCIONARIO_ID", nullable=false)
	private Funcionario funcionario;
	@ManyToMany
	@JoinTable(
			  name = "TB_ATENDIMENTO_SERVICO", 
			  joinColumns = @JoinColumn(name = "ATENDIMENTO_ID"), 
			  inverseJoinColumns = @JoinColumn(name = "SERVICO_ID"))
    Set<Servico> servicos;
}
