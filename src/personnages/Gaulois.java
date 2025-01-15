package personnages;

public class Gaulois {

	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getnom() {
		return nom;
	}
	
	public void parler(String paroles) {
		System.out.println("Le gaulois " + nom + " : « " + paroles + ".»");
	}
	
	public void frapper(Romain romain) {
		int nvlforce = this.force /3;
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getnom()  );
		romain.recevoirCoup(nvlforce);
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println("Nom du Gaulois : " + asterix.getnom()); 
		
	}
	
}
