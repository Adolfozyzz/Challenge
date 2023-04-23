package br.com.candidato.teste;

import java.sql.Connection;

import br.com.calm.beans.Candidato;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.CandidatoDAO;


public class ProgramaAlterar {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		Candidato candidato = new Candidato();
		CandidatoDAO candidatodao = new CandidatoDAO(con);

		// Testando o m�todo alterar
		candidato.setSobreMim("eu soua faofnaowfna");
		candidato.setNome("Zyzz");
		System.out.println(candidatodao.alterar(candidato));
		Conexao.fecharConexao(con);
	}


	}


