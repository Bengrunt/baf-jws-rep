/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author axelroyer
 */
public class Not extends UnaryExpression {

    public Not(Expression membre) {
        super(membre);
    }

    public boolean evaluate() {
        return !membre.evaluate();
    }

    @Override
    public String afficher() {
        return "" + this.evaluate();
    }
}
