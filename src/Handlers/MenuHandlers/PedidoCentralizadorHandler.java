package Handlers.MenuHandlers;

import Handlers.PedidoHandlers.MostrarDadosHandler;
import Model.Pedidos.Pedido;
import Model.Pedidos.PedidosMock;

public class PedidoCentralizadorHandler extends MenuHandler {

    @Override
    public void handle(int opcao) {
        if (opcao == 1) {
            Pedido pedido = PedidosMock.getPedidoCentralizadores();
            new MostrarDadosHandler().validar(pedido);
            return;
        }
        setNext(new PedidoStopCollarHandler());
        next.handle(opcao);
    }
}
