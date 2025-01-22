package personnages;

public class Gaulois extends Personnage{

	
	public Gaulois(String nom, int force) {
		super(nom, force);
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



	@Override
	protected String donnerAuteur() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
