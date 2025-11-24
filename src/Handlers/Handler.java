package Handlers;

import Model.Pedidos.Pedido;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public abstract class Handler {
    public Handler next;


    public void setNext(Handler handler) {
        next = handler;
    }

    public abstract void validar(Pedido pedido);

    protected void sleep(int segundos) {
        LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(segundos));
    }
}
