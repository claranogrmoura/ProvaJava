/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio6.model;

/**
 *
 * @author Admin
 */
public class Animal {
    private String nome; 
    private int idade; 
    private Habitat habitat; 
    
    
    public Animal(String nome, int idade, Habitat habitat){
    this.nome = nome;
    this.idade = idade; 
    this.habitat = habitat;
    }
    
    public void emitirSom(){
        System.out.println("O ANIMAL EMITE SOM");
    }
    
    public void Info() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habitat: " + habitat);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the habitat
     */
    public Habitat getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
    
}
