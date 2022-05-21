package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.classes.Aluno;

public class Main {

	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno(); // classe, nome do objeto
		Aluno alunoObjeto; // a segunda parte pode ser feita separadamente.
					
		alunoObjeto = new Aluno(); //desse jeito
	
		
		alunoTeste.nome = "Geovani";
		alunoTeste.idade = 19;
		
		outroAluno.nome = "Fulano";
		outroAluno.idade = 22;
		
		alunoTeste.responderChamada();
		
		
		/*
		 * System.out.println("Qual o nome do aluno novato?"); alunoNovato.nome =
		 * entrada.next();
		 * 
		 * System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		 * alunoNovato.idade = entrada.nextByte();
		 * 
		 * System.out.println("Bem vindo, " + alunoNovato.nome);
		 */
		 

	}

}
