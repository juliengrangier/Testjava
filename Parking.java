import java.util.Arrays;


public class Parking {


	public static class IndexOutOfRangeException extends Exception {

		public IndexOutOfRangeException() {

		}

	}

	public static class IllegalStateException extends Exception {

		public IllegalStateException() {

		}

	}
	
	public static class InvalidOperationException extends Exception {

		public InvalidOperationException() {

		}

	}
	
	public class Voiture {
		public int immatriculation;

		public Voiture(int immatriculation) {
			super();
			this.immatriculation = immatriculation;
		}
		// Ici le constructeur par défaut sans argument crée une voiture 
		// immatriculée 0 qui est vide.
		public Voiture (){
			super();
			this.immatriculation = 0;
		}
		
		public String toString() {
			if (immatriculation == 0) {
				return "Place vide";
			}
			return "Voiture [immatriculation=" + immatriculation + "]";
		}
	}



	private int nombre_places;
	
	private Voiture[] voiture_tab;
	
	public Parking(int nombre_places) {
		super();
		this.nombre_places = nombre_places;
		this.voiture_tab = new Voiture[nombre_places];
	}

	public void park (Voiture v, int n) throws IndexOutOfRangeException, IllegalStateException {
		if (n>=nombre_places) {
			throw new IndexOutOfRangeException();
		}
		if (voiture_tab[n].immatriculation != 0) {
			throw new IllegalStateException();
		}
		voiture_tab[n] = v;
	}
	
	public Voiture unpark (int n) throws IndexOutOfRangeException, InvalidOperationException {
		if (n>=nombre_places) {
			throw new IndexOutOfRangeException();
		}
		Voiture res = voiture_tab [n];
		if (res.immatriculation == 0) {
			throw new InvalidOperationException(); 
		}
		voiture_tab [n] = new Voiture();
		return res;
	}
	
	public String toString() {
		String res = new String();
		res = "Parking : ";
		for (int i = 0; i<nombre_places; i++) {
			res = res+ "[" + i + "->" + voiture_tab[i].toString() + "]";
		}
		return res;
	}

	public static void main(String[] args) {
		

	}

}
