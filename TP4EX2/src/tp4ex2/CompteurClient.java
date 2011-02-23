/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4ex2;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

/**
 *
 * @author franckfischer
 */
public class CompteurClient {

    public static void main(String[] args) {
        try {
            Compteur c;
            c = (Compteur)Naming.lookup("rmi://localhost/CompteurService");

            System.out.println(c.getValue());


        }


        catch (MalformedURLException e) {
            System.out.println("Erreur malformed exception");
            System.out.println(e);
        }
        catch (RemoteException re) {
            System.out.println("Erreur remoteexception exception");
            System.out.println(re);
        }
        catch (NotBoundException nbe) {
            System.out.println("Erreur notbound exception");
            System.out.println(nbe);
        }
        catch (java.lang.ArithmeticException ae) {
            System.out.println("Erreur arithmetic excepetion");
            System.out.println(ae);
        }


    }
}
