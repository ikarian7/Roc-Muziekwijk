// Hoofdstuk 12
package H12;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht1 van het type Applet.
public class Opdracht3 extends Applet {
	int tekstvakken[], getal;
	TextField tekstvak;
	Button knopOk;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(400, 400);
		tekstvakken = new int[5];
		knopOk = new Button("Ok");
		knopOk.addActionListener( new knopOkListener() );
		add(knopOk);
		for (int teller = 0; teller < tekstvakken.length; teller ++) {
			tekstvak = new TextField("");
			tekstvak.addActionListener( new tekstvakListener() );
			add(tekstvak);
		}
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		for (int teller = 0; teller < tekstvakken.length; teller ++) {
			g.drawString("" + tekstvakken[teller], 50, 20 * teller + 20);
		}
	}

	class tekstvakListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal = Integer.parseInt(tekstvak.getText());
			tekstvak.setText("");
			repaint();
		}
	}

	class knopOkListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal = Integer.parseInt(tekstvak.getText());	
			repaint();
		}
	}
}