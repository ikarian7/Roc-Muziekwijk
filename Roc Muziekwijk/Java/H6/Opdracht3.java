// Hoofdstuk 6
package H6;
// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht3 van het type Applet.
public class Opdracht3 extends Applet {
	int a, b, uitkomst;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		a = 1124242324;
		b = 1023241324;
		uitkomst = a+b;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("De uitkomst is: " + uitkomst, 20, 20);
	}
}