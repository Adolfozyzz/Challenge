package br.com.calm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.calm.beans.Candidato;


public class CandidatoDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public CandidatoDAO(Connection con) {
		setCon(con);
	}

	public String inserirCarro(Candidato candidato) {
		String sql = "insert into candidato(sobremim, cpf, cp, rg, id, nome, sexo, telefone, datanascimento, email, senha)" + 
	" values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, candidato.getSobreMim());
			ps.setString(2, candidato.getCpf());
			ps.setString(3, candidato.getCp());
			ps.setString(4, candidato.getRg());
			ps.setString(5, candidato.getId());
			ps.setString(6, candidato.getNome());
			ps.setString(7, candidato.getSexo());
			ps.setInt(8, candidato.getTelefone());
			ps.setString(9, candidato.getDataNascimento());
			ps.setString(10, candidato.getEmail());
			ps.setString(11, candidato.getSenha());
		
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
			String sql = "delete from candidato";
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

		public String alterar(Candidato candidato) {
			String sql = "update candidato set sobremim = ?" + "where nome = ?";
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ps.setString(1, candidato.getSobreMim());
				ps.setString(2, candidato.getNome());
				
			
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
		public ArrayList<Candidato> retornarDados(){
			String sql = "select * from candidato";
			ArrayList<Candidato> retornarCandidato = new ArrayList<Candidato>();
			try {
				PreparedStatement ps = getCon().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				if (rs != null) {
					while (rs.next()) {
						Candidato candidato = new Candidato();
						candidato.setNome(rs.getString(6));
						candidato.setEmail(rs.getString(10));
						retornarCandidato.add(candidato);
					}
					return retornarCandidato;
				}else {
					return null;
				}
			}catch (SQLException e) {
				return null;
			}
		}
}
				
			
		

	
	
