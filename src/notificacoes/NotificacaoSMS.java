package notificacoes;

public class NotificacaoSMS implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
