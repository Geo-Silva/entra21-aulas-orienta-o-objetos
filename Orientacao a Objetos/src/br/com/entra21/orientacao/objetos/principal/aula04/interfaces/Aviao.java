package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Aviao implements Veiculo{

	private String modelo;
	
	public Aviao() {
		
		
	}

	public Aviao(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String freiar() {
		
		return "Avi�o freia como? Usando Flap";
	}

	@Override
	public void acelerar(float velocidade) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
