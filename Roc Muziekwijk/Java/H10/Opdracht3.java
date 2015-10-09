// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht3 van het type Applet.
public class Opdracht3 extends Applet {
	TextField tekstvak;
	Button knop;
	int getal;
	String sDagen;
	String sMaandnaam;
	Label label;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 300);
		label = new Label("Voer het maandgetal in");
		add(label);
		tekstvak = new TextField("", 30);
		add(tekstvak);
		knop = new Button("Ok");
		knop.addActionListener( new knopListener() );
		add(knop);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		if (getal > 0) {
			g.drawString("Maand: " + sMaandnaam, 50, 60 );	
			g.drawString("Aantal dagen: " + sDagen, 50, 80 );
		}
	}

	class knopListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak.getText();
			getal = Integer.parseInt(TekstvakGetal);
			switch(getal){
			case 1:
				sMaandnaam = "januari";
				sDagen = "31";
				break;
			case 2:
				sMaandnaam = "februari";
				sDagen = "28";
				break;
			case 3:
				sMaandnaam = "maart";
				sDagen = "31";
				break;
			case 4:
				sMaandnaam = "april";
				sDagen = "30";
				break;
			case 5:
				sMaandnaam = "mei";
				sDagen = "31";
				break;
			case 6:
				sMaandnaam = "juni";
				sDagen = "30";
				break;
			case 7:
				sMaandnaam = "juli";
				sDagen = "31";
				break;
			case 8:
				sMaandnaam = "augustus";
				sDagen = "30";
				break;
			case 9:
				sMaandnaam = "september";
				sDagen = "31";
				break;
			case 10:
				sMaandnaam = "oktober";
				sDagen = "30";
				break;
			case 11:
				sMaandnaam = "november";
				sDagen = "31";
				break;
			case 12:
				sMaandnaam = "december";
				sDagen = "30";
				break;
			default:
				sMaandnaam = "U hebt een verkeerd nummer ingetikt!";
				sDagen = "0";
				break;
			}
			repaint();
		}
	}
}