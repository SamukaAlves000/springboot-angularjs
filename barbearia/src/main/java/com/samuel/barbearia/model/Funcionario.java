package com.samuel.barbearia.model;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TB_FUNCIONARIO")
@Data
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = true)
	private double salario;
	@OneToOne
	 @JoinColumn(name = "PESSOA_ID", referencedColumnName = "id", nullable = false)
	private Pessoa pessoa;
	@ManyToMany
	@JoinTable(
			  name = "TB_FUNCIONARIO_SERVICO", 
			  joinColumns = @JoinColumn(name = "FUNCIONARIO_ID"), 
			  inverseJoinColumns = @JoinColumn(name = "SERVICO_ID"))
    Set<Servico> servicos;
	@OneToMany(mappedBy="funcionario")
	Set<Atendimento> atendimentos;

}
