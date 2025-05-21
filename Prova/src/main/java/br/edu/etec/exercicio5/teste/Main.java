/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio5.teste;

import br.edu.etec.exercicio5.model.Chocolate;
import br.edu.etec.exercicio5.model.chocAmargo;
import br.edu.etec.exercicio5.model.chocLeite;


/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Chocolate[] chocolates = new Chocolate[4];
        
        chocolates[0] = new chocLeite("Delícia ao Leite", 45, 100.0, "Integral");
        chocolates[1] = new chocAmargo("Forte Amargo", 85, 90.0, 9);
        chocolates[2] = new chocLeite("Leite Encantado", 40, 120.0, "Integral");
        chocolates[3] = new chocAmargo("Intensidade 100", 100, 80.0, 10);
    
        
         System.out.println("=== CHOCOLATES ARTESANAIS ===");
        for (int i = 0; i < chocolates.length; i++) {
            chocolates[i].Info();
            System.out.println("----------------------------");
        }
        
        System.out.println("=== EXIBIÇÃO DETALHADA ===");
        if (chocolates[0] instanceof chocLeite) {
            ((chocLeite) chocolates[0]).exibirInformacoes(true);
        }
}
    
    
}
