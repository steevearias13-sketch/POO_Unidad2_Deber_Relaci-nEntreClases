/**
 * Class SerieDeTV
 */
package uni1a;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private ArrayList<Temporada> temporada;
    
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.temporada = new ArrayList<>();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public void agregarTemporada(Temporada t){
        this.temporada.add(t);
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la SerieTV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        
        for(Temporada temporada : this.temporada){
            System.out.println("Numero de Temporadas: " + temporada.getNumeroTemporadas());
            System.out.println("Cantidad de episodios: " + temporada.getCantidadEpisodios());
        }
        System.out.println();
    }
}