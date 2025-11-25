import Handlers.Handler;
import Handlers.MostrarDadosHandler;
import Model.Pedidos.Pedido;
import Model.Pedidos.PedidosMock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pedido pedidoCentralizadores = PedidosMock.getPedidoCentralizadores();
        Pedido pedidoStopCollars = PedidosMock.getPedidoStopCollars();
        Pedido pedidoFloatShoes = PedidosMock.getPedidoFloatShoes();

        Handler inicio = new MostrarDadosHandler();

        inicio.validar(pedidoFloatShoes);
    }
}