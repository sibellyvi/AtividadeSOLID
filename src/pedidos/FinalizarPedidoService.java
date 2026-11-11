package pedidos;

import notificacoes.Notificador;

public class FinalizarPedidoService {
    private Notificador notificador;

    public FinalizarPedidoService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void finalizarPedido(PedidoEntity pedido){
        System.out.println("Processando o final do pedido...");
        notificador.enviar("Seu pedido foi confirmado!");
    }
}
