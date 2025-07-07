package uni1a;

public class Cortometraje extends ContenidoAudiovisual {

	private String tema; // artísticos, experimentales o promocionales
	public Cortometraje(String titulo, int duracionEnMinutos, String genero, String tema) {
		super(titulo, duracionEnMinutos, genero);
		this.tema = tema;
	}
	
	 public String getTema() {
	        return tema;
	    }

	    public void setTema(String tema) {
	        this.tema = tema;
	    }
	
	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);       
        System.out.println();
		
	}

}
