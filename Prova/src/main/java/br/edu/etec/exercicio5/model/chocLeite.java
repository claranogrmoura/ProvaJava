/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.exercicio5.model;

/**
 *
 * @author Admin
 */
public class chocLeite extends Chocolate{
private String tpLeite; 

public chocLeite(String nome, int pCacau, double peso, String tpLeite ){
        super(nome, pCacau, peso);
        this.tpLeite = tpLeite; 


}
    
@Override
    public void Info(){
        super.Info();
        System.out.println("TIPO DE LEITE:  " + getTpLeite());
    
    }

    /**
     * @return the tpLeite
     */
    public String getTpLeite() {
        return tpLeite;
    }

    /**
     * @param tpLeite the tpLeite to set
     */
    public void setTpLeite(String tpLeite) {
        this.tpLeite = tpLeite;
    }

 public void exibirInformacoes(boolean detalhado) {
        Info(); 
        if (detalhado) {
            System.out.println("Detalhes adicionais: Chocolate ao leite feito com " + tpLeite +
                    ". Ingredientes selecionados e processo de fabricação artesanal.");
        }
    }
}
