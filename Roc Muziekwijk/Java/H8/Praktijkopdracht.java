// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Praktijkopdracht van het type Applet.
public class Praktijkopdracht extends Applet {
	TextField tekstvak1;
	TextField tekstvak2;
	Button keerKnop;
	Button delenKnop;
	Button plusKnop;
	Button minKnop;
	double getal1, getal2, antwoord;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 500);
		keerKnop = new Button("*");
		keerKnop.addActionListener( new keerListener() );
		add(keerKnop);
		delenKnop = new Button("/");
		delenKnop.addActionListener( new delenListener() );
		add(delenKnop);
		plusKnop = new Button("+");
		plusKnop.addActionListener( new plusListener() );
		add(plusKnop);
		minKnop = new Button("-");
		minKnop.addActionListener( new minListener() );
		add(minKnop);
		tekstvak1 = new TextField("", 20);
		add(tekstvak1);
		tekstvak2 = new TextField("", 20);
		add(tekstvak2);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
	}

	class keerListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal1 = Double.parseDouble(tekstvak1.getText());
			getal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = getal1 * getal2;
			tekstvak1.setText("" + antwoord);
			tekstvak2.setText("");
			repaint();
		}
	}
	class delenListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal1 = Double.parseDouble(tekstvak1.getText());
			getal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = getal1 / getal2;
			tekstvak1.setText("" + antwoord);
			tekstvak2.setText("");
			repaint();
		}
	}
	class plusListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal1 = Double.parseDouble(tekstvak1.getText());
			getal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = getal1 + getal2;
			tekstvak1.setText("" + antwoord);
			tekstvak2.setText("");
			repaint();
		}
	}
	class minListener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			getal1 = Double.parseDouble(tekstvak1.getText());
			getal2 = Double.parseDouble(tekstvak2.getText());
			antwoord = getal1 - getal2;
			tekstvak1.setText("" + antwoord);
			tekstvak2.setText("");
			repaint();
		}
	}
}