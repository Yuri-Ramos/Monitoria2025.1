package enuns.oficina;

public enum TipoServico {

    OLEO(100.0),
    LAVAGEM(50.0),
    REVISAO(200.0);

    private final Double valor;

    private TipoServico(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

}
