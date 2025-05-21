/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio6.teste;

import br.edu.etec.exercicio6.model.Arara;
import br.edu.etec.exercicio6.model.Golfinho;
import br.edu.etec.exercicio6.model.Leao;

/**
 *
 * @author Admin
 */
public class Main {
public static void main(String[] args) {

    System.out.println("----------------- ZOOLOGICO DA ETEC--------------");
  
        Leao leao = new Leao("Simba", 5);
        Golfinho golfinho = new Golfinho("Flipper", 8);
        Arara arara = new Arara("Loro", 3);

        System.out.println("=== Leão ===");
        leao.Info();
        leao.emitirSom();

        System.out.println("=== Golfinho ===");
        golfinho.Info();
        golfinho.emitirSom();

        System.out.println("=== Arara ===");
        arara.Info();
        arara.emitirSom();
    }
}
