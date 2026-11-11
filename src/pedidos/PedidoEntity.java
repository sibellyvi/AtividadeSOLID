package pedidos;

public class PedidoEntity {
    private String numeroPedido;
    private double valor;

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PedidoEntity(String numeroPedido, double valor) {
        this.numeroPedido = numeroPedido;
        this.valor = valor;
    }
}
