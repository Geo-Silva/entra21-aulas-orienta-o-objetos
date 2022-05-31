package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Alien implements Individuo {

	private String nome;
	private String planetaOrigem;
	private String raca;
	
	public Alien() {
		
		
	}

	public Alien(String planetaOrigem, String raca) {
		super();
		this.planetaOrigem = planetaOrigem;
		this.raca = raca;
	}

	public String getPlanetaOrigem() {
		return planetaOrigem;
	}

	public void setPlanetaOrigem(String planetaOrigem) {
		this.planetaOrigem = planetaOrigem;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void alimentar(String alimento) {
		
		System.out.println(this.nome + ": Como apenas derivados de Hélio, nada disso de " + alimento);
		
	}

	@Override
	public void locomover() {
		
		System.out.println(this.nome + ": Uso meus tentáculos, mas prefiro minha nave mesmo");
		
	}

	@Override
	public void comunicar(String conteudo) {
		
		System.out.println(this.nome + ": Sou timído, vim aqui só para observar");
		
	}
	
	
	
	
	
}
