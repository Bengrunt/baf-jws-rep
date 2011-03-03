/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author axelroyer
 */
public class Or extends BinaryExpression {

    public Or(Expression membre1, Expression membre2) {
        super(membre1, membre2);
    }

    public boolean evaluate() {
        return membre1.evaluate() || membre2.evaluate();
    }

    @Override
    public String afficher() {
        return "" + this.evaluate();
    }
}
