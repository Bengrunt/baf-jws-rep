/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.rmi.Naming;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author franckfischer
 */
public class CalculatriceServer {

    public CalculatriceServer() {
        try {
            Calculatrice c;
            c = new CalculatriceImp1();
            Naming.rebind("rmi://localhost/CalculatriceService", c);
        }
        catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        new CalculatriceServer();
        
    }
}
