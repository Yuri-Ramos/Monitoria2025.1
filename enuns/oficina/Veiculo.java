package enuns.oficina;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
    protected String modelo;
    protected Double valorCobrado = 0.0;
    protected LocalDate dataConcerto;
    protected Proprietario proprietario;

    public Veiculo(String modelo, LocalDate dataConcerto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConcerto = dataConcerto;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConcerto=" + dataConcerto
                + ", proprietario=" + proprietario + "]";
    }

    public Double getValorCobrado() {
        return valorCobrado;
    }

    @Override
    public Double revisao() {
        // Revisao – No mês de agosto o cliente terá 10% de desconto na revisão.
        if (dataConcerto.getMonthValue() == 8) {
            valorCobrado += TipoServico.REVISAO.getValor() * 0.9;
            return valorCobrado;
        }
        return valorCobrado += TipoServico.REVISAO.getValor();

    }

    @Override
    public Double trocaDeOleo() {
        if (dataConcerto.getDayOfWeek().getValue() == 6) {
            return valorCobrado += TipoServico.OLEO.getValor() - 50.0;
        }

        return valorCobrado += TipoServico.OLEO.getValor();
    }

    @Override
    public Double lavarVeiculo() {

        return valorCobrado += TipoServico.LAVAGEM.getValor();

    }
}
