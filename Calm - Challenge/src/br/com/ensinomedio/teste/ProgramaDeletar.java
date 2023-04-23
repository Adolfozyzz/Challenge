package br.com.ensinomedio.teste;

import java.sql.Connection;

import br.com.calm.conexao.Conexao;
import br.com.calm.dao.EnsinoMedioDAO;


public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		EnsinoMedioDAO ensinomediodao = new EnsinoMedioDAO(con);
		
		// Testando o m�todo deletar
		System.out.println(ensinomediodao.deletar());

		Conexao.fecharConexao(con);
	}

	}


