package br.com.candidato.teste;

import java.sql.Connection;

import br.com.calm.beans.Candidato;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.CandidatoDAO;



public class ProgramaInserir {
	public static void main(String[] args) {

			Connection con = Conexao.abrirConexao();
			
			Candidato candidato = new Candidato();
			CandidatoDAO candidatodao = new CandidatoDAO(con);
			
			candidato.setSobreMim("eu programo");
			candidato.setCpf("234235235235");
			candidato.setCp("234243");
			candidato.setRg("12412407");
			candidato.setId("ergrgse");
			candidato.setNome("Zyzz");
			candidato.setSexo("seegse");
			candidato.setTelefone(1312412414);
			candidato.setDataNascimento("12/02/2000");
			candidato.setEmail("awrfawfa@gmail.com");
			candidato.setSenha("asfaewffaawff1");
			
			System.out.println(candidatodao.inserirCarro(candidato));
			
			Conexao.fecharConexao(con);
		}
	}


