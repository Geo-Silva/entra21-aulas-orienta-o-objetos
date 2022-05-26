package br.com.entra21.orientacao.objetos.principal.aula03.poliformismo;

public class Velocista extends Atleta { //uso o extends para ele herdar as variaveis e m�todos do Atleta.

	private String tipoPista;
	private String marcaCalcado;

	public Velocista() {

	}

	public Velocista(String tipoPista, String marcaCalcado) {
		super();
		this.tipoPista = tipoPista;
		this.marcaCalcado = marcaCalcado;

	}

	public String getTipoPista() {
		return tipoPista;
	}

	public void setTipoPista(String tipoPista) {
		this.tipoPista = tipoPista;
	}

	public String getMarcaCalcado() {
		return marcaCalcado;
	}

	public void setMarcaCalcado(String marcaCalcado) {
		this.marcaCalcado = marcaCalcado;
	}

	@Override //fazendo assim ele vai pegar a mensagem padr�o na classe Atleta e vai adicionar isso.
	//protege em rela��o a altera��es de sintaxe como visibilidade, tipo de retorno, nome do m�todo e par�metros
	public void comemorarVitoria() {
		
		super.comemorarVitoria();
		
		System.out.println(getName() + " est� cansado mas feliz por vencer");
	}

	
}
