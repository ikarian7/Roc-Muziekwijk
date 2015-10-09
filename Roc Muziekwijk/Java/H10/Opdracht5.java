// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht5 van het type Applet.
public class Opdracht5 extends Applet {
	TextField tekstvak;
	String sBeoordeling, sGemiddelde;
	Button knop;
	double getal, cijfer, gemiddelde;
	int teller;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		sBeoordeling = "";
		sGemiddelde = "";
		setSize(600, 500);
		knop = new Button("Ok");
		knop.addActionListener( new knop1Listener() );
		add(knop);
		tekstvak = new TextField("", 20);
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString(sBeoordeling, 50, 60 );
		g.drawString(sGemiddelde, 50, 80 );

	}

	class knop1Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			cijfer = Double.parseDouble(tekstvak.getText());
			if (cijfer >= 1 && cijfer <= 10){
				teller++;
				getal =  cijfer + getal;
				gemiddelde = getal / teller;
				tekstvak.setText("");
				if (gemiddelde > 5.5){
					sGemiddelde = gemiddelde + " Je bent geslaagd!";
				}
				if (gemiddelde < 5.5){
					sGemiddelde = gemiddelde + " Je bent gezakt.";
				}
				if (cijfer > 5.5){
					sBeoordeling = cijfer + " Voldoende";
				}
				if (cijfer < 5.5){
					sBeoordeling = cijfer + " Onvoldoende";
				}
				if (cijfer > 10){
					cijfer = 10;
				}
			} else { 
				sBeoordeling = "Foute invoer";        		
			}
			repaint();
		}
	}
}