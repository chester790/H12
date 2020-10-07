import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Opdracht3 extends Applet {

    TextField[] tekstvak = new TextField[5];
    Button confirm;
    int[] getal = new int[5];

    public void init() {

        int teller;

        for(teller = 0; teller < tekstvak.length; teller++) {

            tekstvak[teller] = new TextField("",5);
            tekstvak[teller].addActionListener(new Listener());
            add(tekstvak[teller]);
        }
        confirm = new Button("ok");
        confirm.addActionListener(new Listener());
        add(confirm);

    }

    public void paint(Graphics g) {
        int teller;
        int x = 10;
        for (teller = 0; teller < tekstvak.length; teller++) {
            g.drawString("" + getal[teller], x,80);
            x += 40;
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int teller;
            String[] output = new String[tekstvak.length];
            for(teller = 0; teller < tekstvak.length; teller++) {
                output[teller] = tekstvak[teller].getText();
                getal[teller] = Integer.parseInt(output[teller]);
            }
            Arrays.sort(getal);
            repaint();
        }
    }

}