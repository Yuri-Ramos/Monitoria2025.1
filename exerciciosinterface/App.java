package exerciciosinterface;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Pais pais1 = new Pais("Brasil");

        Atletas at1 = new Atletas("João", 15.0, pais1);
        Atletas at2 = new Atletas("Maria", 95.0, pais1);
        Atletas at3 = new Atletas("Joao", 95.0, pais1);

        Atletas[] atletas = { at1, at2, at3 };

        int totalParticipantes = 0;

        for (Atletas atleta : atletas) {
            String situacao = atleta.verificaSituacao();
            System.out.println("Atleta: " + atleta.getNome() + " - Situação: " + situacao);

            if (situacao.equals("participará")) {
                totalParticipantes++;
            }
        }

        System.out.println("Total de participantes: " + totalParticipantes);
    }
}
