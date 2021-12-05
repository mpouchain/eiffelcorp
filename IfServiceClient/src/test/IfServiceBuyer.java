package test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import web.models.BankClient;
import web.services.BankService;
import web.services.BankServiceServiceLocator;
import web.services.BankServiceSoapBindingStub;
import web.services.IfService;
import web.services.IfServiceServiceLocator;

public class IfServiceBuyer {
		
	public static void main(String[] args) throws ServiceException, RemoteException {
		IfService ifService = new IfServiceServiceLocator().getIfService();
		BankService bankService = new BankServiceServiceLocator().getBankService();		
		((BankServiceSoapBindingStub)bankService).setMaintainSession(true);
		
		BankClient c1 = new BankClient(1);
		BankClient c2 = new BankClient(2);
		BankClient c3 = new BankClient(3);
		
		bankService.addClient(c1, 200);
		bankService.addClient(c2, 40);
		bankService.addClient(c3, 500);
		
		System.out.println(ifService.description());
		
		System.out.println(bankService.description());
		
		//Scenario 1 : Client 2 achète le pull en laine
		//System.out.println("C2 can buy pull : " + bankService.hasFunds(c2, 35));
		
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
