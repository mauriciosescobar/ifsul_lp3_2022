package br.ifsul.lp3.exercicio3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * 1. Realizar o mapeamento objeto-relacional de uma entidade para representar
 * um Cachorro Atributos: Nome, Raca, Idade e Cor
 */

@Entity
public class Cachorro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome, raca, cor;
	private Integer idade;

	public Cachorro() {
	}

	public Cachorro(Integer id, String nome, String raca, String cor, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return String.format("[%s] %s %s %s %s", id, nome, raca, cor, idade);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
