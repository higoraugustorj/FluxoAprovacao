package Handlers;

import Model.Pedidos.Pedido;

public class AprovacaoDiretor extends Handler {
    public Double limite = 10000.0;
    public String regra = "<Aprovação Diretor> Pedidos até " + limite + " podem ser aprovados pelo << Diretor >>";
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("****************************************************");
        System.out.println("\n==> Etapa: << Aprovação Diretor >>");
        System.out.println("? Regra: Pedidos com valor total acima de R$ 5000.0 devem ser aprovados pelo << Diretor >>.");
        sleep();
        Double valorTotalPedido = pedido.valor + pedido.taxas;
        System.out.println("Valor do Pedido: " + pedido.valor);
        System.out.println("Taxas: " + pedido.taxas);
        System.out.println("Valor total do Pedido: " + valorTotalPedido);
        String aprovado = System.console().readLine("<< Diretor >> Aprovar o pedido? " + pedido.numero + "(s = sim | n = não):");
        if (aprovado.equals("s")) {
            System.out.println("\uD83C\uDD97 APROVADO: O Pedido com valor total de R$ " + valorTotalPedido + " foi aprovado pelo << Diretor >>");
            sleep();
            if (valorTotalPedido >= limite) {
                setNext(new AprovacaoCFO());
                next.validar(pedido);
            }
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: O pedido foi reprovado pelo << Diretor >>.");
        rejeitarPedido(pedido);
    }
}
