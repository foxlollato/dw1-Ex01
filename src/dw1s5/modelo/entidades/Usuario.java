package dw1s5.modelo.entidades;

public class Usuario {

	private String email;
	private String senha;
	private String papel;
	
	public Usuario(String email, String senha, String papel) {
		this.email = email;
		this.senha = senha;
		this.papel = papel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getPapel() {
		return papel;
	}
}
