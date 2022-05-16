package aplicacoes;

import java.time.LocalTime;

public class Reserva extends Agendamento {
	private Tipo_Pagamento pagamento;
    private LocalTime horarioRealInicio, horarioRealTermino;
    private double valorTotal;
    
    public Tipo_Pagamento getPagamento() {
        return pagamento;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public LocalTime getHorarioRealTermino() {
        return horarioRealTermino;
    }
    public void setHorarioRealTermino(LocalTime horarioRealTermino) {
        this.horarioRealTermino = horarioRealTermino;
    }
    public LocalTime getHorarioRealInicio() {
        return horarioRealInicio;
    }
    public void setHorarioRealInicio(LocalTime horarioRealInicio) {
        this.horarioRealInicio = horarioRealInicio;
    }
    public void setPagamento(Tipo_Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}