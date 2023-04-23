package br.com.calm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.calm.beans.EnsinoMedio;



public class EnsinoMedioDAO {
	
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public EnsinoMedioDAO(Connection con) {
		setCon(con);
	}

	public String inserirEnsinoSuperior(EnsinoMedio ensinomedio) {
		String sql = "insert into ensinomedio(nomeinstituido, tipoescolaridade, completo, datafinal)" + 
	" values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
	
			
			ps.setString(1, ensinomedio.getNomeInstituido());
			ps.setString(2, ensinomedio.getTipoEscolaridade());
			ps.setBoolean(3, true);
			ps.setString(4, ensinomedio.getDataFinal());
			
			
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
				String sql = "delete from ensinomedio";
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

			public String alterar(EnsinoMedio ensinomedio) {
				String sql = "update ensinomedio set nomeinstituido = ?" + "where tipoescolaridade = ?";
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ps.setString(1, ensinomedio.getNomeInstituido());
					ps.setString(2,ensinomedio.getTipoEscolaridade());
					
				
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
			public ArrayList<EnsinoMedio> retornarDados(){
				String sql = "select * from ensinomedio";
				ArrayList<EnsinoMedio> retornarEnsinoMedio = new ArrayList<EnsinoMedio>();
				try {
					PreparedStatement ps = getCon().prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					if (rs != null) {
						while (rs.next()) {
							EnsinoMedio ensinomedio = new EnsinoMedio();
							
						ensinomedio.setNomeInstituido(rs.getString(1));
						ensinomedio.setTipoEscolaridade(rs.getString(2));
							
							retornarEnsinoMedio.add(ensinomedio);
						}
						return retornarEnsinoMedio;
					}else {
						return null;
					}
				}catch (SQLException e) {
					return null;
				}
			}

			}


