package Handlers;

import Model.Pedidos.Pedido;

public class CalcularImpostosBrasil extends Handler {
    public Double taxa = 0.12;
    @Override
    public void validar(Pedido pedido) {
        sleep();
        Double imposto = pedido.valor * taxa;
        pedido.taxas += imposto;
        System.out.println("----------------------");
        System.out.println("*** Impostos Nacionais ***");
        System.out.println("Taxa de imposto: " + taxa * 100 + "%");
        System.out.println("Valor de Impostos Nacionais: R$ " + imposto);
        setNext(new OrcamentoFinanceiroHandler());
        next.validar(pedido);
    }
}
