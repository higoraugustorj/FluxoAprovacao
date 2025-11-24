package Handlers;

import Model.Pedidos.Pedido;

public class MostrarDadosHandler extends Handler {

    public MostrarDadosHandler() {
        setNext(new ComplianceHandler());
    }

    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("----------------------");
        System.out.println("*** Novo Pedido Realizado ***");
        pedido.mostrarDados();
        sleep();
        mostrarStatusAprovacao();
        next.validar(pedido);
    }

    private void mostrarStatusAprovacao() {
        System.out.println("\n\n\n\n\n\n----------------------");
        System.out.println("CADEIA DE VALIDAÇÃO DO PEDIDO INICIADA");
        sleep();
    }
}
