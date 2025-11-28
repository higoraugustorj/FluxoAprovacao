package Handlers;

import Model.Pedidos.Pedido;

public class PedidoRejeitadoHandler extends Handler {
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("****************************************************");
        System.out.println("-> Etapa: << Rejeitar Pedido >>");
        System.out.println(":: Status: \uD83D\uDDD9 Pedido rejeitado por não atender às regras de negócio");
        sleep();
        System.out.println("****************************************************");
        System.out.println("-> Processo Encerrado");
    }
}
