package notificacoes;

public class NotificacaoEmail implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}
