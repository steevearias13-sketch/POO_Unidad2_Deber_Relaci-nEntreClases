/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual

import java.util.ArrayList;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigador;
    
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.investigador = new ArrayList<>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    // Metodo para agregar el Investigador en cada documental
    public void agregarInvestigador(Investigador nuevoInvestigador){
        this.investigador.add(nuevoInvestigador);    
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);

        System.out.println("Investigador");
        for(Investigador investigador : this.investigador){
            System.out.println("Nombre: " + investigador.getNombre());
            System.out.println("Espcialidad: " + investigador.getEspecialidad());
            System.out.println("Nacionalidad: " + investigador.getNacionalidad());            
        }
        System.out.println();
    }
}