/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import javax.swing.JPanel;

/**
 * Classe pour faire des formes dessinables
 * @author David CARRASCO - Hugo EPICIER
 */
public class FormeDessinable extends JPanel{

    protected int _posX1;
    protected int _posY1;
    protected int _largeur;
    protected int _hauteur;
    
    public FormeDessinable() {
    }

    public FormeDessinable(int _posX, int _posY, int _largeur, int _hauteur) {
        this._posX1 = _posX;
        this._posY1 = _posY;
        this._largeur = _largeur;
        this._hauteur = _hauteur;
    }

    public int getHauteur() {
        return _hauteur;
    }

    public int getLargeur() {
        return _largeur;
    }

    public int getPosX() {
        return _posX1;
    }

    public int getPosY() {
        return _posY1;
    }


    
}
