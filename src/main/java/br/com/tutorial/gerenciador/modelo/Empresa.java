package br.com.tutorial.gerenciador.modelo;

import java.util.Date;

public class Empresa {

	
	private int id;
	private String nome;
	private Date dataAbertura;
	
	public Empresa(String nome) {
		this.nome = nome;
		dataAbertura = new Date();
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
