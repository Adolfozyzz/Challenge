package br.com.ensinomedio.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.calm.beans.EnsinoMedio;

import br.com.calm.conexao.Conexao;
import br.com.calm.dao.EnsinoMedioDAO;



public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		 EnsinoMedioDAO ensinomediodao = new  EnsinoMedioDAO(con);
		
		ArrayList<EnsinoMedio> lista = ensinomediodao.retornarDados();
		if(lista != null) {
			for (EnsinoMedio em : lista) {
				System.out.println("Nome Instituido: " + em.getNomeInstituido());
				System.out.println("Tipo de escolaridade: " + em.getTipoEscolaridade());
		
		}	
		Conexao.fecharConexao(con);


		}
	}
}

