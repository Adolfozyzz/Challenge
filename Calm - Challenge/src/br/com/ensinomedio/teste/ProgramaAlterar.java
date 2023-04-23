package br.com.ensinomedio.teste;

import java.sql.Connection;

import br.com.calm.beans.EnsinoMedio;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.EnsinoMedioDAO;


public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();

		EnsinoMedio ensinomedio = new EnsinoMedio();
		EnsinoMedioDAO ensinomediodao = new EnsinoMedioDAO(con);

		// Testando o m�todo alterar
		
		ensinomedio.setNomeInstituido("jeff seuid");
		ensinomedio.setTipoEscolaridade("awff");
		System.out.println(ensinomediodao.alterar(ensinomedio));
		Conexao.fecharConexao(con);
	}

	}


