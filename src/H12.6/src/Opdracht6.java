import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht6 extends Applet{
    int array[] = {10,10,10,20,30,30,40,40,40,40,40,50,50,50};
    TextField tekstvak;
    Button knop;
    int getal;
    int aantal = 0;
    boolean gevonden;


    public void init() {
        tekstvak = new TextField();
        tekstvak.addActionListener(new Listener());

        knop = new Button("OK");
        knop.addActionListener(new Listener());

        add(tekstvak);
        add(knop);

    }
    public void paint(Graphics g) {
        setBackground(Color.CYAN);

        if (gevonden == true) {
            g.drawString("Gevonden: " + getal, 90 ,60);
            g.drawString("Hoeveelheid: " + aantal, 90 ,80);
        } else {
            g.drawString("Niet gevonden", 90, 60);
            g.drawString("", 90, 80);
        }

    }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = tekstvak.getText();
            getal = Integer.parseInt(output);
            int teller = 0;
            aantal = 0;
            gevonden = false;
            while(teller < array.length) {
                if (array[teller] == getal){
                    gevonden = true;
                    aantal++;

                }
                teller++;
            }
            repaint();



        }
    }

}