/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modele;

import java.awt.Color;
import java.awt.Point;
import java.util.Observable;
import java.util.Observer;

/**
 * Classe contenant les passants
 * @author David CARRASCO - Hugo EPICIER
 */
public class Passant extends Personnage implements Observer{

    public Passant(Point _position) {
        super(_position);
        this._champsVision = 5;
        this._c = Color.BLUE;
    }

    
    /**
     * M&éthode pour le update de passant
     * @param o Observable
     * @param arg Object
     */
    public void update(Observable o, Object arg) {
        // appeler coucou ou au revoir
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void coucou(){
        System.out.println("COUCOU");
    }

    public void auRevoir(){
        System.out.println("Au Revoir");
    }

}
