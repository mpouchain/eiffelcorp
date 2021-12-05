/**
 * IfService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public interface IfService extends java.rmi.Remote {
    public java.lang.String description() throws java.rmi.RemoteException;
    public long getPrice(models.Product p) throws java.rmi.RemoteException;
    public models.Product[] getProducts() throws java.rmi.RemoteException;
}
