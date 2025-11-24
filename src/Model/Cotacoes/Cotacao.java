package Model.Cotacoes;

import Model.Fornecedor;

public class Cotacao {
    public String descricaoProduto;
    public Fornecedor fornecedor;
    public Double valor;

    public Cotacao(String descricaoProduto, String nomeFornecedor, boolean compraPermitida, Double valor) {
        this.descricaoProduto = descricaoProduto;
        fornecedor = new Fornecedor(nomeFornecedor, compraPermitida);
        this.valor = valor;
    }
}
