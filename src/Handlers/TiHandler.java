package Handlers;

import Model.Pedidos.Pedido;

public class TiHandler extends Handler {
    String regra = "<TI> Pedidos de equipamentos de TI devem ser realizados pelo Almoxarifado";
    @Override
    public void validar(Pedido pedido) {
        sleep(2);
        if (!pedido.equipamentoTI) {
            System.out.println("\uD83C\uDD97 APROVADO: " + regra + ": ÁREA SOLICITANTE: " + pedido.areaSolicitante);
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: " + regra + ": ÁREA SOLICITANTE: " + pedido.areaSolicitante);
    }
}
