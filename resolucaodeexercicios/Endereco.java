package resolucaodeexercicios;

public class Endereco {

    String rua;
    String bairro;
    String cep;
    Cidade Cidade;

    public Endereco(String rua, String bairro, String cep, Cidade cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        Cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return Cidade;
    }

    public void setCidade(Cidade cidade) {
        Cidade = cidade;
    }

}
