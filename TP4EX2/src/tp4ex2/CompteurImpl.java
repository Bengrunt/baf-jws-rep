/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4ex2;

/**
 *
 * @author franckfischer
 */
import java.rmi.*;
import java.rmi.server.*;

public class CompteurImpl extends UnicastRemoteObject implements Compteur {

    private int compteur;
    private int reference;

    public CompteurImpl() throws RemoteException{
        super();
        this.compteur = 0;
        this.reference = 0;
    }
    
    public void incrementation() throws RemoteException {
        compteur++;
    }

    public int getValue() throws RemoteException {
        return compteur;
    }

    public int getAccess() throws RemoteException {
        return reference;
    }
    
}
