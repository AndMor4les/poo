package uni1a;

import java.util.ArrayList;
import java.util.List;

// relacionada con Pelicula

public class Actor {
	private String nombre;
	private List<Pelicula> peliculas;
	
	
	public Actor (String nombre){
		this.nombre=nombre;
		this.peliculas = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		peliculas.add(pelicula);
	}
	
}
