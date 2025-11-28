package Handlers.MenuHandlers;

import Handlers.PedidoHandlers.MostrarDadosHandler;
import Model.Pedidos.Pedido;
import Model.Pedidos.PedidosMock;

public class PedidoStopCollarHandler extends MenuHandler {
    @Override
    public void handle(int opcao) {
        if (opcao == 2) {
            Pedido pedido = PedidosMock.getPedidoStopCollars();
            new MostrarDadosHandler().validar(pedido);
            return;
        }
        setNext(new PedidoFloatShoesHandler());
        next.handle(opcao);
    }
}
