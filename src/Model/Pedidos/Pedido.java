package Model.Pedidos;

import Model.Cotacoes.Cotacao;

import java.util.ArrayList;

public class Pedido {
    public ArrayList<Cotacao> cotacoes;
    public boolean equipamentoTI;
    public Double valor;

    public Pedido(ArrayList<Cotacao> cotacoes, boolean equipamentoTI) {
        this.cotacoes = cotacoes;
        this.equipamentoTI = equipamentoTI;
    }
}