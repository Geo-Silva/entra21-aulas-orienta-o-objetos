package br.com.entra21.orientacao.objetos.principal.aula01.classes;

public class Professor {
	
	
	//atributos static são de dominio da classe e não de cada objeto
	//então nenhum objeto dessa classe tem esse tipo de atributo
	//para fazer acesso static basta informar a classe.oqueVocêQuer, sem utilizar '= new'
	public static String instituicao = "Proway"; //acesso estatico
	
	//atributos (encapsulamento nesse caso aqui)
	//criar gets e sets para quem realmente precisa
	
	private String nome;
	private byte idade;
	private byte quantidadeAlunos;

	public Professor() {
		// construtor vazio não inicializa os atributos
		
	}

	public Professor(String novoNome, byte idade) {
		
		this.nome = novoNome;
		this.idade = idade;
		//construtor com parametros pode inicializar alguns ou todos os atributos
		
	}
	
	public String getNome() {	// só mostrar um valor lá fora (ex: main), já que o resto é privado
		
		return this.nome;
		
	}
	
	public void setNome(String nome) { //atualizar um valor lá fora (ex: main), já que o resto é privado
		this.nome = nome;
		
	}
	
}
