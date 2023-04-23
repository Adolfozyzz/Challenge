package br.com.calm.skill;

public class HardSkills extends Skills {
	private String nivelProficiencia;
	
	public HardSkills(String nomeSkills, String nivelProficiencia) {
		super(nomeSkills);
		this.nivelProficiencia = nivelProficiencia;
	}
	

	public final String getNivelProficiencia() {
		return nivelProficiencia;
	}

	public final void setNivelProficiencia(String nivelProficiencia) {
		this.nivelProficiencia = nivelProficiencia;
	}
	

}
