package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from NetBeans!");
        
        // Pelicula con Actor
        Pelicula pelicula = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        Actor actor1 = new Actor("Sam Worthington", "Australiano", 48);
        pelicula.agregarActor(actor1);
        // SerieDeTV con Temporada
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        Temporada temp1 = new Temporada(5, 25);
        serie.agregarTemporada(temp1);
        //Documental con Investigador
        Documental documental = new Documental("Cosmos", 45, "Science", "Astronomy");
        Investigador inv1 = new Investigador("Carl Sagan", "Astrofisica", "Estadounidense");
        documental.agregarInvestigador(inv1);
        // Anime con Personaje
        Anime anime = new Anime("Naruto", 16560, "Anime", "B15", 2002);
        Personaje pj1 = new Personaje("Naruto Uzumaki", "Rasengan");
        anime.agregarPersonaje(pj1);
        // Podcast con Locutor
        Podcast podcast = new Podcast("Farid Dieck", 60, "Podcast", "Reflexion de peliculas", 9);
        Locutor loc1 = new Locutor ("Farid Dieck", "Mexicano");
        podcast.agregarLocutor(loc1);
        
        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = pelicula;
        contenidos[1] = serie;
        contenidos[2] = documental;
        contenidos[3] = anime;
        contenidos[4] = podcast;

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}