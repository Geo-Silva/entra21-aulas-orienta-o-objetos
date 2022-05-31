package br.com.entra21.orientacao.objetos.principal.aula05.revisao;

import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;

public class Professor extends Pessoa implements ComportamentosAcademicos {

	// atributos
	private Estudante estudantes[];
	private Disciplina disciplinas[];

	// construtores
	public Professor() {
		super();
	}

	public Professor(Estudante[] estudantes, Disciplina[] disciplinas) {
		super();
		this.estudantes = estudantes;
		this.setDisciplinas(disciplinas);

	}

	// construtores da super classe
	public Professor(String nome, byte idade, String cpf) {
		super(nome, idade, cpf);

	}

	public Professor(String nome, byte idade, String cpf, Estudante[] estudantes, Disciplina[] disciplinas) {
		super(nome, idade, cpf);
		this.estudantes = estudantes;
		this.setDisciplinas(disciplinas);

	}

	public Estudante[] getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(Estudante[] estudantes) {
		this.estudantes = estudantes;
	}

	public Disciplina[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Disciplina[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String realizarApresentacao() {

		String apresentacao = "Oi sou o professor " + super.getNome() + " e tenho " + this.estudantes.length
				+ " alunos.";

		return apresentacao;
	}

	@Override
	public String gerarDossie(String nome) {

		String mensagem = "";
		Estudante estudanteLocalizado = null;
		
		for(byte estudante = 0; estudante < this.estudantes.length; estudante ++) {
			
			//esse if vai procurar o estudante e parar quando chegar nele.
			if(this.estudantes[estudante] != null && this.estudantes[estudante].getNome().equals(nome)) {
				
				estudanteLocalizado = this.estudantes[estudante];
				break;
				
			}
		}
		
		//ent�o vai fazer o dossie
		if (estudanteLocalizado != null) {

			mensagem = escreverDetalhesDossie(estudanteLocalizado);
			
			
			
		} else {

			mensagem = "Esse aluno n�o existe na minha lista!";
			
		}
		
		return mensagem;
	}

	private String escreverDetalhesDossie(Estudante estudante) {
															// vai pegar o total de disciplinas que o estudante aprendeu
		String detalhe = "O estudante " + estudante.getNome() + " j� aprendeu " + estudante.getDisciplinas().length
				+ " disciplinas";
		detalhe += "\nObserva��es que eu percebi sobre esse estudante:";
		detalhe += "\n" + estudante.getObservacao();

		return null;
	}

}
