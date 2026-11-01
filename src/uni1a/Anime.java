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
public class Anime extends ContenidoAudiovisual{
    private String clasificacion;
    private int añoEstreno;
    private ArrayList<Personaje> personaje;
    
    public Anime(String titulo, int duracionEnMinutos, String genero, String clasificacion, int añoEstreno){
        super(titulo, duracionEnMinutos, genero);
        this.clasificacion = clasificacion;
        this.añoEstreno = añoEstreno;
        this.personaje = new ArrayList<>();
    }
    
    public void agregarPersonaje(Personaje nuevoPersonaje){
        this.personaje.add(nuevoPersonaje);
    }
    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public void setAñoEstreno(int añoEstreno) {
        this.añoEstreno = añoEstreno;
    }
    
    @Override
    public void mostrarDetalles(){
        System.out.println("Detalles del Anime:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Clasificacion: " + this.clasificacion + " Apto para adolescentes de 12 o 15 años en adelante");
        System.out.println("Año de estreno: " + this.añoEstreno);
       
        System.out.println("Personaje");
        for(Personaje personaje : this.personaje){
            System.out.println("Nombre: " + personaje.getNombre());
            System.out.println("Poder: " + personaje.getPoder());
        }
        System.out.println();
    }
}
