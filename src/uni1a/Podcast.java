/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni1a;

import java.util.ArrayList;

/**
 *
 * @author Steeve
 */
public class Podcast extends ContenidoAudiovisual {
    // Agrego los atributos
    private String tematica;
    private int numeroEpisodios;
    private ArrayList<Locutor> locutor;
    
    // Creo el constructor
    public Podcast(String titulo, int duracionEnMinutos, String genero, String tematica, int numeroEpisodios){
        super(titulo, duracionEnMinutos, genero);
        this.tematica = tematica;
        this.numeroEpisodios = numeroEpisodios;
        this.locutor = new ArrayList<>();
    }
    // Agrego el getter y setter

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }
    
    public void agregarLocutor(Locutor nuevoLocutor){
        this.locutor.add(nuevoLocutor);
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tematica: " + this.tematica);
        System.out.println("Numero de Episodios: " + this.numeroEpisodios);
        System.out.println("Locutor");
        for(Locutor locutor : this.locutor){
            System.out.println("Nombre: " + locutor.getNombre());
            System.out.println("Nacionalidad: " + locutor.getNacionalidad());
        }
        System.out.println("");
    }
    
    
}
