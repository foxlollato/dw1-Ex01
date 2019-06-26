package dw1s5.modelo.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import javax.sql.DataSource;

import dw1s5.modelo.entidades.Usuario;

public class UsuarioDao {
	private DataSource dataSource;
	
	public UsuarioDao(DataSource dataSource) {
		this.dataSource = dataSource;
	}	
	
	
	public Optional<Usuario> getUsuarioPeloEmailESenha(String email, String senha) {
		String sql = "select email,senha, papel from Usuario where email=? and senha=?";
		Optional<Usuario> opt = Optional.empty();
		try(Connection con = dataSource.getConnection();
			PreparedStatement pStat = con.prepareStatement(sql))
		{
			pStat.setString(1, email);
			pStat.setString(2, senha);
			try(ResultSet rs = pStat.executeQuery()) {
				if(rs.next()) {
					String papel = rs.getString(3);
					Usuario usuario = new Usuario(email, senha, papel);
					opt = Optional.of(usuario);
				}
			}
			return opt;
		}
		catch(SQLException erro) {
			throw new RuntimeException("Erro durante a consulta", erro);
		}
	}
}
