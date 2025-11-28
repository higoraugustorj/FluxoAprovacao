package Handlers;

import Model.Pedidos.Pedido;

public class CalcularImpostosBrasil extends Handler {
    public Double taxa = 0.12;
    @Override
    public void validar(Pedido pedido) {
        Double imposto = pedido.valor * taxa;
        pedido.taxas += imposto;
        sleep();
        System.out.println("****************************************************");
        System.out.println("--> Etapa: << Calcular Impostos Nacionais >>");
        System.out.println("? Regra: Todo pedido deve ser submetido a impostos nacionais de 12%");
        sleep();
        System.out.println("Taxa de imposto: " + taxa * 100 + "%");
        System.out.println("Valor de Impostos Nacionais: R$ " + imposto + "\n");
        setNext(new OrcamentoFinanceiroHandler());
        next.validar(pedido);
    }
}
