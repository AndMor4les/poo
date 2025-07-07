package uni1a;
// relacionada con SerieDeTv
public class Temporada {
	private int numero;
	private SerieDeTV serie;
	
	public Temporada(int numero, SerieDeTV serie) {
		this.numero = numero;
		this.setSerie(serie);
	}
	
	public int getTemporada() {
		return numero;
	}	

    public void setTemporada(int numero) {
        this.numero = numero;
    }

	public SerieDeTV getSerie() {
		return serie;
	}

	public void setSerie(SerieDeTV serie) {
		this.serie = serie;
	}
}
