package server_package;

import common.IProductBase;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ProductBaseServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            IProductBase productBase = new ProductBase();
            IProductBase stub = (IProductBase) UnicastRemoteObject.exportObject(productBase, 0);
            registry.rebind("rmi://localhost:1099/productbase", stub);
        }catch(Exception e) {
            System.out.println("Trouble : " + e);
        }
    }
}
