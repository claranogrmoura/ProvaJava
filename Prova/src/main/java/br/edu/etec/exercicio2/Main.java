/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio2;

import br.edu.etec.exercicio2.model.Comum;
import br.edu.etec.exercicio2.model.Influenciador;

/**
 *
 * @author Admin
 */
public class Main {
  
    public static void main(String[] args) {
        Comum usuario1 = new Comum("Lucas", "lucas@email.com", "Amante de tecnologia.");
        Influenciador influenciador1 = new Influenciador("Maria", "maria@email.com", 12);

        System.out.println("-------------- GOSSIP DA ETEC --------------");
        usuario1.seguir(influenciador1);
        influenciador1.seguir(usuario1);

        usuario1.postar("Boa tarde, galera!");
        influenciador1.postarPublicidade("Nike");

        usuario1.curtirPost();

        System.out.println("--- PERFIS ---");
        usuario1.exibirPerfil();
        System.out.println();
        influenciador1.exibirPerfil();
    }
}


