package test;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.rpc.ServiceException;

import models.BankClient;
import models.Product;
import services.BankService;
import services.BankServiceServiceLocator;
import services.BankServiceSoapBindingStub;
import services.IfService;
import services.IfServiceServiceLocator;

public class IfServiceBuyer {
		
	public static void main(String[] args) throws ServiceException, RemoteException {
		IfService ifServiceservice = new IfServiceServiceLocator().getIfService();
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
	}
}
