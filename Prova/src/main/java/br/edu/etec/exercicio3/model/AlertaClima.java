/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio3.model;

/**
 *
 * @author Admin
 */
public class AlertaClima extends Alerta {
    private String previsaoTempo;

    public AlertaClima(String destinatario, String mensagem, String previsaoTempo) {
        super(destinatario, mensagem, tipoAlerta.CLIMA);
        this.previsaoTempo = previsaoTempo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Alerta de Clima:");
        System.out.println("Destinatário: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Previsão do Tempo: " + getPrevisaoTempo());
        System.out.println("Sugestão: Verificar coberturas ou adiar atividades ao ar livre.");
    }

    /**
     * @return the previsaoTempo
     */
    public String getPrevisaoTempo() {
        return previsaoTempo;
    }

    /**
     * @param previsaoTempo the previsaoTempo to set
     */
    public void setPrevisaoTempo(String previsaoTempo) {
        this.previsaoTempo = previsaoTempo;
    }
}

