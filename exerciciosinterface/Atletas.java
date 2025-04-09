package exerciciosinterface;

public class Atletas {
    private String nome;
    private double peso;
    private String modalidade;
    private Pais pais;

    // Construtor que aceita nome, peso e país
    public Atletas(String nome, double peso, Pais pais) {
        this.nome = nome;
        this.peso = peso;
        this.pais = pais;
    }

    public String verificaSituacao() {
        if (peso > 90) {
            modalidade = "peso pesado";
            return "participará";
        } else if (peso >= 60) {
            modalidade = "peso médio";
            return "participará";
        } else {
            return "não participará";
        }
    }

    public int getTotalParticipantes() {
        return 1; // Sempre retorna 1 se chamado, ou você pode adaptar
    }

    // Getters e setters, se necessário
    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getModalidade() {
        return modalidade;
    }

    public Pais getPais() {
        return pais;
    }
}
