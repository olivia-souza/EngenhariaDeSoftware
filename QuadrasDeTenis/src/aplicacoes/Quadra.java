package aplicacoes;

public class Quadra {
	Long id;
	private String numero, tipo;
	private boolean coberta, arquibancada, banco;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isCoberta() {
		return coberta;
	}
	public void setCoberta(boolean coberta) {
		this.coberta = coberta;
	}
	public boolean isArquibancada() {
		return arquibancada;
	}
	public void setArquibancada(boolean arquibancada) {
		this.arquibancada = arquibancada;
	}
	public boolean isBanco() {
		return banco;
	}
	public void setBanco(boolean banco) {
		this.banco = banco;
	}
}
