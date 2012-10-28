/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controleur;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import modele.Grille;
import vue.Vue;

/**
 * Controleur pour la vue Fenetre
 * @author David CARRASCO - Hugo EPICIER
 */
public class ControleurFleches  implements KeyListener{

    private Vue _v;
    private Grille _g;
    private JPanel _p;

    public ControleurFleches(Vue _v, Grille _g,JPanel _p) {
        this._v = _v;
        this._g = _g;
        this._p = _p;
    }
    
    
    /**
     * Méthode pour le keyTyped
     * @param e Evenement
     */
    public void keyTyped(KeyEvent e) {
        
    }

    /**
     * Méthode pour le keyPressed
     * @param e Evenement
     */
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() < 37 || e.getKeyCode() > 40)
            e.consume();
        else
            _g.maj();
    }

    /**
     * Méthode pour le keyReleased
     * @param e Evenement
     */
    public void keyReleased(KeyEvent e) {
        
    }

}
