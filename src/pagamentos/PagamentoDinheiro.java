package pagamentos;

public class PagamentoDinheiro implements Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em Dinheiro.");
    }
}
