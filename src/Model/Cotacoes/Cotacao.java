package Model.Cotacoes;

import Model.Fornecedores.Fornecedor;
import Model.Fornecedores.Nacionalidade;

public class Cotacao {
    public String descricaoProduto;
    public Fornecedor fornecedor;
    public Double valor;

    public Cotacao(String descricaoProduto, String nomeFornecedor, boolean compraPermitida, Double valor, Nacionalidade nacionalidade) {
        this.descricaoProduto = descricaoProduto;
        fornecedor = new Fornecedor(nomeFornecedor, compraPermitida, nacionalidade);
        this.valor = valor;
    }

    public void mostrarDadosCotacao() {
        System.out.println("----------------------");
        System.out.println(":: Dados da Cotação ::");
        fornecedor.mostrarDadosFornecedor();
        mostrarValorCotado();
    }

    private void mostrarValorCotado() {
        System.out.println("Valor cotado: " + valor);
    }
}
