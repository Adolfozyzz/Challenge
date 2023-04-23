package br.com.calm.main;

import br.com.calm.beans.Candidato;
import br.com.calm.beans.CursosExtras;
import br.com.calm.beans.EnsinoMedio;
import br.com.calm.beans.EnsinoSuperior;
import br.com.calm.beans.ExperienciaProfissional;
import br.com.calm.beans.Recrutador;
import br.com.calm.empresa.Empresa;
import br.com.calm.skill.HardSkills;
import br.com.calm.skill.SoftSkills;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidato candidato = new Candidato();
		candidato.setNome("Zyzz");
		candidato.setId("awfawf");
		candidato.setSexo("Masculino");
		candidato.setTelefone(123441414);
		candidato.setDataNascimento("10/06/2003");
		candidato.setEmail("zyzz@gmail.com");
		candidato.setSenha("awfawawf");
		candidato.setSobreMim("Tenho 22 anos, estou cursando analise e desenvolvimento de sistemas e estou no 2 semestre");
		candidato.setCpf("123134141244");
		candidato.setCp("0200");
		candidato.setRg("14131315");
		System.out.println("\nCandidato:" + "\nNome: " + candidato.getNome() + "\nId :" + candidato.getId() + "\nSexo :" + candidato.getSexo()
		 + "\nTelefone: " + candidato.getTelefone() + "\nData de nascimento:" + candidato.getDataNascimento() + "\nEmail: " + candidato.getEmail()
		 + "\nSenha: " + candidato.getSenha() + "\nSobre mim: " + candidato.getSobreMim() + "\nCPf:" + candidato.getCpf() +
		 "\nCp:" + candidato.getCp() + "\nRg: " + candidato.getRg());
		
		Recrutador recrutador = new Recrutador();
		recrutador.setNome("jeff");
		recrutador.setId("awfawf");
		recrutador.setSexo("Masculino");
		recrutador.setTelefone(123441414);
		recrutador.setDataNascimento("10/06/2000");
		recrutador.setEmail("jeff@gmail.com");
		recrutador.setSenha("awfawawf");
		recrutador.setEmpresaRepresentante("Microsoft");
		System.out.println("\nRecrutador:" + "\nNome: " + recrutador.getNome() + "\nId :" + recrutador.getId() + "\nSexo :" + recrutador.getSexo()
		 + "\nTelefone: " + recrutador.getTelefone() + "\nData de nascimento:" + recrutador.getDataNascimento() + "\nEmail: " + recrutador.getEmail()
		 + "\nSenha: " + recrutador.getSenha() + "\nEmpresa Representante:" + recrutador.getEmpresaRepresentante());
		
		Empresa empresa = new Empresa();
		empresa.setTotalRecrutadores(20);
		empresa.setCnpj("182461827419");
		empresa.setVagasAbertas(10);
		empresa.setIdEmpresa("awfawfwa");
		empresa.setNomeEmpresa("broskfiled");
		System.out.println("\nEmpresa:" + "Total de recrutadores que teve:" + empresa.getTotalRecrutadores() + "\nCnpj:" + empresa.getCnpj()
		+ "\nVagas abertas: " + empresa.getVagasAbertas() + "\nId:" + empresa.getIdEmpresa() + "\nNome da empresa: " + empresa.getNomeEmpresa());
		
		CursosExtras cursosextras = new CursosExtras();
		cursosextras.setNomeCertificado("alsdasda");
		cursosextras.setLinkCertificado("www.afawfwf.br.com");
		cursosextras.setNomeOrganizacao("esquad");
		cursosextras.setCodigoCredencial("wdwadawd");
		cursosextras.setDataEmissao("08/06");
		System.out.println("\ncurso extra:" + "\nData de emiss�o:" + cursosextras.getDataEmissao());
		
		ExperienciaProfissional expericienciaprofissional = new ExperienciaProfissional();
		expericienciaprofissional.setNomeDaEmpresa("Broskfield");
		expericienciaprofissional.setTempoDeEmpresa(10);
		expericienciaprofissional.setCargo("Scrum master");
		expericienciaprofissional.setAreaDaAtuacao("front end");
		System.out.println("\nExperienciaProfissional: " + "\nNome da Empresa: " + expericienciaprofissional.getNomeDaEmpresa() + 
				"\nTempo da Empresa:" + expericienciaprofissional.getTempoDeEmpresa()  + " anos " +
				"\nCargo:" + expericienciaprofissional.getCargo() + "\nArea de atua��o no momento:" + expericienciaprofissional.getAreaDaAtuacao());
		
        EnsinoSuperior ensinosuperior = new EnsinoSuperior(null, null, false, null, null, null);
        ensinosuperior.setNomeGraduacao("alexx");
        ensinosuperior.setNomeInstituido("aliba");
        ensinosuperior.setCompleto(true);
        ensinosuperior.setDataIniciada("12/02/2020");
        ensinosuperior.setTipoEscolaridade("superior");
        ensinosuperior.setDataFinal("12/02/2023");
        System.out.println("\nEnsino Superior: " + "\nNome da Institui��o: " + ensinosuperior.getNomeInstituido()
        + "\nNome da gradua��o: " + ensinosuperior.getNomeGraduacao() + "\nData iniciada: " + ensinosuperior.getDataIniciada()
        + "\nData final: " + ensinosuperior.getDataFinal() + "\nTipo de escolaridade: " + ensinosuperior.getTipoEscolaridade()
        + "\nEnsino superior completo: " + ensinosuperior.isCompleto());
        
        EnsinoMedio ensinomedio = new EnsinoMedio(null, null, false, null);
        ensinomedio.setNomeInstituido("alesspremiu");
        ensinomedio.setTipoEscolaridade("superior completo");
        ensinomedio.setDataFinal("20/11/2022");
        System.out.println("\nEnsino medio: " + "\nNome da institui��o: " + ensinomedio.getNomeInstituido() +
        		"\nTipo de escolaridade: " + ensinomedio.getTipoEscolaridade() + "Data final: " + ensinomedio.getDataFinal());
        
        
		
		
		
		
		
		
		
		HardSkills hardskills = new HardSkills(null, null);
        hardskills.setNivelProficiencia("elevado");
        hardskills.setNomeSkill("alssa");
		System.out.println("\nHardSkills" + "\nNivel de Proficiencia: " + hardskills.getNomeSkill() + "\nNome da Skills: " + hardskills.getNomeSkill());
		
		SoftSkills softskills = new SoftSkills(null);
		softskills.setNomeSkill("aless");
		System.out.println("\nSoftSkills" + "\nNome da Skills: " + softskills.getNomeSkill());
		
		
		
		
		
		
		
		
		

	}

}
