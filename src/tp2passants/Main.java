/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp2passants;

import vue.Launcher;
import vue.VueRectangle;

/**
 *
 * @author p0806569
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Launcher("Launcher").setVisible(true);
        new VueRectangle(15,15).setVisible(true);
    }

}
