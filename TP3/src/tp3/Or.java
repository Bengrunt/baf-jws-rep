/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author axelroyer
 */
public class Or extends BinaryExpression{

    public Or(boolean valeur, Constante membre1, Constante membre2) {
        super(valeur,membre1, membre2);
    }

    public boolean evaluate()
    {
        return membre1.evaluate() || membre2.evaluate();
    }
}
