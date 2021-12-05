package fr.uge.corp.bank.web;

public class BankServiceProxy implements fr.uge.corp.bank.web.BankService {
  private String _endpoint = null;
  private fr.uge.corp.bank.web.BankService bankService = null;
  
  public BankServiceProxy() {
    _initBankServiceProxy();
  }
  
  public BankServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankServiceProxy();
  }
  
  private void _initBankServiceProxy() {
    try {
      bankService = (new fr.uge.corp.bank.web.BankServiceServiceLocator()).getBankService();
      if (bankService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bankService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bankService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bankService != null)
      ((javax.xml.rpc.Stub)bankService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public fr.uge.corp.bank.web.BankService getBankService() {
    if (bankService == null)
      _initBankServiceProxy();
    return bankService;
  }
  
  public java.lang.String description() throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.description();
  }
  
  public boolean hasFunds(int id, double value) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.hasFunds(id, value);
  }
  
  public void removeFunds(int id, double value) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    bankService.removeFunds(id, value);
  }
  
  public fr.uge.corp.bank.common.BankClient getClientById(int id) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.getClientById(id);
  }
  
  public void addClient(int id, double value) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    bankService.addClient(id, value);
  }
  
  public double getFunds(fr.uge.corp.bank.common.BankClient bc) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.getFunds(bc);
  }
  
  
}