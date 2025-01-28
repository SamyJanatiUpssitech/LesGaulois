package test_fonctionnel;

import personnages.Gaulois;
import sites.Camp;
import sites.Village;
import personnages.Romain;
import personnages.Soldat;

public class TestSites {
	Gaulois vercingetorix = new Gaulois("Vincingetorix",5);
	Village toulouse = new Village(vercingetorix);
	Soldat minus = new Soldat("Minus", 2, "SOLDAT");
	Camp rome = new Camp(minus);
}
