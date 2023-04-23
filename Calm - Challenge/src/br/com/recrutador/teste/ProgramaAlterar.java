package br.com.recrutador.teste;

import java.sql.Connection;

import br.com.calm.beans.Recrutador;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.RecrutadorDAO;


public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Recrutador recrutador = new Recrutador();
		RecrutadorDAO recrutadordao = new RecrutadorDAO(con);

		// Testando o m�todo alterar
		recrutador.setNome("Chest brah");
		recrutador.setSexo("feminino");
		
		System.out.println(recrutadordao.alterar(recrutador));
		Conexao.fecharConexao(con);
	}

	}


