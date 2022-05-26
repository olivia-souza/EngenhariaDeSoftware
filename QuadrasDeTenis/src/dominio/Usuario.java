package dominio;
import java.time.LocalDate;

public class Usuario {
	protected Long id;
	protected String nome, cpf, email, senha;
	NivelPermissao nivel_permissao;
	LocalDate data_criacao;
	protected boolean desabilitado, bloqueado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public NivelPermissao getNivel_permissao() {
		return nivel_permissao;
	}
	public void setNivel_permissao(NivelPermissao nivel_permissao) {
		this.nivel_permissao = nivel_permissao;
	}
	public LocalDate getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(LocalDate data_criacao) {
		this.data_criacao = data_criacao;
	}
	public boolean isDesabilitado() {
		return desabilitado;
	}
	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}
	public boolean isBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	
	
}
