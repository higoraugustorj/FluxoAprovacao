package Handlers;

import Model.Pedidos.Pedido;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class TiHandler extends Handler {
    String regra = "<TI> Pedidos de equipamentos de TI devem ser realizados pelo Almoxarifado";
    @Override
    public void validar(Pedido pedido) {
        sleep(1);
        if (!pedido.equipamentoTI) {
            System.out.println("\uD83C\uDD97 APROVADO: " + regra);
            return;
        }
        System.out.println("\uD83D\uDDD9 REPROVADO: " + regra);
    }
}
