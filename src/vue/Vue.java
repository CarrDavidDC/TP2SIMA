/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modele.Grille;

/**
 *
 * @author p0806569
 */
public class Vue extends JFrame implements Observer{

    
    protected FormeDessinable[][] _fen;
    protected JPanel _panel;
    protected Grille _g;

    public Vue()
    {
        
    }
    
    /**
     *
     * @param fen
     */
    public Vue(Grille g, int hauteur, int largeur)
    {
        _g = new Grille(7,new Dimension(hauteur,largeur));
    }

    /**
     * 
     * @param o
     * @param arg
     */
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
