/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio1.teste;

import br.edu.etec.exercicio1.model.Carro;
import br.edu.etec.exercicio1.model.Veiculo;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
   Veiculo veiculo1 = new Veiculo("Polo", "preto", 50);
    Carro carro1 = new Carro ("Spin", "Vermelha", 100, 7);
    
        System.out.println("----------LOJA DE CARROS---------");
        System.out.println("------------- CARROS EM PROMOÇÃO---------------");
    veiculo1.acelerar(200);
    veiculo1.frear(50);
    veiculo1.info();
   
        System.out.println("------------------------- CARROS DESTAQUE --------------------");
    
    carro1.acelerar(300);
    carro1.frear(150);
    carro1.info();
}
}
