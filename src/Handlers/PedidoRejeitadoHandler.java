package Handlers;

import Model.Pedidos.Pedido;

public class PedidoRejeitadoHandler extends Handler {
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("----------------------");
        System.out.println("\uD83D\uDDD9 PEDIDO REJEITADO");
        System.out.println("Validação encerrada");
    }
}
