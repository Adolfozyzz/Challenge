package br.com.calm.beans;

public class ExperienciaProfissional {
	private String nomeDaEmpresa;
	private String areaDaAtuacao;
	private String cargo;
	private int tempoDeEmpresa;
	
	public final String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}
	public final void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	public final String getAreaDaAtuacao() {
		return areaDaAtuacao;
	}
	public final void setAreaDaAtuacao(String areaDaAtuacao) {
		this.areaDaAtuacao = areaDaAtuacao;
	}
	public final String getCargo() {
		return cargo;
	}
	public final void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public final int getTempoDeEmpresa() {
		return tempoDeEmpresa;
	}
	public final void setTempoDeEmpresa(int tempoDeEmpresa) {
		this.tempoDeEmpresa = tempoDeEmpresa;
	}

}
