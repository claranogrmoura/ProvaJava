/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio2.model;

/**
 *
 * @author Admin
 */
public class Influenciador extends Usuario {
    private int parcerias;

    public Influenciador(String nome, String email, int parcerias) {
        super(nome, email);
        this.parcerias = parcerias;
    }

    public void postarPublicidade(String marca) {
        System.out.println(getNome() + " fez uma publicação patrocinada para a marca: " + marca);
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.println("Parcerias comerciais: " + getParcerias());
    }

    /**
     * @return the parcerias
     */
    public int getParcerias() {
        return parcerias;
    }

    /**
     * @param parcerias the parcerias to set
     */
    public void setParcerias(int parcerias) {
        this.parcerias = parcerias;
    }
}

