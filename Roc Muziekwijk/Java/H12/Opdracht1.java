// Hoofdstuk 12
package H12;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;

// Een klasse met de naam Opdracht1 van het type Applet.
public class Opdracht1 extends Applet {
	double salaris[];

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 400);
		salaris = new double[5];
        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
	}
}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		 for (int teller = 0; teller < salaris.length; teller ++) {
	            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
		 } 
	}
}