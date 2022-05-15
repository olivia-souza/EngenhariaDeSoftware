package aplicacoes;

public class Quadra {
	Long id;
	private Tipo_Quadra tipo;
	private String numero;
	private boolean coberta, arquibancada, banco;
	
	private double precoReservaPeriodoMinimo(){
		double x = 2;
		return x + 2;
	}
	
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
	public Tipo_Quadra getTipo_Quadras(){
		return tipo;
	}
	public void setTipo_Quadras(Tipo_Quadra tipo){
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
