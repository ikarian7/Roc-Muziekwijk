// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Praktijkopdracht van het type Applet.
public class Herkansingtoets extends Applet {
	Button plusKnop;
	Button minKnop;
	TextField tekstvak;
	Label label;
	double fooi, rekeningBedrag, inclusiefFooi;
	int aantalGeklikt, fooiPercentage, geklikt;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		aantalGeklikt = 1;
		fooi = 0;
		rekeningBedrag = 0;
		fooiPercentage = 15;
		setSize(300, 200);
		label = new Label("Rekening Bedrag");
		add(label);
		tekstvak = new TextField("", 20);
		add (tekstvak);
		tekstvak.addActionListener( new TekstvakListener() );
		plusKnop = new Button("+");
		plusKnop.addActionListener( new plusListener() );
		add(plusKnop);
		minKnop = new Button("-");
		minKnop.addActionListener( new minListener() );
		add(minKnop);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Percentage fooi: " + fooiPercentage + "%", 10, 50);
		if (geklikt == 1) {
			g.drawString("Fooi: " + String.format("%.2f", fooi), 10, 80 );
			g.drawString("Totaal incl fooi: " + String.format("%.2f", inclusiefFooi), 10, 100 );
		}
	}

	class TekstvakListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s;
			s = tekstvak.getText();
			rekeningBedrag = Double.parseDouble( s );
			fooi = (fooiPercentage / 100) * rekeningBedrag;
			tekstvak.setText("");
			if (aantalGeklikt <=100){
				fooiPercentage++;
				fooi = rekeningBedrag / 100 * fooiPercentage;
				inclusiefFooi = fooi + rekeningBedrag;
			}
			if (aantalGeklikt >0){
				fooiPercentage--;
				fooi = rekeningBedrag / 100 * fooiPercentage;
				inclusiefFooi = fooi + rekeningBedrag;
			}
			if (fooiPercentage <=0){
				fooiPercentage = 0;
				fooi = 0;
				inclusiefFooi = rekeningBedrag;
			}
			geklikt = 1;
			repaint();
		}
	}
	class plusListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			if (aantalGeklikt <=100){
				fooiPercentage++;
				fooi = rekeningBedrag / 100 * fooiPercentage;
				inclusiefFooi = fooi + rekeningBedrag;
			}
			repaint();
		}
	}
	class minListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			if (aantalGeklikt >0){
				fooiPercentage--;
				fooi = rekeningBedrag / 100 * fooiPercentage;
				inclusiefFooi = fooi + rekeningBedrag;
			}
			if (fooiPercentage <=0){
				fooiPercentage = 0;
				fooi = 0;
				inclusiefFooi = rekeningBedrag;
			}
			repaint();
		}
	}
}