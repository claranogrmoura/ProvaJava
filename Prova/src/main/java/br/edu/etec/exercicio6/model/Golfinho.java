/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio6.model;

/**
 *
 * @author Admin
 */
public class Golfinho extends Animal {
    public Golfinho(String nome, int idade) {
        super(nome, idade, Habitat.AQUATICO);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("O Golfinho faz: *o som que o golfinho faz*!");
    }
    
    
}
