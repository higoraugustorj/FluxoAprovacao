package Handlers;

import Model.Fornecedores.Nacionalidade;
import Model.Pedidos.Pedido;

public class DefinirImpostos extends Handler {
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("----------------------");
        System.out.println("*** Definindo estratégia de cálculo de Impostos ***");
        System.out.println("----------------------");
        System.out.println("Nacionalidade do Pedido: " + pedido.cotacaoSelecionada.fornecedor.nacionalidade);
        if (pedido.cotacaoSelecionada.fornecedor.nacionalidade == Nacionalidade.BRASILEIRA) {
            setNext(new CalcularImpostosBrasil());
            next.validar(pedido);
            return;
        }
        setNext(new CalcularImpostosInternacionais());
        next.validar(pedido);
    }
}