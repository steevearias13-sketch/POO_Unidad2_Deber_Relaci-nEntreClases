/**
 * Class Pelicula
 */
package uni1a;
import java.util.ArrayList;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    // Lista dinámica de objetos de tipo Actor
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        // Inicializar la lista de actores como una lista vacia para evitar errores
        this.actores = new ArrayList<>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    // Creo este metodo para poder administar la listA
    public void agregarActor(Actor nuevoActor) { 
        this.actores.add(nuevoActor);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
       
        // Imprimir los datos de los Actores
        System.out.println("Actores: ");
        for(Actor actor : this.actores){
            System.out.println("Nombre: " + actor.getNombre());
            System.out.println("Nacionalidad: " + actor.getNacionalidad());
            System.out.println("Edad: " + actor.getEdad());
        }
        System.out.println();
    }
}