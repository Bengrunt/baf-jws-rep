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

public interface Compteur extends java.rmi.Remote {

    public void incrementation() throws RemoteException;

    public int getValue() throws RemoteException;

    public int getAccess() throws RemoteException;
}
