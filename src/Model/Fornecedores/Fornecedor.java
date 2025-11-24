package Model.Fornecedores;

public class Fornecedor {
    public String nome;
    public boolean compraPermitida;
    public Nacionalidade nacionalidade;

    public Fornecedor(String nome, boolean compraPermitida, Nacionalidade nacionalidade) {
        this.nome = nome;
        this.compraPermitida = compraPermitida;
    }
}