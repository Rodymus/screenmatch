package com.roberto.screenmatch.calculos;
import com.roberto.screenmatch.modelos.Pelicula;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
