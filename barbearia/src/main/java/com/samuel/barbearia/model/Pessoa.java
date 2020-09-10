package com.samuel.barbearia.model;



import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "TB_PESSOA")
@Data
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String cidade;
	private String uf;
	private String bairro;
	private String complemento;
	private String cpf;
	private char sexo;
	private LocalDate dataNascimento;
	private String caminhoFoto;
	@OneToMany(mappedBy = "pessoa")
    private Set<Atendimento> atendimentos;
}
