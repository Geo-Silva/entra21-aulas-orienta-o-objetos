package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objetos.principal.aula03.poliformismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.poliformismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.poliformismo.Velocista;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitosPOO.Ponto;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitosPOO.Reta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Alien;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Aviao;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Girafa;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Planta;
import br.com.entra21.orientacao.objetos.principal.aula05.revisao.Revisao;

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
			System.out.println("3 - Aprender Polimorfismo");
			System.out.println("4 - Aprender Conceitos POO");
			System.out.println("5 - Aprender Poliformismo com Interface");
			System.out.println("6 - Revisar POO");
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
				
			case 3:
				
				aprenderPolimorfismo();
				
				break;
				
			case 4:
				
				aprenderConceitosPOO();
				
				break;
				
			case 5:
				
				aprenderPolimorfismoInterface();
				
				break;
				
			case 6:
				
				revisarPOO();
				
				break;

			default:

				System.out.println("Escolha uma op��o v�lida!");

				break;

			}

		} while (opcao != 0);

	}



	public static void aprenderClassesObjetos() {

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
		
	}

	public static void aprenderPolimorfismo() {
		
		//o padr�o de poliformismo para comportamentos (m�todos) � herdar
		//segunda forma do poliformismo � fazer completamente do jeito que eu herdei
		//terceira forma do poliformismo � aproveitar a minha heran�a e fazer um diferencial
		
		Atleta cr7 = new Atleta();
		cr7.setName("Cristiano");
		cr7.comemorarVitoria();
		System.out.println("----------------------");
		
		Nadador jobson = new Nadador("Jobson", (byte) 23, 3, 2, "Praia", "Sunga");
		jobson.comemorarVitoria();
		jobson.aprenderComADerrota();
		jobson.setName("Jobson Segundo");
		System.out.println("----------------------");
		
		Velocista flash = new Velocista();
		flash.setMarcaCalcado("Nike");
		flash.setName("Barry Allen");
		flash.comemorarVitoria();
		System.out.println("----------------------");
		
	}
	
	private static void aprenderConceitosPOO() {	
		
		//a classe ponto tem alta COES�O pois ele � preciso nas suas responsabilidades
		Ponto pontoAlto = new Ponto(30, 10000);
		Ponto esquerdaBaixo = new Ponto(-20, -500);
		
		//a classe reta � AGREGADA por pontos que podem n�o estar inicilizados
		//a ASSOCIA��O de reta e ponto � de um para muitos respectivos 	
		Reta retaUm = new Reta(); //sem pontos inicializados
		Reta diagonal = new Reta(pontoAlto, esquerdaBaixo); //com pontos inicializados
		
		
		
		
	}

	private static void aprenderPolimorfismoInterface() {
		
		
		Humano geovani = new Humano();
		geovani.setNome("Geovani");
		geovani.apresentarSe();
		geovani.alimentar("Pizza");
		geovani.locomover();
		geovani.comunicar("Ol�!");
		System.out.println("------------------------------------");
		
		Gato vezu = new Gato("Vezu", new Pessoa("Rubem", (byte) 33, ""));
		
		vezu.alimentar("Ra��o");
		vezu.comunicar("Quero ra��o");
		vezu.locomover();
		System.out.println("------------------------------------");
		
		Capivara robson = new Capivara();
		robson.alimentar("�gua");
		robson.comunicar("");
		robson.locomover();
		System.out.println("------------------------------------");
		
		Planta maracuja = new Planta("Passiflora edulis Sims");
		maracuja.alimentar("Carne");
		maracuja.comunicar("T� fazendo Sol hoje");
		maracuja.locomover();
		System.out.println("------------------------------------");
		
		Alien bsjork = new Alien();
		bsjork.alimentar("Alface");
		bsjork.comunicar("S� observando...");
		bsjork.locomover();
		System.out.println("------------------------------------");
		
		Girafa gifa = new Girafa();
		gifa.alimentar("Carne");
		gifa.comunicar("Som, testando som");
		gifa.locomover();
		System.out.println("------------------------------------");
		
		Aviao comercial = new Aviao();
		comercial.setModelo("Boeing 737");

		System.out.println(comercial.freiar());
		
		
	}
		
	private static void revisarPOO() {
		
		Revisao.revisar();
		
	}
}
