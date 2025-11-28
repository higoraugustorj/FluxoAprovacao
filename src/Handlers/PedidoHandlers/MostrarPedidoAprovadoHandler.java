package Handlers.PedidoHandlers;

import Handlers.MenuHandlers.MenuHandler;
import Model.Pedidos.Pedido;

public class MostrarPedidoAprovadoHandler extends Handler {
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("****************************************************");
        System.out.println("\n==> Etapa: << Mostrar Pedido Aprovado >>");
        System.out.println("? Regra: O pedido deve ter sido aprovado em todas as etapas de aprovação anteriores.");
        sleep();
        Double valorTotalPedido = pedido.valor + pedido.taxas;
        System.out.println("\nDados do Pedido aprovado:");
        System.out.println("Número do Pedido: " + pedido.numero);
        System.out.println("Área solicitante: " + pedido.areaSolicitante);
        System.out.println("Descrição: " + pedido.descricao);
        System.out.println("Cotação vencedora:");
        pedido.cotacaoSelecionada.mostrarDadosCotacao();
        System.out.println("Valor do Produto: " + pedido.valor);
        System.out.println("Taxas: " + pedido.taxas);
        System.out.println("Valor total do Pedido: " + valorTotalPedido);
        MenuHandler.iniciar();
    }
}
