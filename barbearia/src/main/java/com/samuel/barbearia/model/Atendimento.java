package com.samuel.barbearia.model;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @JoinColumn(name = "pessoa_id",nullable = false)
	private Pessoa pessoa;
}
