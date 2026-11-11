import pedidos.*;
import pagamentos.*;
import produtos.*;
import notificacoes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA DE DELIVERY ---");

        System.out.println("\nTestando o Liskov Substitution Principle");
        System.out.println("\n[ PREPARANDO PRODUTOS ]");
        Produto minhaPizza = new Pizza("Pizza Marguerita", 45.0, "Massa fina com manjericão");
        minhaPizza.preparar();

        System.out.println("\nTestando o Single Responsibility Principle");
        System.out.println("\n[ CRIANDO PEDIDO ]");
        CriarPedidoService criarService = new CriarPedidoService();
        PedidoEntity novoPedido = criarService.criar("PED-001", 45.0);

        System.out.println("\nTestando o Open/Closed Principle");
        System.out.println("\n[ PROCESSANDO PAGAMENTO ]");
        Pagamento formaPagamento = new PagamentoPix();
        formaPagamento.realizarPagamento(45.0);

        System.out.println("\nTestando Interface Segregation e Dependency Inversion");
        System.out.println("\n[ FINALIZANDO E NOTIFICANDO ]");

        System.out.println("\nInjetando a dependência (Notificador) de fora para dentro:");
        Notificador notificador = new NotificacaoWhatsApp();
        FinalizarPedidoService finalizarService = new FinalizarPedidoService(notificador);

        finalizarService.finalizarPedido(novoPedido);

        System.out.println("\n--- SISTEMA FINALIZADO COM SUCESSO ---");
    }
}