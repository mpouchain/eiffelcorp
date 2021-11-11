package server_package;

import common.IProductBase;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ProductBase extends UnicastRemoteObject implements IProductBase {

    public ProductBase() throws RemoteException {
        super();
    }
}
