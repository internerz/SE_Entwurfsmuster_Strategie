package onlineshop;
import java.util.ArrayList;


public class HTMLFormat implements FormatStrategie {

	public void ausgeben(ArrayList<Artikel> artikelListe) {
		System.out.println("<table>");
		System.out.println("\t<tr>");
		System.out.println("\t\t<td>Artikel</td>");
		System.out.println("\t\t<td>Preis</td>");
		System.out.println("\t</tr>");
		
		for(Artikel artikel : artikelListe) {
			System.out.println("\t<tr>");
			System.out.println("\t\t<td>" + artikel.getBezeichnung() + "</td>");
			System.out.println("\t\t<td>" + artikel.getPreis() + "</td>");
			System.out.println("\t</tr>");
		}
		
		System.out.println("</table>");
	}

}
