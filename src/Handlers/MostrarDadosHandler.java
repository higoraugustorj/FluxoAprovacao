package Handlers;

import Model.Pedidos.Pedido;

public class MostrarDadosHandler extends Handler {

    public MostrarDadosHandler() {
        setNext(new ComplianceHandler());
    }

    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println(":: Gatilho: << Novo Pedido Realizado >>");
        System.out.println(":: Processo iniciado: << Fluxo de Aprovação >>");
        sleep();
        System.out.println("--> Etapa: << Mostrar dados do Pedido >>\n");
        sleep();
        pedido.mostrarDados();
        next.validar(pedido);
    }
}
