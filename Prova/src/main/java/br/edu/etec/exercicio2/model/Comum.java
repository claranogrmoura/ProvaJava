/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio2.model;

/**
 *
 * @author Admin
 */
public class Comum extends Usuario  {
    private String biografia;

    public Comum(String nome, String email, String biografia) {
        super(nome, email);
        this.biografia = biografia;
    }

    public void curtirPost() {
        System.out.println(getNome() + " curtiu uma publicação.");
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
        System.out.println("Biografia: " + biografia);
    }
}
   

