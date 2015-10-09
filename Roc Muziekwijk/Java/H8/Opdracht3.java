// Hoofdstuk 8
package H8;

// Importeer de benodigde klassen uit de Java bibliotheek.
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// Een klasse met de naam Opdracht3 van het type Applet.
public class Opdracht3 extends Applet {
	TextField tekstvak;
	Label label;
	Button knop;
	String s;
	double BTW ;
	double BTWuitkomst;
	int a;

	// Een (lege) methode die de Applet gaat initialiseren.
	public void init() {
		setSize(600, 300);
		a = 0;
		BTW= 1.19;
		label = new Label("Inclusief BTW");
		add(label);
		knop = new Button("Ok");
		knop.addActionListener( new knop1Listener() );
		add(knop);
		tekstvak = new TextField("", 20);
		tekstvak.addActionListener( new TekstvakListener() );
		add(tekstvak);
	}

	// Een methode die de inhoud van het scherm tekent.	
	public void paint(Graphics g) {
		g.drawString("Exclusief BTW: " + BTWuitkomst, 50, 60 );
	}

	class TekstvakListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			s = tekstvak.getText();
			a = Integer.parseInt(s);
			BTWuitkomst = a * BTW;
			tekstvak.setText("");
			repaint();
		}
	}

	class knop1Listener implements ActionListener	{
		public void actionPerformed( ActionEvent e ) {
			s = tekstvak.getText();
			a = Integer.parseInt(s);
			BTWuitkomst = a * BTW;
			tekstvak.setText("");
			repaint();
		}
	}
}