package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Benvenuto a PoligoLand!");

		try {
			System.out.print("Inserisci dimensioni lato del quadrato: ");
			double latoQuadrato = scan.nextDouble();
			Poligono quadrato = new Quadrato(latoQuadrato);

			System.out.println("Il perimetro del quadrato è: " + quadrato.calcolaPerimetro());
			System.out.println("L'area del quadrato è: " + quadrato.calcolaArea());

			System.out.print("Inserisci base triangolo: ");
			double baseTriangolo = scan.nextDouble();
			System.out.print("Inserisci altezza triangolo: ");
			double altezzaTriangolo = scan.nextDouble();
			System.out.print("Inserisci cateto triangolo: ");
			double catetoTriangolo = scan.nextDouble();
			Poligono triangolo = new Triangolo(baseTriangolo, altezzaTriangolo, catetoTriangolo);

			System.out.println("Il perimetro del triangolo è: " + triangolo.calcolaPerimetro());
			System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
		} catch (IllegalArgumentException e) {
			System.out.println("Errore nella creazione del poligono " + e.getMessage());
		}

		scan.close();
	}

}
