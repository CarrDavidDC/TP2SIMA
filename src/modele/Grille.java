/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modele;

import java.awt.Dimension;
import java.awt.Point;
import java.util.Observable;

/**
 * Classe contenant la grille de données
 * @author David CARRASCO - Hugo EPICIER
 */
public class Grille extends Observable{

    // un tableau de passants
    private Passant[] _tabPassants;
    // attribut contenant l'avatar
    private Avatar _avatar;
    // la dimension de la grille avec x et y
    private Dimension _d;

    public Grille() {
    }

    public Grille(int nbPassant, Dimension _d) {
        this._tabPassants = new Passant[nbPassant];
        this._avatar = new Avatar();
        this._d = new Dimension(15,15);
        creationPassant(nbPassant);
    }

    public Avatar getAvatar() {
        return _avatar;
    }

    public Dimension getD() {
        return _d;
    }

    public Passant[] getTabPassants() {
        return _tabPassants;
    }

    public Passant getLePassants(int p)
    {
        return _tabPassants[p];
    }

    public void setAvatar(Avatar _avatar) {
        this._avatar = _avatar;
    }

    public void setD(Dimension _d) {
        this._d = _d;
    }

    public void setTabPassants(Passant[] _tabPassants) {
        this._tabPassants = _tabPassants;
    }

    public void creationPassant(int nb)
    {
        Passant last = new Passant(new Point(0,1));
        Passant p1 = new Passant(new Point(5,5));
        Passant p6 = new Passant(new Point(2,1));
        Passant p7 = new Passant(new Point(6,8));
        Passant p8 = new Passant(new Point(2,10));
        Passant p9 = new Passant(new Point(10,15));
        Passant p10 = new Passant(new Point(9,12));
        _tabPassants[0] = last;
        _tabPassants[1] = p1;
        _tabPassants[2] = p6;
        _tabPassants[3] = p7;
        _tabPassants[4] = p8;
        _tabPassants[5] = p9;
        _tabPassants[6] = p10;
    }

    /**
     * False si pas de passant sinon true
     * @param p
     * @return
     */
    public boolean isPassant(Point p)
    {
        int n = 0;
        while(n < 7)
        {
            if(_tabPassants[n].getPosY().getX() == p.getX() && _tabPassants[n].getPosY().getY() == p.getY() )
                return true;
            n++;
        }
        return false;
    }
}
