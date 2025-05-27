package br.edu.etec.atividade.model;

public abstract class Alerta {
    protected String destinatario;
    protected String mensagem;
    protected TipoAlerta tipo;

    public Alerta(String destinatario, String mensagem, TipoAlerta tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public void preparar() {
        System.out.println("Preparando envio para: " + destinatario);
    }

    public abstract void enviar();
}
