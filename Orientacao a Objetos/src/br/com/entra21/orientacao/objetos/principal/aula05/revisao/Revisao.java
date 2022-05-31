package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import java.util.Scanner;

public class Revisao {

	static Scanner entrada = new Scanner(System.in);
	static Professor oliota;
	
	
	public static void revisar() {

		byte opcao;
		gerarDados();
		
		do {

			System.out.println("Escolha uma opção!");
			System.out.println("0 - Sair");
			System.out.println("1 - Revisar");
			opcao = entrada.nextByte();
			
			switch (opcao) {

			case 0:

				System.out.println("Saindo...");
				
				break;

			case 1:
				
				gerarDossie();

				break;

			default:

				System.out.println("Opção inválida!");
				
				break;
			}

		} while (opcao != 0);

	}

	private static void gerarDossie() {
		
		System.out.println("Informe o nome do aluno que deseja criar o dossie");
		System.out.println(oliota.gerarDossie(entrada.next()));
		
	}

	private static void gerarDados() {
		
		Disciplina disciplinas[] = new Disciplina[3];
		disciplinas[0].setNome("Metodologias Ágeis");
		
		oliota = new Professor("Oliota", (byte) 33, "123-456-789-10");
		
		
	}
	
	
}
