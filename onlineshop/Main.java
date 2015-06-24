package onlineshop;

public class Main {

	public static void main(String[] args) {
		
		Rechnung r = new Rechnung();
		r.add(new Artikel("Festplatte", 89.99));
		r.add(new Artikel("USB-Stick", 19.99));
		r.add(new Artikel("Mauspad", 3.33));

		System.out.println("Textausgabe:");
		r.setFormatStrategie(new TextFormat());
		r.drucken();
		
		System.out.println("\nHTML-Ausgabe");
		r.setFormatStrategie(new HTMLFormat());
		r.drucken();
		
	}

}
