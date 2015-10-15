// Hoofdstuk 11
package H11;

//Importeer de benodigde klassen uit de Java bibliotheek.
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Een klasse met de naam Opdracht5 van het type Applet.
public class Praktijkopdracht extends Applet{
	Button ok;
	TextField tekstvak;
	int konijn1, geklikt;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(500, 500);
		ok = new Button("Ok");
		ok.addActionListener(new OkListener());
		add(ok);
		tekstvak = new TextField("", 25);
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g){
		int y = 50;
		if (geklikt == 1) {
			for (int teller = 1; teller < 11; teller++) {
				g.drawString(teller + " * " + konijn1 + " = " + (teller * konijn1), 50, y);
				y += 20;
			}
		}
	}

	class OkListener implements ActionListener {
		public void actionPerformed(ActionEvent E) {
			geklikt = 1;
			konijn1 = Integer.parseInt(tekstvak.getText());
			tekstvak.setText("");		
			repaint();		
		}
	}
}