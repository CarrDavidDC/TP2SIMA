/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modele;

import java.awt.Color;
import java.awt.Point;

/**
 * Classe abstraite pour les passants et les avatars
 * @author David CARRASCO - Hugo EPICIER
 */
public class Personnage {

    protected Point _position;
    protected int _champsVision;
    protected Color _c;

    public Personnage(Point _position) {
        this._position = _position;
    }


    public Personnage(Point _position, int _champsVision, Color _c) {
        this._position = _position;
        this._champsVision = _champsVision;
        this._c = _c;
    }

    public Personnage() {
    }

    public Color getC() {
        return _c;
    }

    public int getChampsVision() {
        return _champsVision;
    }

    public Point getPosY() {
        return _position;
    }

    public void setC(Color _c) {
        this._c = _c;
    }

    public void setChampsVision(int _champsVision) {
        this._champsVision = _champsVision;
    }

    public void setPosX(Point _pos) {
        this._position = _pos;
    }

}
