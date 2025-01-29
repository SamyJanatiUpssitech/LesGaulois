package test_fonctionnel;

import personnages.Gaulois;
import sites.Camp;
import sites.Village;
import personnages.Romain;
import personnages.Soldat;

public class TestSites {
	public static void main(String[] args) {
		
		Gaulois vercingetorix = new Gaulois("Vincingetorix", 5);
		Village toulouse = new Village(vercingetorix);
		
		Soldat minus = new Soldat("Minus", 2, "SOLDAT");
		Camp rome = new Camp(minus);
		
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village ");
		minus.parler("Je suis en charge de créer un nouveau camp romain.");

	}

}