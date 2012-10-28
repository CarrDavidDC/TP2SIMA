/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vue;

/**
 *
 * @author p0806569
 */
public class VueOvale extends Vue
{
    public VueOvale()
    {
        int hauteur = (int)_g.getD().getHeight();
        int largeur = (int)_g.getD().getWidth();
        _fen = new FormeDessinableOvale[hauteur][largeur];
        for(int i=0;i<hauteur;i++)
        {
            for(int j=0;j<largeur;i++)
            {
                _fen[i][j] = new FormeDessinableOvale();
            }
        }
    }
}
