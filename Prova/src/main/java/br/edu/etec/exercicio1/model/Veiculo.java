/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.model;

/**
 *
 * @author Admin
 */
public class Veiculo {
        public String modelo; 
        public String cor;
        public int velocidade;

     public Veiculo(String modelo, String cor, int velocidade){
         this.modelo = modelo;
         this.cor = cor; 
         this.velocidade = velocidade; 
     }   

    

  
        
     public void acelerar(int i){
     velocidade += i;
     }
     public void frear(int decremento){
      velocidade -= decremento;
        if (velocidade < 0){
            velocidade = 0;
}
     }
       
        public void info(){
            System.out.println("MODELO: " + modelo);
            System.out.println("COR: " + cor);
            System.out.println("VELOCIDADE: " + velocidade);}
}
