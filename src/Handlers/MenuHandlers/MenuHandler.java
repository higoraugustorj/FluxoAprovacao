package Handlers.MenuHandlers;

import Handlers.PedidoHandlers.Handler;
import Handlers.PedidoHandlers.MostrarDadosHandler;

public abstract class MenuHandler {
    protected MenuHandler next;

    public void setNext(MenuHandler handler) {
        next = handler;
    }

    public abstract void handle(int opcao);

    public static void iniciar() {
        System.out.println("\n*===============================*");
        System.out.println("Escolha um pedido para Aprovar");
        String mensagem = "\nOpção 1: Pedido de Centralizadores\nOpção 2: Pedido de Stop Collars\nOpção 3: Pedido de Float Shoes\nEscolha uma das opções: ";
        int opcao = Integer.parseInt(System.console().readLine(mensagem));
        new PedidoCentralizadorHandler().handle(opcao);
    }
}
