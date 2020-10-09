import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Praktijk extends Applet {

    TextField tekstvak;
    TextField nummer;
    Label label;
    Label label1;
    Button knop;
    String display[] = new String[10];
    int teller = 0;

    public void init() {

        tekstvak = new TextField("",10);
        tekstvak.addActionListener(new Listener());

        nummer = new TextField("",10);
        nummer.addActionListener(new Listener());

        label = new Label("Naam: ");
        label1 = new Label(" Nummer: ");

        knop = new Button("ok");
        knop.addActionListener(new Listener());

        add(label);
        add(tekstvak);
        add(label1);
        add(nummer);
        add(knop);
    }

    public void paint(Graphics g) {

        setBackground(Color.orange);

        if (teller < display.length) {
            int arraycount = teller - 1;
            g.drawString("" + display[arraycount], 10, 40);
        } else {
            int count;
            int y = 40;
            for(count = 0; count < 10; count++) {
                g.drawString("" + display[count], 10 , y);
                y += 20;
            }
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String naamoutput = tekstvak.getText();
            String nummeroutput = nummer.getText();

            int getal = Integer.parseInt(nummeroutput);

            display[teller] = "Naam: " + naamoutput + "             Nummer: " + getal;

            repaint();
            teller++;
        }
    }
}