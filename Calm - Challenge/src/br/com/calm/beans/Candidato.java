package br.com.calm.beans;

public class Candidato extends Pessoa{
	private String sobreMim;
	private String cpf;
	private String cep;
	private String rg;
	
	public final String getSobreMim() {
		return sobreMim;
	}
	public final void setSobreMim(String sobreMim) {
		this.sobreMim = sobreMim;
	}
	public final String getCpf() {
		return cpf;
	}
	public final void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public final String getCp() {
		return cep;
	}
	public final void setCp(String cp) {
		this.cep = cp;
	}
	public final String getRg() {
		return rg;
	}
	public final void setRg(String rg) {
		this.rg = rg;
	}
	


}
