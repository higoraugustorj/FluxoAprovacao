package Handlers.MenuHandlers;

public class PedidoInvalidoHandler extends MenuHandler {
    @Override
    public void handle(int opcao) {
        System.out.println("! *** Opção inválida ***");
        MenuHandler.iniciar();
    }
}
