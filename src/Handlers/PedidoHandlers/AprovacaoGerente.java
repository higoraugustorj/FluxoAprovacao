package Handlers.PedidoHandlers;

import Model.Pedidos.Pedido;

public class AprovacaoGerente extends Handler {
    public Double limite = 5000.0;
    public String regra = "<Aprovação Gerente> Pedidos até " + limite + " podem ser aprovados pelo << Gerente >>";
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("****************************************************");
        System.out.println("\n==> Etapa: << Aprovação Gerente >>");
        System.out.println("? Regra: Qualquer pedido deve ser aprovado pelo << Gerente >>.");
        sleep();
        Double valorTotalPedido = pedido.valor + pedido.taxas;
        System.out.println("Valor do Pedido: " + pedido.valor);
        System.out.println("Taxas: " + pedido.taxas);
        System.out.println("Valor total do Pedido: " + valorTotalPedido);
        String aprovado = System.console().readLine("<< Gerente >> Aprovar o pedido? " + pedido.numero + "(s = sim | n = não):");
        if (aprovado.equals("s")) {
            System.out.println("\uD83C\uDD97 APROVADO: O Pedido com valor total de R$ " + valorTotalPedido + " foi aprovado pelo << Gerente >>");
            sleep();
            if (valorTotalPedido >= limite) {
                setNext(new AprovacaoDiretor());
                next.validar(pedido);
                return;
            }
            setNext(new MostrarPedidoAprovadoHandler());
            next.validar(pedido);
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: O pedido foi reprovado pelo << Gerente >>.");
        rejeitarPedido(pedido);
    }
}
