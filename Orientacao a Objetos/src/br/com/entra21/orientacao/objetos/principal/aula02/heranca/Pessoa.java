package br.com.entra21.orientacao.objetos.principal.aula02.heranca;

public class Pessoa {

	private String nome;//
	private byte idade;//
	private String cpf;//
	private String Observacao;
	
	
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, byte idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

}
