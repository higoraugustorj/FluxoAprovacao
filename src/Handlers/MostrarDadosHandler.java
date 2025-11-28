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
        System.out.println(":: Processo iniciado: << Fluxo de Aprovação >>\n");
        sleep();
        System.out.println("****************************************************");
        System.out.println("--> Etapa: << Mostrar dados do Pedido >>\n");
        pedido.mostrarDados();
        next.validar(pedido);
    }
}
