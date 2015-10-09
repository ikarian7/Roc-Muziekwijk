// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Praktijkopdracht van het type Applet.
public class Toets extends Applet {
	Button frisknop;
	Button bierknop; 
	Button wijnknop;
	Button koffieknop;
	Button bindistknop;
	Button buitdistknop;
	Button bestellingknop;
	double bedrag, bestellingswaarde, dagomzet, gemiddelde;
	int aantalGeklikt, AantalDagomzet;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		aantalGeklikt = 1;
		bedrag = 0;
		bestellingswaarde = 0;
		dagomzet = 0;
		gemiddelde = 0;
		setSize(400, 500);
		frisknop = new Button("Fris");
		frisknop.addActionListener( new frisListener() );
		add(frisknop);
		bierknop = new Button("Bier");
		bierknop.addActionListener( new bierListener() );
		add(bierknop);
		wijnknop = new Button("Wijn");
		wijnknop.addActionListener( new wijnListener() );
		add(wijnknop);
		koffieknop = new Button("Koffie");
		koffieknop.addActionListener( new koffieListener() );
		add(koffieknop);
		bindistknop = new Button("BinDist");
		bindistknop.addActionListener( new bindistListener() );
		add(bindistknop);
		buitdistknop = new Button("BuitDist");
		buitdistknop.addActionListener( new buitdistListener() );
		add(buitdistknop);
		bestellingknop = new Button("Nieuwe Bestelling");
		bestellingknop.addActionListener( new bestellingListener() );
		add(bestellingknop);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Bestelling totaal: " + String.format("%.2f", bestellingswaarde), 50, 100);
		g.drawString("Totaal dagomzet: " + String.format("%.2f", dagomzet), 50, 120 );
		g.drawString("Totaal gemiddeldeomzet: " + String.format("%.2f", gemiddelde), 50, 140 );
	}

	class frisListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.00;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}
	class bierListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.25;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}
	class wijnListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.50;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}
	class koffieListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 1.75;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}
	class bindistListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 2.75;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}
	class buitdistListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			bedrag = 3.50;
			bestellingswaarde = bedrag * aantalGeklikt++;
			repaint();
		}
	}
	class bestellingListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			AantalDagomzet++;
			dagomzet = bestellingswaarde + dagomzet;
			gemiddelde = dagomzet / AantalDagomzet;
			bestellingswaarde = 0;
			aantalGeklikt = 1;
			repaint();
		}
	}
}