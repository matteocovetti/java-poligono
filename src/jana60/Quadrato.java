package jana60;

public class Quadrato implements Poligono {
	// attributi
	private double lato;

	// costruttore
	public Quadrato(double lato) throws IllegalArgumentException {
		super();
		validaLato(lato);
		this.lato = lato;
	}

	// getter e setter
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) throws IllegalArgumentException {
		validaLato(lato);
		this.lato = lato;
	}

	// metodi
	@Override
	public double calcolaPerimetro() {
		return lato * 4;
	}

	@Override
	public double calcolaArea() {
		return lato * lato;
	}

	// controlli
	private void validaLato(double lato) throws IllegalArgumentException {
		if (lato <= 0) {
			throw new IllegalArgumentException("Il valore del lato non può essere uguale o minore a zero");
		}
	}
}
