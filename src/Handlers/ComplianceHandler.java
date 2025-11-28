package Handlers;

import Model.Pedidos.Pedido;

public class ComplianceHandler extends Handler {
    @Override
    public void validar(Pedido pedido) {
        sleep();
        System.out.println("****************************************************");
        System.out.println("--> Etapa: << Validação Compliance >>");
        System.out.println("? Regra: Pedido deve conter no mínimo três cotações de Fornecedores aprovados");
        sleep();
        if (pedido.cotacoesValidas >= 3) {
            System.out.println("! Status: \uD83C\uDD97 APROVADO: O pedido possui " + pedido.cotacoesValidas + " cotações de Fornecedores aprovados.\n");
            setNext(new TiHandler());
            next.validar(pedido);
            return;
        }
        System.out.println("! Status: \uD83D\uDDD9 REPROVADO: O pedido possui menos de três cotações de Fornecedores aprovados.\n");
        rejeitarPedido(pedido);
    }
}
