package br.com.ensinomedio.teste;

import java.sql.Connection;

import br.com.calm.beans.EnsinoMedio;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.EnsinoMedioDAO;


public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		EnsinoMedio ensinomedio = new EnsinoMedio();
		EnsinoMedioDAO ensinomediodao = new EnsinoMedioDAO(con);
		
		ensinomedio.setNomeInstituido("DFsfgaefa");
		ensinomedio.setTipoEscolaridade("awff");
		ensinomedio.setCompleto(false);
		ensinomedio.setDataFinal("12/09");
		
	
		
		
		System.out.println(ensinomediodao.inserirEnsinoSuperior(ensinomedio));
		
		Conexao.fecharConexao(con);
	}


	}


