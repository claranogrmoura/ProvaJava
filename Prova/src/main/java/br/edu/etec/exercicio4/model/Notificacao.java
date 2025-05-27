/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio4.model;

/**
 *
 * @author Admin
 */


public class Notificacao {
    private String destinatario;
    private String mensagem;
    private TpNotificacao tipo;

    public Notificacao(String destinatario, String mensagem, TpNotificacao tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public TpNotificacao getTipo() {
        return tipo;
    }

    public void preparar() {
        System.out.println("Preparando notificação para " + destinatario);
    }

    public void enviar() {
        System.out.println("Enviando notificação: " + mensagem);
    }
}
