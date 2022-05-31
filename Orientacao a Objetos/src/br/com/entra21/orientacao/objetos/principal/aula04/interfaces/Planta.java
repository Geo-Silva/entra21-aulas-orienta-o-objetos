package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Planta implements Individuo {

	private String nomeCientifico;
	
	public Planta() {
		
		
	}

	public Planta(String nomeCientifico) {
		super();
		this.nomeCientifico = nomeCientifico;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String alimento) {
		
		System.out.println(this.nomeCientifico + ": Eu não preciso de " + alimento + " pois faço fotossíntese");
		
		
	}

	@Override
	public void locomover() {
		
		System.out.println(this.nomeCientifico + ": Só de acordo com o vento, mas nunca por vontade própria :(");
		
	}

	@Override
	public void comunicar(String conteudo) {
		
		System.out.println(this.nomeCientifico + ": Planta não fala porque ainda é muda");
		
	}
	
	
}
