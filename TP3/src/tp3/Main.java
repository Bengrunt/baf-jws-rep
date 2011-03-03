/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3;

/**
 *
 * @author axelroyer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Constante c2 = new Constante(true);
        Constante c1 = new Constante(false);

        And a1 = new And(c1,c2);
        Not n1 = new Not(a1);
        
        System.out.println("L'évaluation de n1 vaut : " + n1.afficher());

        Constante cc3 = new Constante(false);
        Constante cc2 = new Constante(true);
        Not nn1 = new Not(n1);
        Constante cc1 = new Constante(false);
        Or oo2 = new Or(cc2,cc3);
        And aa1 = new And(cc1,nn1);
        Or oo1 = new Or(aa1,oo2);

        System.out.println("L'évaluation de oo1 vaut : " + oo1.afficher());
    }

}
