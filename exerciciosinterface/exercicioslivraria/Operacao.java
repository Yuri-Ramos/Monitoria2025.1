package exerciciosinterface.exercicioslivraria;

public class Operacao implements Livraria {
    private String tipo;
    private double valorOperacao;
    private Livro livro;

    public Operacao(String tipo, Livro livro) {
        this.tipo = tipo;
        this.livro = livro;
    }

    @Override
    public void venderLivro() {
        valorOperacao = livro.getValor() * 1.09; // +9%
        tipo = "Venda";
    }

    @Override
    public void emprestarLivro() {
        valorOperacao = (livro.getValor() * 0.02) + taxaEmprestimo;
        tipo = "Empréstimo";
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
public String toString() {
    // Retorna uma string formatada usando o método String.format
    // Os placeholders dentro da string ("%-10s", "%.2f", etc.) definem como os dados serão exibidos
    return String.format(
        // "Operação: %-10s" → mostra o tipo da operação (ex: "Venda") com no mínimo 10 caracteres, alinhado à esquerda
        // "Valor: R$ %.2f" → mostra o valor da operação com 2 casas decimais, formatado como valor monetário
        // "Livro: %-20s" → mostra o título do livro com no mínimo 20 caracteres, alinhado à esquerda
        // "Autor: %-15s" → mostra o nome do autor com no mínimo 15 caracteres
        // "Preço Livro: R$ %.2f" → mostra o valor do livro com 2 casas decimais
        "Operação: %-10s | Valor: R$ %.2f | Livro: %-20s | Autor: %-15s | Preço Livro: R$ %.2f",

        // Esses são os valores que serão colocados nos respectivos marcadores acima
        tipo,                     // Tipo da operação: "Venda" ou "Empréstimo"
        valorOperacao,           // Valor total da operação (com acréscimo ou taxa)
        livro.getTitulo(),       // Título do livro associado à operação
        livro.getAutor(),        // Nome do autor do livro
        livro.getValor()         // Valor atual do livro
    );
}

}