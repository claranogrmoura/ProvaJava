/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio2.model;

/**
 *
 * @author Admin
 */
public class Usuario {
    private String nome;
    private String email;
    private int seguidores;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.seguidores = 0;
    }

    public void seguir(Usuario outroUsuario) {
        outroUsuario.setSeguidores(outroUsuario.getSeguidores() + 1);
        System.out.println(getNome() + " seguiu " + outroUsuario.getNome());
    }

    public void postar(String conteudo) {
        System.out.println(getNome() + " postou: " + conteudo);
    }

    public void exibirPerfil() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Seguidores: " + getSeguidores());
    }

    // Getters caso precise acessar os atributos fora da classe
    public String getNome() {
        return nome;
    }

    public int getSeguidores() {
        return seguidores;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param seguidores the seguidores to set
     */
    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }
}

    
