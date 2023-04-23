package br.com.candidato.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.calm.beans.Candidato;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.CandidatoDAO;

public class ProgramaSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Connection con = Conexao.abrirConexao();
		CandidatoDAO candidatodao = new CandidatoDAO(con);
		
		ArrayList<Candidato> lista = candidatodao.retornarDados();
		if(lista != null) {
			for (Candidato c : lista) {
				System.out.println("Nome: " + c.getNome());
				System.out.println("Email: " + c.getEmail());
			}
		}
		Conexao.fecharConexao(con);

	}

}
