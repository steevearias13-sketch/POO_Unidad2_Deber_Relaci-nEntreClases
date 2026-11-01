/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni1a;

/**
 *
 * @author Steeve
 */
public class Temporada {
    // Cree los atributos que tendra la clase Temporada
    private int numeroTemporadas;
    private int cantidadEpisodios;
    
    //Agrego el constructor de la clase
    public Temporada(int numeroTemporadas, int cantidadEpisodios){
        this.numeroTemporadas = numeroTemporadas;
        this.cantidadEpisodios = cantidadEpisodios;        
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }
    
}
