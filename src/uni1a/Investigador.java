package uni1a;

import java.util.ArrayList;
import java.util.List;

// relacionada con Documental
public class Investigador {
	private String nombre;
	private List<Documental> documentales;
	
	public Investigador(String nombre) {
		this.setNombre(nombre);
		this.documentales = new ArrayList<>();
	}
	
	public void agregarDocumental(Documental documental) {
		documentales.add(documental);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
