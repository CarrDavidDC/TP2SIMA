/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author p0806569
 */
public class FormeDessinableRectangle extends FormeDessinable{

    public FormeDessinableRectangle(int x1,int x2,int y1,int y2)
    {
        super( x1, x2, y1, y2);
    }

    public void paintComponent(Graphics g,int x1,int x2,int y1,int y2) {
           // super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.fillRect(x1, x2, y1, y2);
        }

    
}
