/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author axelroyer
 */
public class Not extends UnaryExpression{

    public Not(boolean valeur, Constante membre) {
        super(valeur,membre);
    }

    public boolean evaluate()
    {
        return valeur;
    }
}
