package br.edu.etec.atividade.model;

public class AlertaIrrigacao extends Alerta {
    private static final int LIMITE_MENSAGEM = 50;

    public AlertaIrrigacao(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoAlerta.IRRIGACAO);
    }

    @Override
    public void enviar() {
        String mensagemFinal = mensagem.length() > LIMITE_MENSAGEM
            ? mensagem.substring(0, LIMITE_MENSAGEM) + "..."
            : mensagem;

        System.out.println("Enviando Alerta de Irrigação para " + destinatario);
        System.out.println("Mensagem: " + mensagemFinal);
        System.out.println("Canal de rádio rural ativo.\n");
    }
}

