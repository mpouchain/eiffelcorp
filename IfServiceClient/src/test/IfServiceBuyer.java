package test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import web.models.Product;
import web.services.IfService;
import web.services.IfServiceServiceLocator;

public class IfServiceBuyer {
		
	public static void main(String[] args) throws ServiceException, RemoteException {
		IfService ifServiceservice = new IfServiceServiceLocator().getIfService();
		/*
		BankService bankService = new BankServiceServiceLocator().getBankService();
		
		((BankServiceSoapBindingStub)bankService).setMaintainSession(true);
		
		bankService.removeFunds(0, 50);
		
		Product p = ifServiceservice.getProducts()[0];
		
		System.out.println("Product p : " + p);
		if(bankService.haveFunds(0, p.getPrice())) {
			System.out.println("Client 0 can buy product " + p.getType());
		} else {
			System.out.println("Client 0 cannot buy product " + p.getType());
		}
		System.out.println(bankService.description());
		System.out.println(ifServiceservice.description());
		*/
		System.out.println(ifServiceservice.getRmiProducts());
	}
}
