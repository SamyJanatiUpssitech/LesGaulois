package sites;

import personnages.Soldat;

public class Camp {
	
	private Soldat commandant;
	
	private int nbSoldatCamp=0;
	private int nbSoldatMax;
	private Soldat[] soldats = new Soldat[80];
	
	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	
	public boolean ajouterSoldat(Soldat soldatAjoute ) {
		
	}
	
}
