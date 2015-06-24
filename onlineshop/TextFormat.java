package onlineshop;
import java.util.ArrayList;


public class TextFormat implements FormatStrategie {

	public void ausgeben(ArrayList<Artikel> artikelListe) {
		for (Artikel artikel : artikelListe) {
			System.out.println(artikel.getBezeichnung() + "\t\t" + artikel.getPreis());
		}
	}

}
