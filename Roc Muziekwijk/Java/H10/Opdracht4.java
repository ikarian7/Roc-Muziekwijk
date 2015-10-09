// Hoofdstuk 10
package H10;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht4 van het type Applet.
public class Opdracht4 extends Applet {
	TextField tekstvak1;
	TextField tekstvak2;
	Button knop1;
	Button knop2;
	int getal;
	String sDagen;
	String sMaandnaam;
	String sSchrikkeljaar;
	Label label1;
	Label label2;
	int jaartal = 1;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(1000, 300);
		label1 = new Label("Voer het maandgetal in");
		add(label1);
		tekstvak1 = new TextField("", 30);
		add(tekstvak1);
		knop1= new Button("Maand");
		knop1.addActionListener( new knopListener1() );
		add(knop1);	    
		label2 = new Label("Voer het jaar in");
		add(label2);
		tekstvak2 = new TextField("", 30);
		add(tekstvak2);
		knop2 = new Button("Jaar");
		knop2.addActionListener( new knopListener2() );
		add(knop2);
	}

	// Een methode die de inhoud van het scherm tekent.
	public void paint(Graphics g) {
		if (getal > 0) {
			g.drawString("Maand: " + sMaandnaam, 50, 60 );
			g.drawString("Schrikkeljaar: " + sSchrikkeljaar, 50, 80 );
			g.drawString("Aantal dagen: " + sDagen, 50, 100 );

		}
	}

	class knopListener1 implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak1.getText();
			getal = Integer.parseInt(TekstvakGetal);
			switch(getal){
			case 1:
				sMaandnaam = "januari";
				sDagen = "31";
				break;
			case 2:        		 
				if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || 
						jaartal % 400 == 0 ) {
					sMaandnaam = "februari";
					sDagen = "29";
				}
				else {
					sMaandnaam = "februari";
					sDagen = "28";
				}
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
			tekstvak1.setText("");
			repaint();
		}
	}

	class knopListener2 implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {

			String TekstvakGetal = tekstvak2.getText();
			jaartal = Integer.parseInt(TekstvakGetal);
			if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || 
					jaartal % 400 == 0 ) {
				sSchrikkeljaar = ""+ jaartal + " is een schrikkeljaar";
				if (getal == 2) {
					sMaandnaam = "februari";
					sDagen = "29";
				}
			}
			else {
				sSchrikkeljaar = ""+ jaartal + " is geen schrikkeljaar";
				if (getal == 2) {
					sMaandnaam = "februari";
					sDagen = "28";
				}
			}
			tekstvak2.setText("");
			repaint();
		}
	}
}