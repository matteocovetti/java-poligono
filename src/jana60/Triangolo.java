package jana60;

public class Triangolo implements Poligono {

	private double base, altezza, cateto;

	public Triangolo(double base, double altezza, double cateto) throws IllegalArgumentException {
		super();

		validaDimensioni(base);
		validaDimensioni(altezza);
		validaDimensioni(cateto);

		this.base = base;
		this.altezza = altezza;
		this.cateto = cateto;
	}

	// getter e setter
	public double getBase() {
		return base;
	}

	public void setBase(double base) throws IllegalArgumentException {
		validaDimensioni(base);
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) throws IllegalArgumentException {
		validaDimensioni(altezza);
		this.altezza = altezza;
	}

	public double getCateto() {
		return cateto;
	}

	public void setCateto(double cateto) throws IllegalArgumentException {
		validaDimensioni(cateto);
		this.cateto = cateto;
	}

	// metodi
	@Override
	public double calcolaPerimetro() {
		return base + (cateto * 2);
	}

	@Override
	public double calcolaArea() {
		return (base * altezza) / 2;
	}

	// controlli
	private void validaDimensioni(double dimensione) throws IllegalArgumentException {
		if (dimensione <= 0) {
			throw new IllegalArgumentException(
					"Le dimensioni di altezza, base e cateti non possono essere uguali o minori di zero");
		}
	}
}
