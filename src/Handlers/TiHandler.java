package Handlers;

import Model.Pedidos.Pedido;

public class TiHandler extends Handler {
    String regra = "<TI> Pedidos de equipamentos de TI devem ser realizados pelo Almoxarifado";
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("--> Etapa: << Validação TI >>");
        sleep();
        System.out.println("? Regra: Pedidos de equipamentos de TI devem ser realizados apenas pelo Almoxarifado");
        sleep();
        if (!pedido.equipamentoTI) {
            System.out.println("! Status: \uD83C\uDD97 APROVADO: A área solicitante é " + pedido.areaSolicitante + "\n");
            setNext(new DefinirImpostos());
            next.validar(pedido);
            return;
        }
        System.out.println("! Status: \uD83D\uDDD9 REPROVADO: " + pedido.areaSolicitante + " não pode realizar pedidos de equipamentos de TI\n");
        rejeitarPedido(pedido);
    }
}
