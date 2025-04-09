package exerciciosinterface.exercicioslivraria;

public class TestaLivro {
    public static void main(String[] args) {
        // Criando dois livros
        Livro livro1 = new Livro("Marco Antônio", "Java para Profissionais", 120.00);
        Livro livro2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 100.00);

        // Reajuste de 6% no livro do Marco Antônio
        livro1.reajuste(6);

        // Operações
        Operacao op1 = new Operacao("", livro1);
        op1.venderLivro(); // Venda do livro do Marco Antônio

        Operacao op2 = new Operacao("", livro2);
        op2.emprestarLivro(); // Empréstimo do livro da Kathy Sierra

        // Exibição
        System.out.println("=== DETALHES DAS OPERAÇÕES ===");
        System.out.println(op1);
        System.out.println(op2);
    }
}