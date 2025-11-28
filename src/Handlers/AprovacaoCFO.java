package Handlers;

import Model.Pedidos.Pedido;

public class AprovacaoCFO extends Handler {
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("****************************************************");
        System.out.println("\n==> Etapa: << Aprovação CFO >>");
        System.out.println("? Regra: Pedidos com valor total acima de R$ 10000.0 devem ser aprovados pelo << CFO >>.");
        sleep();
        Double valorTotalPedido = pedido.valor + pedido.taxas;
        System.out.println("Valor do Pedido: " + pedido.valor);
        System.out.println("Taxas: " + pedido.taxas);
        System.out.println("Valor total do Pedido: " + valorTotalPedido);
        String aprovado = System.console().readLine("<< CFO >> Aprovar o pedido? " + pedido.numero + "(s = sim | n = não):");
        if (aprovado.equals("s")) {
            System.out.println("\uD83C\uDD97 APROVADO: O Pedido com valor total de R$ " + valorTotalPedido + " foi aprovado pelo << CFO >>");
            sleep();
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: O pedido foi reprovado pelo << CFO >>.");
        rejeitarPedido(pedido);
    }
}
