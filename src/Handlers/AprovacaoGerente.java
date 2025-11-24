package Handlers;

import Model.Pedidos.Pedido;

public class AprovacaoGerente extends Handler {
    public Double limite = 5000.0;
    public String regra = "<Aprovação Gerente> Pedidos até " + limite + " podem ser aprovados pelo gerente";
    @Override
    public void validar(Pedido pedido) {
        sleep();
        Double valorTotalPedido = pedido.valor + pedido.taxas;
        if (valorTotalPedido <= limite) {
            System.out.println("\uD83C\uDD97 APROVADO: " + regra + "; Valor do pedido: " + valorTotalPedido);
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: " + regra + "; Valor do pedido: " + valorTotalPedido);
        setNext(new AprovacaoDiretor());
        next.validar(pedido);
    }
}
