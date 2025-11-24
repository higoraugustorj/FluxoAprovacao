package Model.Pedidos;

import Model.Cotacoes.CotacoesMock;

public class PedidosMock {
    public static Pedido getPedidoCentralizadores() {
        return new Pedido(CotacoesMock.getCotacaoCentralizadores(), false);
    }

    public static Pedido getPedidoStopCollars() {
        return new Pedido(CotacoesMock.getCotacaoStopCollars(), false);
    }

    public static Pedido getPedidoFloatShoes() {
        return new Pedido(CotacoesMock.getCotacaoFloatShoes(), false);
    }
}
