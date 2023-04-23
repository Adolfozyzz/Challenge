package br.com.calm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.calm.beans.EnsinoSuperior;


public class EnsinoSuperiorDAO {
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public EnsinoSuperiorDAO(Connection con) {
		setCon(con);
	}

	public String inserirEnsinoSuperior(EnsinoSuperior ensinosuperior) {
		String sql = "insert into ensinosuperior(nomeinstituido, tipoescolaridade, completo, datafinal, nomegraduacao, datainiciada)" + 
	" values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
	
			
			ps.setString(1, ensinosuperior.getNomeInstituido());
			ps.setString(2, ensinosuperior.getTipoEscolaridade());
			ps.setBoolean(3, true);
			ps.setString(4, ensinosuperior.getDataFinal());
			ps.setString(5, ensinosuperior.getNomeGraduacao());
			ps.setString(6, ensinosuperior.getDataIniciada());
			
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
				String sql = "delete from ensinosuperior";
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

			public String alterar(EnsinoSuperior ensinosuperior) {
				String sql = "update ensinosuperior set nomeinstituido = ?" + "where tipoescolaridade = ?";
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, ensinosuperior.getNomeInstituido());
					ps.setString(2, ensinosuperior.getTipoEscolaridade());
					
				
					if (ps.executeUpdate() > 0) {
						return "Alterado com sucesso";
					} else {
						return "Erro ao alterar";
					}
				} catch (SQLException e) {
					return e.getMessage();
				}
			}
			public ArrayList<EnsinoSuperior> retornarDados(){
				String sql = "select * from ensinosuperior";
				ArrayList<EnsinoSuperior> retornarEnsinoSuperior = new ArrayList<EnsinoSuperior>();
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					if (rs != null) {
						while (rs.next()) {
							EnsinoSuperior ensinosuperior = new EnsinoSuperior();
							
							ensinosuperior.setNomeGraduacao(rs.getString(5));
							ensinosuperior.setTipoEscolaridade(rs.getNString(2));
							retornarEnsinoSuperior.add(ensinosuperior);
						}
						return retornarEnsinoSuperior;
					}else {
						return null;
					}
				}catch (SQLException e) {
					return null;
				}

			}
}
