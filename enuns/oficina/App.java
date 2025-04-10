package enuns.oficina;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("josé");
        Carro c1 = new Carro("hb20", LocalDate.of(2025, 04, 10), p1, "sedan");
        c1.trocaDeOleo();
        System.out.println(c1.toString());
        c1.revisao();
        System.out.println(c1.toString());

    }
}
