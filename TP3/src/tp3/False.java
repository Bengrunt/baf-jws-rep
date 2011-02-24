/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author axelroyer
 */
public class False extends Constante{

    public False(){
        super(false);
    }

    @Override
    public boolean evaluate()
    {
        return valeur;
    }
    
    @Override
    public String toString()
    {
        return "false";
    }

}
