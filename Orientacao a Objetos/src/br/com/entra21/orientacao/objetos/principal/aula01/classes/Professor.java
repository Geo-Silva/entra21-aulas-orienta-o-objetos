package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {
	
	
	//atributos static s�o de dominio da classe e n�o de cada objeto
	//ent�o nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acesso static basta informar a classe.oqueVoc�Quer, sem utilizar '= new'
	public static String instituicao = "Proway"; //acesso estatico
	
	//atributos (encapsulamento nesse caso aqui)
	//criar gets e sets para quem realmente precisa
	
	private String nome;
	private byte idade;
	private byte quantidadeAlunos;

	public Professor() {
		// construtor vazio n�o inicializa os atributos
		
	}

	public Professor(String novoNome, byte idade) {
		
		this.nome = novoNome;
		this.idade = idade;
		//construtor com parametros pode inicializar alguns ou todos os atributos
		
	}
	
	public String getNome() {	// s� mostrar um valor l� fora (ex: main), j� que o resto � privado
		
		return this.nome;
		
	}
	
	public void setNome(String nome) { //atualizar um valor l� fora (ex: main), j� que o resto � privado
		this.nome = nome;
		
	}
	
}
