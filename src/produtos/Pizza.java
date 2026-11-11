package produtos;

public class Pizza extends Produto{
    private String tamanho;
    private boolean bordaRecheada;

    public Pizza(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.bordaRecheada = bordaRecheada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    @Override
    public void preparar() {
        System.out.println("Assando a pizza no forno a lenha...");
    }
}