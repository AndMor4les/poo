package uni1a;

public class YouTube extends ContenidoAudiovisual{
	private String tema;
	public YouTube(String titulo, int duracionEnMinutos, String genero, String tema) {
		super(titulo, duracionEnMinutos, genero);
		this.tema = tema;
	}

	@Override
	public void mostrarDetalles() {
		System.out.println("Detalles del video:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);       
        System.out.println();
		
	}

}
