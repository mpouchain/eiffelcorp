package test;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import services.BankService;
import services.BankServiceServiceLocator;
import services.BankServiceSoapBindingStub;

public class Main {
	public static void main(String[] args) throws ServiceException, RemoteException {
		BankService service = new BankServiceServiceLocator().getBankService();
		((BankServiceSoapBindingStub)service).setMaintainSession(true);
		service.removeFunds(0, 50);
		System.out.println(service.description());
	}
}
