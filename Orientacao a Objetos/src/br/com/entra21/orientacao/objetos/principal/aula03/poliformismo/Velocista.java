package br.com.entra21.orientacao.objetos.principal.aula03.poliformismo;

public class Velocista extends Atleta { //uso o extends para ele herdar as variaveis e métodos do Atleta.

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

	@Override //fazendo assim ele vai pegar a mensagem padrão na classe Atleta e vai adicionar isso.
	//protege em relação a alterações de sintaxe como visibilidade, tipo de retorno, nome do método e parâmetros
	public void comemorarVitoria() {
		
		super.comemorarVitoria();
		
		System.out.println(getName() + " está cansado mas feliz por vencer");
	}

	
}
