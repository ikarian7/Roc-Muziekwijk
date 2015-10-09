// Hoofdstuk 6
package H6;
// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht2 van het type Applet.
public class Opdracht2 extends Applet {
	int a, b, c, uur, dag, jaar;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 300);
		a = 60;
		b = 24;
		c = 365;
		uur = a * a;
		dag = uur * b;
		jaar = dag * c;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("Aantal seconde in een uur: " + uur, 20, 20);
		g.drawString("Aantal seconde in een dag: " + dag, 20, 40);
		g.drawString("Aantal seconde in een jaar: " + jaar, 20, 60);
	}
}