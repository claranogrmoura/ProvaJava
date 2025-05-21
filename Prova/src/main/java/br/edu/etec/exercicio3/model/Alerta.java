/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio3.model;

/**
 *
 * @author Admin
 */
public abstract class Alerta {
    protected String destinatario;
    protected String mensagem;
    protected tipoAlerta tipo;

    public Alerta(String destinatario, String mensagem, tipoAlerta tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public void preparar() {
        System.out.println("Preparando alerta para: " + destinatario);
    }

    public abstract void enviar();
}
