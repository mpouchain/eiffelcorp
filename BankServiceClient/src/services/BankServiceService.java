/**
 * BankServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package services;

public interface BankServiceService extends javax.xml.rpc.Service {
    public java.lang.String getBankServiceAddress();

    public services.BankService getBankService() throws javax.xml.rpc.ServiceException;

    public services.BankService getBankService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
