package Handlers.MenuHandlers;

import Handlers.PedidoHandlers.MostrarDadosHandler;
import Model.Pedidos.Pedido;
import Model.Pedidos.PedidosMock;

public class PedidoFloatShoesHandler extends MenuHandler {
    @Override
    public void handle(int opcao) {
        if (opcao == 3) {
            Pedido pedido = PedidosMock.getPedidoFloatShoes();
            new MostrarDadosHandler().validar(pedido);
            return;
        }
        setNext(new PedidoInvalidoHandler());
        next.handle(opcao);
    }
}
