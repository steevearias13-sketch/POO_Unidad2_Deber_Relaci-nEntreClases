/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni1a;

/**
 *
 * @author Steeve
 */
public class Investigador {
    // Agrego los atributos de la clase Investigador
    private String nombre;
    private String especialidad;
    private String nacionalidad;
    
    // Creo el constructor de la clase
    public Investigador(String nombre, String especialidad, String nacionalidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.nacionalidad = nacionalidad;       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
}
