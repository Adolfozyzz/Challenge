package br.com.recrutador.teste;

import java.sql.Connection;

import br.com.calm.beans.Recrutador;
import br.com.calm.conexao.Conexao;
import br.com.calm.dao.RecrutadorDAO;

;

public class ProgramaInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		
		Recrutador recrutador = new Recrutador();
	    RecrutadorDAO recrutadordao = new RecrutadorDAO(con);
	    
	    recrutador.setId("afafra");
	    recrutador.setNome("jeff seid");
	    recrutador.setSexo("feminino");
	    recrutador.setTelefone(1243512424);
	    recrutador.setDataNascimento("12/08/2003");
	    recrutador.setEmail("awrfoafwn@afaf");
	    recrutador.setSenha("aqfafafa");
	    recrutador.setEmpresaRepresentante("shark");
	    
	    System.out.println(recrutadordao.inserirCarro(recrutador));
	
	Conexao.fecharConexao(con);
}
}
