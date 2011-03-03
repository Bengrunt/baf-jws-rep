/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author axelroyer
 */
public abstract class BinaryExpression extends Expression {

    Expression membre1;
    Expression membre2;

    public BinaryExpression(Expression membre1, Expression membre2) {
        this.membre1 = membre1;
        this.membre2 = membre2;
    }

    public void setMembre1(Expression membre1) {
        this.membre1 = membre1;
    }

    public void setMembre2(Expression membre2) {
        this.membre2 = membre2;
    }

    public Expression getMembre1() {
        return membre1;
    }

    public Expression getMembre2() {
        return membre2;
    }

    public abstract boolean evaluate();
}
