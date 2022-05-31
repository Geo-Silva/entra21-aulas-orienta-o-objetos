package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

public interface ComportamentosAcademicos {

	//deve ser publico pq o objetivo é as classes terem acesso
	//nesse caso retorna uma String
	//que pode ser aproveitada em um Syso, alimentar variaveis, participar de um calculo...
	public String realizarApresentacao();
	
	//retorna uma String e precisa de um parametro recebido como argumento
	public String gerarDossie(String nome);

	
}
