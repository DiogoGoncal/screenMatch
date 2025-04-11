package com.screenmatch.calculos;
import com.screenmatch.modelo.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui (Titulo titulo){
        tempoTotal +=titulo.getDuracaoMinutos();
    }
}
