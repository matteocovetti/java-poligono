package jana60;

public class Triangolo implements Poligono {

	private double base, altezza, cateto;

	public Triangolo(double base, double altezza, double cateto) {
		super();
		this.base = base;
		this.altezza = altezza;
		this.cateto = cateto;
	}

	// getter e setter
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getCateto() {
		return cateto;
	}

	public void setCateto(double cateto) {
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

}
