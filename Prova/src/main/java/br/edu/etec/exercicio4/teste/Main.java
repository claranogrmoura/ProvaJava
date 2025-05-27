/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio4.teste;

import br.edu.etec.exercicio4.model.Notificacao;
import br.edu.etec.exercicio4.model.NotificacaoCuidados;
import br.edu.etec.exercicio4.model.NotificacaoEntrega;
import br.edu.etec.exercicio4.model.TpNotificacao;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        // Notificação genérica
        Notificacao notificacao = new Notificacao("Maria", "Aproveite nossa promoção especial!", TpNotificacao.PROMOCAO);
        notificacao.preparar();
        notificacao.enviar();

        System.out.println("-----------------------------");

        // Notificação de entrega
        NotificacaoEntrega entrega = new NotificacaoEntrega("João", "Sua encomenda será entregue amanhã!", "28/05/2025", "Rosas Vermelhas");
        entrega.preparar();
        entrega.enviar();
        entrega.enviar("Girassóis");

        System.out.println("-----------------------------");

        // Notificação de cuidados
        String mensagemCuidados = "Regue as flores diariamente, mantenha em local arejado e longe da luz solar direta por mais de 2 horas.";
        NotificacaoCuidados cuidados = new NotificacaoCuidados("Carla", mensagemCuidados);
        cuidados.preparar();
        cuidados.enviar();
        System.out.println("Resumo rápido: " + cuidados.resumoRapido());
    }
}

