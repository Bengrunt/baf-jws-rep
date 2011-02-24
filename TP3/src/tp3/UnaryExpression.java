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

    Constante membre;
    public UnaryExpression(boolean valeur, Constante membre)
    {
        super(valeur);
        this.membre=membre;
    }

    public void setMembre(Constante membre) {
        this.membre = membre;
    }

    public Constante getMembre() {
        return membre;
    }

    public abstract boolean evaluate();
}
