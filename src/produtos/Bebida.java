package produtos;

public class Bebida extends Produto{
    private boolean comGelo;

    public Bebida(String nome, double preco, String descricao, boolean comGelo) {
        super(nome, preco, descricao);
        this.comGelo = comGelo;
    }

    @Override
    public void preparar() {
        System.out.println("Servindo a bebida no copo com gelo...");
    }
}
