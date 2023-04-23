package br.com.calm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.calm.beans.Recrutador;

public class RecrutadorDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public RecrutadorDAO(Connection con) {
		setCon(con);
	}

	public String inserirCarro(Recrutador recrutador) {
		String sql = "insert into recrutador(id, nome, sexo, telefone, datanascimento, email, senha, empresarepresentante)" + 
	" values (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, recrutador.getId());
			ps.setString(2, recrutador.getNome());
			ps.setString(3, recrutador.getSexo());
			ps.setInt(4, recrutador.getTelefone());
			ps.setString(5, recrutador.getDataNascimento());
			ps.setString(6, recrutador.getEmail());
			ps.setString(7, recrutador.getSenha());
			ps.setString(8, recrutador.getEmpresaRepresentante());
		
		
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	// M�todo deletar
		public String deletar() {
			String sql = "delete from recrutador";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				if (ps.executeUpdate() > 0) {
					return "Deletado com sucesso.";
				} else {
					return "Erro ao deletar.";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}

		// M�todo alterar

		public String alterar(Recrutador recrutador) {
			String sql = "update recrutador set nome = ?" + "where sexo = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				
				ps.setString(1, recrutador.getNome());
				ps.setString(2, recrutador.getSexo());
				
			
				if (ps.executeUpdate() > 0) {
					return "Alterado com sucesso";
				} else {
					return "Erro ao alterar";
				}
			} catch (SQLException e) {
				return e.getMessage();
			}
		}
		//metodo select
		public ArrayList<Recrutador> retornarDados(){
			String sql = "select * from recrutador";
			ArrayList<Recrutador> retornarRecrutador = new ArrayList<Recrutador>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						Recrutador recrutador = new Recrutador();
						
						recrutador.setNome(rs.getString(2));
						recrutador.setSexo(rs.getString(3));
						retornarRecrutador.add(recrutador);
					}
					return retornarRecrutador;
				}else {
					return null;
				}
			}catch (SQLException e) {
				return null;
			}
		}


}
