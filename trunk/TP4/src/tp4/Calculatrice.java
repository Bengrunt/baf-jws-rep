/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp4;

/**
 *
 * @author franckfischer
 */
public interface Calculatrice extends java.rmi.Remote{

    //public void Calculatrice();

    public long add(long a, long b)
        throws java.rmi.RemoteException;

    public long sub(long a, long b)
        throws java.rmi.RemoteException;

    public long mul(long a, long b)
        throws java.rmi.RemoteException;

    public long div(long a, long b)
        throws java.rmi.RemoteException;

}
