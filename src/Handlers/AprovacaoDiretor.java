package Handlers;

import Model.Pedidos.Pedido;

public class AprovacaoDiretor extends Handler {
    public Double limite = 10000.0;
    public String regra = "<Aprovação Diretor> Pedidos até " + limite + " podem ser aprovados pelo Diretor";
    @Override
    public void validar(Pedido pedido) {
        sleep();
        Double valorTotalPedido = pedido.valor + pedido.taxas;
        if (valorTotalPedido <= limite) {
            System.out.println("\uD83C\uDD97 APROVADO: " + regra + "; Valor do pedido: " + valorTotalPedido);
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: " + regra + "; Valor do pedido: " + valorTotalPedido);
        System.out.println("-> Redirecionando para aprovação do CEO...");
        setNext(new AprovacaoCFO());
        next.validar(pedido);
    }
}
