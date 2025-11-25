package Handlers;

import Model.Fornecedores.Nacionalidade;
import Model.Pedidos.Pedido;

public class DefinirImpostos extends Handler {
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("--> Etapa: << Definir estratégia de Impostos >>");
        sleep();
        System.out.println("? Condição: Pedidos de Fornecedores Internacionais devem ser acrescidos de impostos alfandegários");
        sleep();
        System.out.println("! Status: Nacionalidade do Pedido é " + pedido.cotacaoSelecionada.fornecedor.nacionalidade + "\n");
        if (pedido.cotacaoSelecionada.fornecedor.nacionalidade == Nacionalidade.BRASILEIRA) {
            setNext(new CalcularImpostosBrasil());
            next.validar(pedido);
            return;
        }
        setNext(new CalcularImpostosInternacionais());
        next.validar(pedido);
    }
}