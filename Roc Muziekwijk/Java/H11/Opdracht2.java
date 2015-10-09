// Hoofdstuk 11
package H11;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht2 van het type Applet.
public class Opdracht2 extends Applet {

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(300, 100);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		int teller, lengte = 0, breedte = 0;
		for(teller = 20; teller >= 10; teller--) {
			lengte += 20;
			breedte += 20;
			g.drawString("" + teller, lengte , 60);
		} 
	}
}