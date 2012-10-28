/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import modele.Grille;

/**
 *
 * @author p0806569
 */
public class VueRectangle extends Vue
{
    public VueRectangle(int hauteur, int largeur)
    {
        super(new Grille(),hauteur,largeur);
        _fen = new FormeDessinableRectangle[hauteur][largeur];
        
        _panel = new JPanel(new GridLayout(largeur,hauteur));
     //   ControleurClic controleur = new ControleurClic(_mod,this);
        _panel.setSize(200, 300);
        // lignes
        for(int i = 0; i < hauteur;i++)
        {
            // colonnes
            for(int j = 0; j < largeur; j++)
            {
                _fen[i][j] = new FormeDessinableRectangle(0,0,largeur,hauteur);
                FormeDessinableRectangle rect = (FormeDessinableRectangle) _fen[i][j];
                rect.setName("("+i+", "+j+")");
                // lors de la création on n a pas d affichage définit
                rect.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                if(_g.isPassant(new Point(i,j)))
                    rect.setBackground(_g.getLePassants(0).getC());
                else
                   rect.setBackground(Color.WHITE);
            //    panel.addMouseListener(controleur);

                _panel.add(rect);
               // controleur.ajouterPanel(panel, i, j);
            }
        }
        
        this.setTitle("Vue Rectangle");
        this.setContentPane(_panel);
        this.setSize(300, 200);
        lienJPanelControleur();
    }
}
