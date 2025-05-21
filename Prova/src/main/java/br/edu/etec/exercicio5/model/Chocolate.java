/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio5.model;

/**
 *
 * @author Admin
 */
public class Chocolate {
    private String nome; 
    private int pCacau; 
    private double peso; 
    
    
    public Chocolate(String nome, int pCacau, double peso){
    this.nome = nome; 
    this.pCacau = pCacau; 
    this.peso = peso; 
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
     * @return the pCacau
     */
    public int getpCacau() {
        return pCacau;
    }

    /**
     * @param pCacau the pCacau to set
     */
    public void setpCacau(int pCacau) {
        this.pCacau = pCacau;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    
   
public void Info(){
    System.out.println("NOME: " + nome );
    System.out.println("PORCENTAGEM DO CACAU: " + pCacau);
    System.out.println("PESO;   " + peso  + "g");}    
}
