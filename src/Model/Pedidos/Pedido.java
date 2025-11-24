package Model.Pedidos;

import Model.Cotacoes.Cotacao;

import java.util.ArrayList;

public class Pedido {
    public int numero;
    public String areaSolicitante;
    public int cotacoesValidas;
    public Cotacao cotacaoSelecionada;
    public String descricao;
    public ArrayList<Cotacao> cotacoes;
    public boolean equipamentoTI;
    public Double taxas = 0.0;
    public Double valor;

    public Pedido(String descricao, ArrayList<Cotacao> cotacoes, boolean equipamentoTI) {
        this.areaSolicitante = "Supply Chain";
        this.descricao = descricao;
        this.cotacoes = cotacoes;
        this.equipamentoTI = equipamentoTI;
        contarCotacoesValidas();
        definirCotacaoVencedora();
    }

    public void mostrarDados() {
        System.out.println("----------------------");
        System.out.println("*** Dados do Pedido ***");
        mostrarDescricaoProduto();
        mostrarEquipamentoTI();
        mostrarAreaSolicitante();
        mostrarQuantidadeCotacoes();
        mostrarDadosCotacoes();
    }

    private void contarCotacoesValidas() {
        for (Cotacao cotacao : cotacoes) {
            if (cotacao.fornecedor.compraPermitida) {
                cotacoesValidas ++;
            }
        }
    }

    private void mostrarDescricaoProduto() {
        System.out.println("----------------------");
        System.out.println("Descrição do Produto: " + descricao);
    }

    private void mostrarQuantidadeCotacoes() {
        System.out.println("Cotações válidas: " + cotacoesValidas);
    }

    private void mostrarDadosCotacoes() {
        for (Cotacao cotacao : cotacoes) {
            if (cotacao.fornecedor.compraPermitida) {
                cotacao.mostrarDadosCotacao();
            }
        }
    }

    private void mostrarEquipamentoTI() {
        if (equipamentoTI) {
            System.out.println("Equipamento de TI: SIM");
            return;
        }
        System.out.println("Equipamento de TI: NÃO");
    }

    private void mostrarAreaSolicitante() {
        System.out.println("Área Solicitante: " + areaSolicitante);
    }

    private void definirCotacaoVencedora() {
        Double menorValor = 100000.0;
        for (Cotacao cotacao : cotacoes) {
            if (cotacao.valor < menorValor) {
                cotacaoSelecionada = cotacao;
                valor = cotacao.valor;
            }
        }
    }
}