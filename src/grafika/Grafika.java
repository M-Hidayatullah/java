
package grafika;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dayat Kode
 */
public class Grafika extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g;

        int xwc1 = 3, ywc1 = 5, xwc2 = 8, ywc2 = 5, xwc3 = 5, ywc3 = 10;
        int wl = 2, wr = 10, wb = 4, wt = 12;
        int vl = 100, vr = 400, vt = 100, vb = 400;

        int sx = (vr - vl) / (wr - wl);
        int sy = (vt - vb) / (wt - wb);
        int tx = ((vl * wr) - (wl * vr)) / (wr - wl);
        int ty = ((vb * wt) - (wb * vt)) / (wt - wb);
        int xsc1 = (sx * xwc1) + tx;
        int ysc1 = (sy * ywc1) + ty;
        int xsc2 = (sx * xwc2) + tx;
        int ysc2 = (sy * ywc2) + ty;
        int xsc3 = (sx * xwc3) + tx;
        int ysc3 = (sy * ywc3) + ty;

        gd.drawRect(vl, vt, vr, vb);
        gd.drawLine(xsc1, ysc1, xsc2, ysc2);
        gd.drawLine(xsc2, ysc2, xsc3, ysc3);
        gd.drawLine(xsc3, ysc3, xsc1, ysc1);
    }

    public static void main(String[] args) {
        Grafika g = new Grafika();
        JFrame jf = new JFrame();
        jf.add(g);
        jf.setSize(600, 600);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
    
    
    

