// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht1 van het type Applet.
public class Opdracht1 extends Applet {
	TextField tekstvak;
	Button knop;
	int hoogstegetal;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 300);
		tekstvak = new TextField("", 30);
		add(tekstvak);
		knop = new Button("Ok");
		knop.addActionListener( new knopListener() );
		add(knop);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		g.drawString("Hoogste Getal: " + hoogstegetal, 50, 60 );
	}

	class knopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak.getText();
			int Getal = Integer.parseInt(TekstvakGetal);
			if ( Getal > hoogstegetal ) {
				hoogstegetal = Getal;
			}
			repaint();
		}
	}
}