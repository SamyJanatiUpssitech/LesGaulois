package personnages;

public class Romain {

	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getnom() {
		return nom;
	}
	
	public void parler(String paroles) {
		System.out.println("Le romain " + nom + " : « " + paroles + ".»");
	}
	
	public void recevoirCoup(int puissance) {
		this.force = this.force - puissance;
		
		if (this.force<=0) {
			
			this.force = 0 ;
			this.parler("J'abandonne");
		}
		else this.parler("Ayayay");
		
	}
}
