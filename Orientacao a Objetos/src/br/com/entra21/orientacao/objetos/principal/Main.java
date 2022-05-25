package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, ent�o � um objeto,
	// porque foi criada com new
	// porem o system.in � uma chamada static porque para acessar o in do System n�o
	// precisei dar new
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {

			System.out.println("Escolha uma op��o:");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender Classes");
			System.out.println("2 - Aprender Heran�a");
			opcao = entrada.nextByte();

			switch (opcao) {

			case 0:

				System.out.println("Saindo...");

				break;

			case 1:

				aprenderClassesObjetos();

				break;

			case 2:

				aprenderHeranca();

				break;

			default:

				System.out.println("Escolha uma op��o v�lida!");

				break;

			}

		} while (opcao != 0);

	}

	public static void aprenderClassesObjetos() {

		Funcionario funcionarioUm = new Funcionario();
		funcionarioUm.setIdade((byte) 22);
		funcionarioUm.setNome("Jobson");
		funcionarioUm.setCargoAtual("Analista de Banco de Dados");
		funcionarioUm.setSalario(5000.50f);
		
		System.out.println(
				"Ol�, meu nome � " + funcionarioUm.getNome() + " e tenho " + funcionarioUm.getIdade() + " anos.");
		Funcionario funcionarioDois = new Funcionario("Robson", (byte) 23, "051.431.125.52", "Desenvolvedor FullStack", 4.500f);

		Diretor diretorUm = new Diretor("Paulo", (byte) 80, "051.341.512-12", "Entra21", (byte)10);
		
		diretorUm.realizarApresentacao(); // vai rodar o m�todo de mesmo nome na classe Diretor

		Professor professorJava = new Professor();

		Professor professoraIngles = new Professor("Isabelle", (byte) 29); // esse vai chamar o objeto com parametro
																			// (string)
		// basicamente aproveitando o momento para j� definir algo
		// se l� tem dois parametros, string e byte, aqui tem que preencher os dois
		// tamb�m

		System.out.println("Nome dela = " + professoraIngles.getNome());

		professoraIngles.setNome("Isabelle 2");
		// professoraIngles.setNome(null) desse jeito o valor fica em branco, nulo.

		System.out.println("Agora o nome dela � " + professoraIngles.getNome());

		System.out.println("Os professores trabalham na " + Professor.instituicao);

		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno(); // classe, nome do objeto
		Aluno alunoObjeto; // a segunda parte pode ser feita separadamente.

		alunoObjeto = new Aluno(); // desse jeito

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

	public static void aprenderHeranca() {

	}

}
