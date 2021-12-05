/**
 * BankService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.uge.corp.bank.web;

public interface BankService extends java.rmi.Remote {
    public java.lang.String description() throws java.rmi.RemoteException;
    public boolean hasFunds(int id, double value) throws java.rmi.RemoteException;
    public void removeFunds(int id, double value) throws java.rmi.RemoteException;
    public fr.uge.corp.bank.common.BankClient getClientById(int id) throws java.rmi.RemoteException;
    public void addClient(int id, double value) throws java.rmi.RemoteException;
    public double getFunds(fr.uge.corp.bank.common.BankClient bc) throws java.rmi.RemoteException;
}
