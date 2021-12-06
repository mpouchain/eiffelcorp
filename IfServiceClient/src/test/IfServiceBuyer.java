package test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import fr.uge.corp.ifservice.common.Product;
import fr.uge.corp.ifservice.web.IfService;
import fr.uge.corp.ifservice.web.IfServiceServiceLocator;
import fr.uge.corp.ifservice.web.IfServiceSoapBindingStub;

public class IfServiceBuyer {
		
	public static void main(String[] args) throws ServiceException, RemoteException, InterruptedException {
		IfService ifService = new IfServiceServiceLocator().getIfService();
		((IfServiceSoapBindingStub)ifService).setMaintainSession(true);
		
		

		
		System.out.println(ifService.description());
		
			
		
		//Scenario 1 : Client 2 (40e dans son compte ) achète le pull à 35e
		Product p = ifService.getAvailableProducts()[2];
		
		
		ifService.addToCart(2, p);
		
		System.out.println("Product : " + p);
		System.out.println("Client 2 cart :");
		System.out.println(ifService.getCartById(2).getCartDescription());
	}
}
