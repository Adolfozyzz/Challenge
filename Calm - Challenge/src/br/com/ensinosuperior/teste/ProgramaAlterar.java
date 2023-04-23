package br.com.ensinosuperior.teste;

import java.sql.Connection;

import br.com.calm.beans.EnsinoSuperior;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.EnsinoSuperiorDAO;


public class ProgramaAlterar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();

		EnsinoSuperior ensinosuperior= new EnsinoSuperior();
		EnsinoSuperiorDAO ensinosuperiordao = new EnsinoSuperiorDAO(con);

		// Testando o m�todo alterar
		 ensinosuperior.setNomeInstituido("Zyzz");
		 ensinosuperior.setTipoEscolaridade("awff");
		System.out.println(ensinosuperiordao.alterar(ensinosuperior));
		Conexao.fecharConexao(con);
	}



	}


