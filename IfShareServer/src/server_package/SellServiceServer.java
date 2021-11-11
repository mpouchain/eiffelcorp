package server_package;

import common.ISellService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class SellServiceServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            ISellService sellService = new SellService();
            ISellService stub = (ISellService) UnicastRemoteObject.exportObject(sellService, 0);
            registry.rebind("rmi://localhost:1099/sellservice", stub);
        }catch(Exception e) {
            System.out.println("Trouble : " + e);
        }
    }
}
