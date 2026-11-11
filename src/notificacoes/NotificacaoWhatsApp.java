package notificacoes;

public class NotificacaoWhatsApp implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
