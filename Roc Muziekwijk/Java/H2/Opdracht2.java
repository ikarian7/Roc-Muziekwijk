// Hoofdstuk 2
package H2;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht2 van het type Applet.
public class Opdracht2 extends Applet {

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("Thom", 50, 60 );
		g.setColor(Color.red);
		g.drawString("Kok", 50, 80 );
	}
}