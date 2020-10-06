
import java.applet.*;
import java.awt.*;


public class Opdracht1 extends Applet {
    double totaal;
    double[] getal;

    public void init() {
        getal = new double[10];

    }

    public void paint(Graphics g) {

 //dit zijn alle getallen die bij elkaar worden opgeteld en worden gedeelt door 10
        getal[0] = 5.6;
        getal[1] = 3.2;
        getal[2] = 8.3;
        getal[3] = 2.9;
        getal[4] = 7.9;
        getal[5] = 5.4;
        getal[6] = 3.1;
        getal[7] = 4.5;
        getal[8] = 8.1;
        getal[9] = 8.9;

        totaal = 0;

//Dit laat alles zien op je scherm
        for (int teller = 0; teller < getal.length; teller++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            totaal += getal [teller];
        }

//Dit rekend het gemiddelde uit voor je
        g.drawString("het gemiddelde =" + totaal/getal.length, 100,10 * (getal.length + 1) + 20);
    }
}
