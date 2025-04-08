package resolucaodeexercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    
        public static void main(String[] args) {
            Estado estado1 = new Estado("São Paulo", "SP");
            Cidade cidade1 = new Cidade("Campinas", estado1);
            Endereco endereco = new Endereco("Rua das Flores","Agrioes", "123", cidade1);

            List<Telefone> telefones = new ArrayList<>();
            telefones.add(new Telefone( "1199999-9999"));
            telefones.add(new Telefone( "113333-4444"));

            Contato contato = new Contato("João Silva", telefones, endereco);
            contato.mostrarTelefones();
        }
    
}