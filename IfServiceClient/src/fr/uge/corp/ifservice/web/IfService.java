/**
 * IfService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.uge.corp.ifservice.web;

public interface IfService extends java.rmi.Remote {
    public java.lang.String description() throws java.rmi.RemoteException;
    public fr.uge.corp.ifservice.common.Product[] getAvailableProducts() throws java.rmi.RemoteException;
    public void validateCart(int id) throws java.rmi.RemoteException;
    public void addToCart(int id, fr.uge.corp.ifservice.common.Product p) throws java.rmi.RemoteException;
    public fr.uge.corp.ifservice.web.Cart getCartById(int id) throws java.rmi.RemoteException;
}
