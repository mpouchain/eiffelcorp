package test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fr.uge.corp.ifservice.common.Product;
import fr.uge.corp.ifservice.web.IfService;
import fr.uge.corp.ifservice.web.IfServiceServiceLocator;
import fr.uge.corp.ifservice.web.IfServiceSoapBindingStub;

public class IfServiceBuyer {
		
	public static void main(String[] args) throws ServiceException, RemoteException {
		IfService ifService = new IfServiceServiceLocator().getIfService();
		((IfServiceSoapBindingStub)ifService).setMaintainSession(true);

		
		System.out.println(ifService.description());
		
			
		
		//Scenario 1 : Client 2 (40e dans son compte ) achète le pull à 35e
		Product p = ifService.getAvailableProducts()[2];
		
		
		ifService.addToCart(2, p);
		
		System.out.println("Product : " + p);
		System.out.println("Client 2 cart :");
		System.out.println(ifService.getCartById(1).getCartDescription());
		System.out.println(ifService.getCartById(2).getCartDescription());
		System.out.println(ifService.getCartById(3).getCartDescription());

		/*
		System.out.println(bankService.getClientById(2).getCart());
		
		
		/*
		Product p = ifService.getAvailableProducts()[0];
		
		System.out.println("Product p : " + p);
		if(bankService.hasFunds(0, p.getPrice())) {
			System.out.println("Client 0 can buy product " + p.getType());
		} else {
			System.out.println("Client 0 cannot buy product " + p.getType());
		}
		System.out.println(bankService.description());
		System.out.println(ifServiceservice.description());
		*/
	}
}
