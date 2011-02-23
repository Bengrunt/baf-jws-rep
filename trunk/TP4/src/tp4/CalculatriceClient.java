/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

/**
 *
 * @author franckfischer
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatriceClient {

    public static void main(String[] args) {
        try {
            Calculatrice c;
            c = (Calculatrice)Naming.lookup("rmi://localhost/CalculatriceService");

            System.out.println(c.sub(4, 3));
            System.out.println(c.add(4, 5));
            System.out.println(c.mul(3, 6));
            System.out.println(c.div(9, 3));

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
