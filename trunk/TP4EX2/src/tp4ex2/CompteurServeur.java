/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4ex2;

/**
 *
 * @author franckfischer
 */
import java.io.*;
import java.rmi.*;
import java.rmi.server.*;

public class CompteurServeur {

    public CompteurServeur() {
        try {
            Compteur c;
            c = new CompteurImpl();
            Naming.rebind("rmi://localhost/CompteurService", c);
        }
        catch (Exception e) {
            System.out.println("Trouble: " + e);
        }
    }

    public static void main(String args[]) {
        new CompteurServeur();

    }
}
