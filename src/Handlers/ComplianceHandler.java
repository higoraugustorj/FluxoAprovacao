package Handlers;

import Model.Cotacoes.Cotacao;
import Model.Pedidos.Pedido;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

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

    private int getFornecedoresValidos(Pedido pedido) {
        int fornecedoresValidos = 0;
        for (Cotacao cotacao : pedido.cotacoes) {
            if (cotacao.fornecedor.compraPermitida) {
                fornecedoresValidos ++;
            }
        }
        return fornecedoresValidos;
    }
}
