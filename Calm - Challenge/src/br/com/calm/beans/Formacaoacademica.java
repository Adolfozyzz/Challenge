package br.com.calm.beans;

public class Formacaoacademica {
	private String nomeInstituido;
	private String tipoEscolaridade;
	private boolean completo;
	private String dataFinal;

    Formacaoacademica(){
		
	}
	
	public Formacaoacademica(String nomeInstituido, String tipoEscolaridade, boolean completo, String dataFinal) {
		super();
		this.nomeInstituido = nomeInstituido;
		this.tipoEscolaridade = tipoEscolaridade;
		this.completo = completo;
		this.dataFinal = dataFinal;
	}
	
	public final String getNomeInstituido() {
		return nomeInstituido;
	}
	public final void setNomeInstituido(String nomeInstituido) {
		this.nomeInstituido = nomeInstituido;
	}
	public final String getTipoEscolaridade() {
		return tipoEscolaridade;
	}
	public final void setTipoEscolaridade(String tipoEscolaridade) {
		this.tipoEscolaridade = tipoEscolaridade;
	}
	public final boolean isCompleto() {
		return completo;
	}
	public final void setCompleto(boolean completo) {
		this.completo = completo;
	}
	public final String getDataFinal() {
		return dataFinal;
	}
	public final void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

}
