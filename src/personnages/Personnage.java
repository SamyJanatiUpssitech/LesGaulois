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

	public void frapper(Personnage personnage) {
		int nvlforce = this.force /3;
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + personnage.getNom()  );
		personnage.recevoirCoup(nvlforce);
	}

	public void recevoirCoup(int puissance) {
		this.force = this.force - puissance;
		
		if (this.force<=0) {
			
			this.force = 0 ;
			this.parler("J'abandonne");
		}
		else this.parler("Aïe");
		
	}

}
