// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Toets van het type Applet.
public class Toets extends Applet {
	TextField tekstvak;
	int London, NewYork, Tokyo, Sydney, cijfer, geklikt;
	Label label;
	Button knop;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 500);
		label = new Label("Voer een uur in");
		add (label);
		knop = new Button("Toon tijden");
		knop.addActionListener( new knop1Listener() );
		add(knop);
		tekstvak = new TextField("", 20);
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		if (geklikt == 1) {
			g.drawString("Tijd in London: " +London +":00", 50, 60 );
			g.drawString("Tijd in New York: " +NewYork +":00", 50, 80 );
			g.drawString("Tijd in Tokyo: " +Tokyo +":00", 50, 100 );
			g.drawString("Tijd in Sydney: " +Sydney +":00", 50, 120 );
		}
	}

	class knop1Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			cijfer = Integer.parseInt(tekstvak.getText());
			if(cijfer <= 24 && cijfer >= 0){
				London = cijfer - 1;
				NewYork = cijfer - 6;
				Tokyo = cijfer + 7;
				Sydney = cijfer + 9;
				if (London < 0){
					London += 24;
				}
				if (NewYork < 0){
					NewYork += 24;
				}
				if (Tokyo >= 24){
					Tokyo -= 24;
				}
				if (Sydney >= 24){
					Sydney -= 24;
				}
			}
			tekstvak.setText("");
			geklikt = 1;
			repaint();
		}
	}
}