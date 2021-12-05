/**
 * BankService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web.services;

public interface BankService extends java.rmi.Remote {
    public java.lang.String description() throws java.rmi.RemoteException;
    public boolean hasFunds(web.models.BankClient bc, double value) throws java.rmi.RemoteException;
    public void removeFunds(web.models.BankClient bc, double value) throws java.rmi.RemoteException;
    public void addClient(web.models.BankClient bc, double value) throws java.rmi.RemoteException;
    public double getFunds(web.models.BankClient bc) throws java.rmi.RemoteException;
}
