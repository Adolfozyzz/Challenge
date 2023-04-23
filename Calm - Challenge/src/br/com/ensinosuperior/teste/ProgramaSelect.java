package br.com.ensinosuperior.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.calm.beans.EnsinoSuperior;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.EnsinoSuperiorDAO;


public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Connection con = Conexao.abrirConexao();
		 EnsinoSuperiorDAO ensinosuperiordao = new  EnsinoSuperiorDAO(con);
		
		ArrayList<EnsinoSuperior> lista = ensinosuperiordao.retornarDados();
		if(lista != null) {
			for (EnsinoSuperior e : lista) {
				System.out.println("Nome da graduação: " + e.getNomeGraduacao());
				System.out.println("Tipo de escolaridade: " + e.getTipoEscolaridade());
		
		}
		Conexao.fecharConexao(con);


	}

	}
}
