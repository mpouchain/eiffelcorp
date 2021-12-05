/**
 * IfService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web.services;

public interface IfService extends java.rmi.Remote {
    public java.lang.String description() throws java.rmi.RemoteException;
    public web.models.Product[] getAvailableProducts() throws java.rmi.RemoteException;
    public void validateCart(web.models.BankClient bc) throws java.rmi.RemoteException;
    public void addToCart(web.models.BankClient bc, web.models.Product p) throws java.rmi.RemoteException;
}
