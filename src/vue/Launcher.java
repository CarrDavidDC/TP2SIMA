/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Classe contenant 3 boutons pour gérer l'affichage des différentes vues
 * @author David CARRASCO - Hugo EPICIER
 */
public class Launcher extends JFrame{

    private JButton _carre;
    private JButton _cercle;
    private JButton _lesDeux;
    private String _titre;
    
    public Launcher(String titre){
        this.setTitle(titre);
        _titre = titre;
        _carre = new JButton("Carré");
        _cercle = new JButton("Cercle");
        _lesDeux = new JButton("Les deux");

        this.creationFenetre();
     //   this.creationControleur();
        this.setLocation(100,200);
    }

    public void creationFenetre()
    {
        JPanel p = new JPanel(new BorderLayout());
        this.setContentPane(p);
        this.setSize(400,110);
        this.setResizable(false);

        JPanel buttonPanel = new JPanel(new GridLayout(1,3));
        buttonPanel.add(_carre);
        buttonPanel.add(_cercle);
        buttonPanel.add(_lesDeux);
        
        p.add(buttonPanel);
    }
}
