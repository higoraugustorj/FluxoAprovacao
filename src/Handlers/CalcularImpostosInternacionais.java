package Handlers;

import Model.Pedidos.Pedido;

public class CalcularImpostosInternacionais extends Handler {
    public Double taxa = 0.35;
    @Override
    public void validar(Pedido pedido) {
        sleep();
        Double imposto = pedido.valor * taxa;
        pedido.taxas += imposto;
        sleep();
        System.out.println("--> Etapa: << Calcular Impostos Internacionais >>");
        sleep();
        System.out.println("? Regra: Pedidos Internacionais devem ser submetidos à taxa de importação de 35%");
        sleep();
        System.out.println("Taxa de imposto: " + taxa * 100 + "%");
        System.out.println("Valor de Impostos Internacionais: R$ " + imposto + "\n");
        setNext(new CalcularImpostosBrasil());
        next.validar(pedido);
    }
}
