/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author axelroyer
 */
public abstract class UnaryExpression extends Expression {

    Expression membre;

    public UnaryExpression(Expression membre) {
        this.membre=membre;
    }

    public void setMembre(Expression membre) {
        this.membre = membre;
    }

    public Expression getMembre() {
        return membre;
    }

    public abstract boolean evaluate();
}
