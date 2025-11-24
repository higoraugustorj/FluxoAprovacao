package Handlers;

import Model.Pedidos.Pedido;

public class OrcamentoFinanceiroHandler extends Handler {
    private String regra = "<Financeiro> O valor total do pedido deve ser menor ou igual ao valor do Orçamento";
    public Double orcamento = 15000.0;
    @Override
    public void validar(Pedido pedido) {
        sleep();
        Double valorTotalPedido = pedido.valor + pedido.taxas;
        if (pedido.valor <= orcamento) {
            System.out.println("\uD83C\uDD97 APROVADO: " + regra + ": Orçamento: R$ " + orcamento + "; Valor total do pedido: R$ " + valorTotalPedido);
            setNext(new AprovacaoGerente());
            next.validar(pedido);
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: " + regra + ": Orçamento: R$ " + orcamento + "; Valor total do pedido: R$ " + valorTotalPedido);
        rejeitarPedido(pedido);
    }
}
