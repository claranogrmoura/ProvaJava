/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio3.model;

/**
 *
 * @author Admin
 */
public class AlertaIrrigacao  extends Alerta {
    private static final int LIMITE_CARACTERES = 50;

    public AlertaIrrigacao(String destinatario, String mensagem) {
        super(destinatario, mensagem, tipoAlerta.IRRIGACAO);
    }

    @Override
    public void enviar() {
        String mensagemEnviada = mensagem.length() > LIMITE_CARACTERES 
            ? mensagem.substring(0, LIMITE_CARACTERES) + "..." 
            : mensagem;

        System.out.println("Enviando Alerta de Irrigação:");
        System.out.println("Destinatário: " + destinatario);
        System.out.println("Mensagem (via rádio): " + mensagemEnviada);
    }
}

