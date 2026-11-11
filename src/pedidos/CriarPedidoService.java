package pedidos;

public class CriarPedidoService {
    public PedidoEntity criar(String numeroPedido, double valor) {
        System.out.println("Criando novo pedido...");
        return new PedidoEntity(numeroPedido, valor);
    }
}
