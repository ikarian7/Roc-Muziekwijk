// Hoofdstuk 4
package H4;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht5 van het type Applet.
public class Opdracht5 extends Applet {

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.fillArc(20, 20, 100, 50, 90, 360);
		setBackground(Color.blue);
	}
}