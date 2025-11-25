package Handlers;

import Model.Pedidos.Pedido;

public class OrcamentoFinanceiroHandler extends Handler {
    public Double orcamento = 15000.0;
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("--> Etapa: << Orçamento Financeiro >>");
        sleep();
        System.out.println("? Regra: O valor total do Pedido (Valor + Impostos) deve estar dentro do Orçamento de R$ " + orcamento);
        sleep();
        Double valorTotalPedido = pedido.valor + pedido.taxas;
        if (pedido.valor <= orcamento) {
            System.out.println("\uD83C\uDD97 APROVADO: O valor total do Pedido é R$ " + valorTotalPedido + " e está dentro do Orçamento.\n");
            setNext(new AprovacaoGerente());
            next.validar(pedido);
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: O valor total do Pedido é R$ " + valorTotalPedido + " e extrapola o Orçamento.\n");
        rejeitarPedido(pedido);
    }
}
