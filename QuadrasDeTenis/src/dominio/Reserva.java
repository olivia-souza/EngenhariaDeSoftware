package dominio;
import java.time.LocalTime;

public class Reserva extends Agendamento {
	private TipoPagamento pagamento;
    private LocalTime horarioRealInicio, horarioRealTermino;
    private double valorTotal;
    
    public TipoPagamento getPagamento() {
        return pagamento;
    }
    public LocalTime getHorarioRealInicio() {
        return horarioRealInicio;
    }
    public void setHorarioRealInicio(LocalTime horarioRealInicio) {
        this.horarioRealInicio = horarioRealInicio;
    }
    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }
    public LocalTime getHorarioRealTermino() {
        return horarioRealTermino;
    }
    public void setHorarioRealTermino(LocalTime horarioRealTermino) {
        this.horarioRealTermino = horarioRealTermino;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
