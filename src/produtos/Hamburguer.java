package produtos;

public class Hamburguer extends Produto{
    private String pontoDaCarne;

    public Hamburguer(String nome, double preco, String descricao, String pontoDaCarne) {
        super(nome, preco, descricao);
        this.pontoDaCarne = pontoDaCarne;
    }

    @Override
    public void preparar() {
        System.out.println("Grelhando a carne do hambúrguer...");
    }
}
