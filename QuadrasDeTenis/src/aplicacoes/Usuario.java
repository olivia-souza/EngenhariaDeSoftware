package aplicacoes;

public class Usuario {
	private Long id;
	private String nome, cpf, email, telefone;
	private boolean gestorQuadras, gestorUsuarios, relatorios, zelador, desabilitado, bloqueado;
	
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
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public boolean isgestorQuadras(){
		return gestorQuadras;
	}
	public void setgestorQuadras(boolean gestorQuadras){
		this.gestorQuadras = gestorQuadras;
	}
	public boolean isBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	public boolean isDesabilitado() {
		return desabilitado;
	}
	public void setDesabilitado(boolean desabilitado) {
		this.desabilitado = desabilitado;
	}
	public boolean isZelador() {
		return zelador;
	}
	public void setZelador(boolean zelador) {
		this.zelador = zelador;
	}
	public boolean isRelatorios() {
		return relatorios;
	}
	public void setRelatorios(boolean relatorios) {
		this.relatorios = relatorios;
	}
	public boolean isGestorUsuarios() {
		return gestorUsuarios;
	}
	public void setGestorUsuarios(boolean gestorUsuarios) {
		this.gestorUsuarios = gestorUsuarios;
	}
}
