package br.com.calm.beans;

public class EnsinoSuperior extends Formacaoacademica {
	private String nomeGraduacao;
	private String dataIniciada;
	public EnsinoSuperior(String nomeInstituido, String tipoEscolaridade, boolean completo, String dataFinal, String nomeGraduacao, String dataIniciada) {
		super(nomeInstituido, tipoEscolaridade, completo, dataFinal);
		this.nomeGraduacao = nomeGraduacao;
		this.dataIniciada = dataIniciada;
		
	}

	
	public EnsinoSuperior() {
		// TODO Auto-generated constructor stub
	}


	public final String getNomeGraduacao() {
		return nomeGraduacao;
	}
	public final void setNomeGraduacao(String nomeGraduacao) {
		this.nomeGraduacao = nomeGraduacao;
	}
	public final String getDataIniciada() {
		return dataIniciada;
	}
	public final void setDataIniciada(String dataIniciada) {
		this.dataIniciada = dataIniciada;
	}

}
