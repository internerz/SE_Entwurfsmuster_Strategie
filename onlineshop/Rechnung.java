package onlineshop;
import java.util.ArrayList;


public class Rechnung {
	
	private FormatStrategie formatStrategie;
	private ArrayList<Artikel> artikelListe;
	
	public Rechnung() {
		this.artikelListe = new ArrayList<Artikel>();
	}
	
	public void add(Artikel artikel) {
		artikelListe.add(artikel);
	}
	
	public void setFormatStrategie(FormatStrategie formatStrategie) {
		this.formatStrategie = formatStrategie;
	}
	
	public void drucken() {
		formatStrategie.ausgeben(artikelListe);
	}

}
