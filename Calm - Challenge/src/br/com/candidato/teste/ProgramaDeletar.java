package br.com.candidato.teste;

import java.sql.Connection;

import br.com.calm.conexao.Conexao;
import br.com.calm.dao.CandidatoDAO;

public class ProgramaDeletar {
	
	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		CandidatoDAO candidatodao = new CandidatoDAO(con);
		
		// Testando o m�todo deletar
		System.out.println(candidatodao.deletar());

		Conexao.fecharConexao(con);
	}

	}


