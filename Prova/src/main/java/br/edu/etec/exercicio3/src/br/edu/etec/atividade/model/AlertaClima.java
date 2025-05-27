package br.edu.etec.atividade.model;

public class AlertaClima extends Alerta {

    public AlertaClima(String destinatario, String mensagem) {
        super(destinatario, mensagem, TipoAlerta.CLIMA);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Alerta de Clima para " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Previsão do tempo: Chuvas leves nas próximas 24h.");
        System.out.println("Sugestão: Cobrir áreas sensíveis e adiar pulverizações.\n");
    }
}
