package personnages;

public abstract class Personnage {
	
	protected String nom;
	protected int force;
	
	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	protected abstract String donnerAuteur();
	
	public void parler(String paroles) {
		System.out.println( "Le " + donnerAuteur() + nom + " : « " + paroles + ".»");
	}





}
