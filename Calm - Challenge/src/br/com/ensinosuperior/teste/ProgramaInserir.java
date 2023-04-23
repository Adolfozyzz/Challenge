package br.com.ensinosuperior.teste;

import java.sql.Connection;

import br.com.calm.beans.EnsinoSuperior;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.EnsinoSuperiorDAO;


public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		EnsinoSuperior ensinosuperior = new EnsinoSuperior();
		EnsinoSuperiorDAO ensinosuperiordao = new EnsinoSuperiorDAO(con);
		
		ensinosuperior.setNomeInstituido("DFsfgaefa");
		ensinosuperior.setTipoEscolaridade("awff");
		ensinosuperior.setCompleto(false);
		ensinosuperior.setDataFinal("12/09");
		ensinosuperior.setNomeGraduacao("shark");
		ensinosuperior.setDataIniciada("12/08");
		
		
		System.out.println(ensinosuperiordao.inserirEnsinoSuperior(ensinosuperior));
		
		Conexao.fecharConexao(con);
	}



	}


