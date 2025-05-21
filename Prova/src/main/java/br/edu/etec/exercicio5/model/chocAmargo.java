/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio5.model;

/**
 *
 * @author Admin
 */
public class chocAmargo extends Chocolate {
    private int amargor; 
    
    
    public chocAmargo(String nome, int pCacau, double peso, int amargor){
        super(nome, pCacau, peso);
        this.amargor = amargor;
    }

    /**
     * @return the amargor
     */
    public int getAmargor() {
        return amargor;
    }

    /**
     * @param amargor the amargor to set
     */
    public void setAmargor(int amargor) {
        this.amargor = amargor;
    }
    
    
    @Override
    public void Info(){
        super.Info();
}
}

