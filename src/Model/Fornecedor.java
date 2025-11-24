package Model;

public class Fornecedor {
    public String nome;
    public boolean compraPermitida;

    public Fornecedor(String nome, boolean compraPermitida) {
        this.nome = nome;
        this.compraPermitida = compraPermitida;
    }
}