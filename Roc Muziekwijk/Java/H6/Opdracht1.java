// Hoofdstuk 6
package H6;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
public class Opdracht1 extends Applet {
	double a, b, uitkomst;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		a = 113;
		b = 4;
		uitkomst = a / b;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("Jan krijgt: " + uitkomst, 20, 20);
		g.drawString("Ali krijgt: " + uitkomst, 20, 40);
		g.drawString("Jeannette krijgt: " + uitkomst, 20, 60);
		g.drawString("Thom krijgt: " + uitkomst, 20, 80);
	}
}