// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht2 van het type Applet.
public class Opdracht2 extends Applet {
	TextField tekstvak;
	Button knop;
	int hoogstegetal;
	int laagstegetal;
	int getal;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 300);
		tekstvak = new TextField("", 30);
		add(tekstvak);
		knop = new Button("Ok");
		knop.addActionListener( new knopListener() );
		add(knop);
		laagstegetal = 2147483647;
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		if (getal > 0) {
			g.drawString("Hoogste Getal: " + hoogstegetal, 50, 60 );	
			g.drawString("Laagste Getal: " + laagstegetal, 50, 80 );
		}
	}

	class knopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak.getText();
			getal = Integer.parseInt(TekstvakGetal);

			if ( getal > hoogstegetal ) {
				hoogstegetal = getal;
			}
			if ( getal < laagstegetal) {
				laagstegetal = getal;
			}
			repaint();
		}
	}
}