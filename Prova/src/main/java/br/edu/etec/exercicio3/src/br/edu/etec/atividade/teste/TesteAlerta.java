package br.edu.etec.atividade.teste;

import br.edu.etec.atividade.model.*;

public class TesteAlerta {
    public static void main(String[] args) {
        Alerta[] alertas = new Alerta[] {
            new AlertaClima("João", "Frente fria se aproximando."),
            new AlertaIrrigacao("Maria", "Sistema de irrigação do setor 3 com excesso de umidade, verificar válvula principal."),
            new AlertaClima("Carlos", "Calor intenso previsto para amanhã."),
            new AlertaIrrigacao("Ana", "Verificar pressão da bomba 2.")
        };

        for (Alerta alerta : alertas) {
            alerta.preparar();
            alerta.enviar();
        }
    }
}
