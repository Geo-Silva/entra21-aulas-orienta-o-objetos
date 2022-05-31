package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Estudante extends Pessoa implements ComportamentosAcademicos{

	private Disciplina disciplinas[];

	public Estudante() {
		super();
	}

	public Estudante(Disciplina[] disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public Estudante(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);
	
	}
	
	public Estudante(String nome, byte idade, String cpf, Disciplina[] disciplinas) {
		super(nome, idade, cpf);
		this.disciplinas = disciplinas;
		
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String realizarApresentacao() {

		String apresentacao = "Oi meu nome é " + super.getNome() + " e tenho " + super.getIdade();
		
		return apresentacao;
	}

	@Override
	public String gerarDossie(String nome) {

		String mensagem = "";

		if (nome.equals(super.getNome())) {

			mensagem = "O dossie sobre mim é gerado com minha interação entre professor e colegas";

		} else {

			mensagem = "Ei, você errou meu nome!";

		}

		return mensagem;
	}
	

	
}
