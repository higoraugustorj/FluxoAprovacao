package Handlers;

import Model.Pedidos.Pedido;

public class CalcularImpostosInternacionais extends Handler {
    public Double taxa = 0.35;
    @Override
    public void validar(Pedido pedido) {
        sleep();
        Double imposto = pedido.valor * taxa;
        pedido.taxas += imposto;
        System.out.println("----------------------");
        System.out.println("*** Impostos Internacionais ***");
        System.out.println("Taxa de imposto: " + taxa * 100 + "%");
        System.out.println("Valor de Impostos Internacionais: R$ " + imposto);
        setNext(new CalcularImpostosBrasil());
        next.validar(pedido);
    }
}
