package enuns.oficina;

import java.time.LocalDate;

public class Carro extends Veiculo {

    private String Categoria;

    public Carro(String modelo, LocalDate dataConcerto, Proprietario proprietario, String categoria) {
        super(modelo, dataConcerto, proprietario);
        Categoria = categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

}
