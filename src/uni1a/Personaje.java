/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni1a;

/**
 *
 * @author Steeve
 */
public class Personaje {
    // Agrego los atributos de Personaje
    private String nombre;
    private String poder;
    
    // Creo el constructor a la clase
    public Personaje(String nombre, String poder){
        this.nombre = nombre;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
    
}
