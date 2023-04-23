package br.com.recrutador.teste;

import java.sql.Connection;

import br.com.calm.conexao.Conexao;
import br.com.calm.dao.RecrutadorDAO;


public class ProgramaDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		RecrutadorDAO recrutadordao = new RecrutadorDAO(con);
		
		// Testando o m�todo deletar
		System.out.println(recrutadordao.deletar());

		Conexao.fecharConexao(con);
	}

	

	}


