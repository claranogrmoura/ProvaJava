/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio6.model;

/**
 *
 * @author Admin
 */
public class Arara extends Animal{
    public Arara(String nome, int idade) {
        super(nome, idade, Habitat.AEREO);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("A Arara grita:  ARARA!");
    }
    
}
