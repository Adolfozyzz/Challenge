package br.com.recrutador.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.calm.beans.Recrutador;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.RecrutadorDAO;



public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		RecrutadorDAO recrutadordao = new RecrutadorDAO(con);
		
		ArrayList<Recrutador> lista = recrutadordao.retornarDados();
		if(lista != null) {
			for (Recrutador r : lista) {
				System.out.println("Nome: " + r.getNome());
				System.out.println("Sexo: " + r.getSexo());
			}
		}
		Conexao.fecharConexao(con);

	
	}

}
