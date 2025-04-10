package enuns.oficina;

import java.time.LocalDate;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, LocalDate dataConcerto, Proprietario proprietario, int cilindradas) {
        super(modelo, dataConcerto, proprietario);
        this.cilindradas = cilindradas;
    }

}
