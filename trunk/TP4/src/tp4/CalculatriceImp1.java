/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tp4;

import java.rmi.RemoteException;

/**
 *
 * @author franckfischer
 */
public class CalculatriceImp1 extends java.rmi.server.UnicastRemoteObject implements Calculatrice
{
    public CalculatriceImp1() throws java.rmi.RemoteException {
        super();
    }
    public long add(long a, long b) throws RemoteException {
        return a + b;
    }

    public long sub(long a, long b) throws RemoteException {
        return a - b;
    }

    public long mul(long a, long b) throws RemoteException {
        return a * b;
    }

    public long div(long a, long b) throws RemoteException {
        return a / b;
    }

}
