/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio4.model;


/**
 *
 * @author Admin
 */
public class NotificacaoEntrega extends Notificacao {
    private String dataEntrega;
    private String tipoFlor;

    public NotificacaoEntrega(String destinatario, String mensagem, String dataEntrega, String tipoFlor) {
        super(destinatario, mensagem, TpNotificacao.ENTREGA);
        this.dataEntrega = dataEntrega;
        this.tipoFlor = tipoFlor;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(String tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação de ENTREGA para " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
        System.out.println("Flor: " + tipoFlor + " | Data de entrega: " + dataEntrega);
    }

    public void enviar(String flor) {
        setTipoFlor(flor);
        System.out.println("Enviando notificação com flor especificada: " + flor);
        enviar();
    }
}

