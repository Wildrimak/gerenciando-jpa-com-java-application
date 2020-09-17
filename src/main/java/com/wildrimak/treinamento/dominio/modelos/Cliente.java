package com.wildrimak.treinamento.dominio.modelos;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private Date dataNascimento;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Enumerated(EnumType.STRING)
	private Escolaridade escolaridade;

	private Date dataInicioUltimoTrabalho;

	private Date dataUltimaPromocao;

	private BigDecimal salario;

	public Cliente() {
	}

	public Cliente(String nome, Date dataNascimento, Sexo sexo, Escolaridade escolaridade,
			Date dataInicioUltimoTrabalho, Date dataUltimaPromocao, BigDecimal salario) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.escolaridade = escolaridade;
		this.dataInicioUltimoTrabalho = dataInicioUltimoTrabalho;
		this.dataUltimaPromocao = dataUltimaPromocao;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Date getDataInicioUltimoTrabalho() {
		return dataInicioUltimoTrabalho;
	}

	public void setDataInicioUltimoTrabalho(Date dataInicioUltimoTrabalho) {
		this.dataInicioUltimoTrabalho = dataInicioUltimoTrabalho;
	}

	public Date getDataUltimaPromocao() {
		return dataUltimaPromocao;
	}

	public void setDataUltimaPromocao(Date dataUltimaPromocao) {
		this.dataUltimaPromocao = dataUltimaPromocao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Cliente [id=%s, nome=%s, dataNascimento=%s, sexo=%s, escolaridade=%s, dataInicioUltimoTrabalho=%s, dataUltimaPromocao=%s, salario=%s]",
				id, nome, dataNascimento, sexo, escolaridade, dataInicioUltimoTrabalho, dataUltimaPromocao, salario);
	}

	public static enum Sexo {
		MASCULINO, FEMININO, OUTROS
	}

	public static enum Escolaridade {
		NENHUMA, FUNDAMENTAL, MEDIO, SUPERIOR, MESTRADO, DOUTORADO
	}

}
