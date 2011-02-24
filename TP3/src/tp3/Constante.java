/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author axelroyer
 */
public abstract class Constante extends Expression {

    Boolean valeur;

    public Constante(Boolean valeur)
    {
        this.valeur = valeur;
    }

    public boolean evaluate()
    {
        return valeur;
    }
}
