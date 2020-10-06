import java.applet.*;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {

        Button[] knop = new Button[26];
        int teller;

        for (teller = 0; teller < knop.length; teller++) {
            knop[teller] = new Button("" + teller);
            add(knop[teller]);
        }
        
    }

    public void paint(Graphics g) {
        setBackground(Color.orange);

    }
}