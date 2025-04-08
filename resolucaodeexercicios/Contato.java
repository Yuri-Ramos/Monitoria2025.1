package resolucaodeexercicios;

import java.util.ArrayList;
import java.util.List;

public class Contato {

    String nome;
    List<Telefone> telefones = new ArrayList<>();
    Endereco endereco;

    public Contato(String nome, List<Telefone> telefones, Endereco endereco) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    // metodos
    public void mostrarTelefones() {
        System.out.println("Nome: " + this.nome);
        for (Telefone t : telefones) {
            System.out.println("Telefone: " + t.getNumero());
        }
        System.out.println("Endereco: " + this.endereco.getRua() + ", " + this.endereco.getBairro() + ", "
                + this.endereco.getCidade().getEstado().getNome() + ", "
                + this.endereco.getCidade().getEstado().getSigla() + ", " + this.endereco.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
