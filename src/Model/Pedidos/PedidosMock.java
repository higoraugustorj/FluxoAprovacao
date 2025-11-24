package Model.Pedidos;

import Model.Cotacoes.CotacoesMock;

public class PedidosMock {
    public static Pedido getPedidoCentralizadores() {
        return new Pedido("Centralizador 22", CotacoesMock.getCotacaoCentralizadores(), false);
    }

    public static Pedido getPedidoStopCollars() {
        return new Pedido("Stop Collar 22", CotacoesMock.getCotacaoStopCollars(), false);
    }

    public static Pedido getPedidoFloatShoes() {
        return new Pedido("Float Shoe 22", CotacoesMock.getCotacaoFloatShoes(), false);
    }
}
