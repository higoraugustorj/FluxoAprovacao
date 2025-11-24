package Handlers;

import Model.Pedidos.Pedido;

public class ComplianceHandler extends Handler {
    String regra = "<Compliance> Pedido deve conter no mínimo três cotações de Fornecedores aprovados";

    public ComplianceHandler() {
        setNext(new TiHandler());
    }

    @Override
    public void validar(Pedido pedido) {
        sleep(2);
        if (pedido.cotacoesValidas >= 3) {
            System.out.println("\uD83C\uDD97 APROVADO: " + regra);
            next.validar(pedido);
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: " + regra);
    }
}
