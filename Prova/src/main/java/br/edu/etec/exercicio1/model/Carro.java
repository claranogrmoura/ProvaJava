/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.model;

/**
 *
 * @author Admin
 */
public class Carro extends Veiculo{
    public int numPortas; 
    
    
    public Carro(String modelo, String cor, int velocidade, int numPortas){
            super(modelo, cor, velocidade);
            this.numPortas = numPortas;
    }

    
    
    @Override
    public void info(){
        super.info();
        System.out.println("NMERO DE PORTAS: " +    numPortas);}
}
