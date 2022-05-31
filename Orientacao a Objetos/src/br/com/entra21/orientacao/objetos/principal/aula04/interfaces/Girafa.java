package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Girafa implements Individuo {

	private String lutar;
	
	public Girafa() {
		
		
	}

	public Girafa(String lutar) {
		super();
		this.lutar = lutar;
	}

	public String getLutar() {
		return lutar;
	}

	public void setLutar(String lutar) {
		this.lutar = lutar;
	}

	@Override
	public void alimentar(String alimento) {
		
		System.out.println("Girafa gosta de comer folhas em arvóres altas, talvez " + alimento);
		
	}

	@Override
	public void locomover() {
		
		System.out.println("Girafa corre, mas não muito rápido");
		
	}

	@Override
	public void comunicar(String conteudo) {
		
		System.out.println("Girafa faz som?");
		
		
	}
	
	
	
}
