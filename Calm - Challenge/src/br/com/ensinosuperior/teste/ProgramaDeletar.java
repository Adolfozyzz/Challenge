package br.com.ensinosuperior.teste;

import java.sql.Connection;

import br.com.calm.conexao.Conexao;
import br.com.calm.dao.EnsinoSuperiorDAO;


public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();

		EnsinoSuperiorDAO ensinosuperiordao = new EnsinoSuperiorDAO(con);
		
		// Testando o m�todo deletar
		System.out.println(ensinosuperiordao.deletar());

		Conexao.fecharConexao(con);
	}

	}


