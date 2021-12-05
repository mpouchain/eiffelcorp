package web.services;

public class BankServiceProxy implements web.services.BankService {
  private String _endpoint = null;
  private web.services.BankService bankService = null;
  
  public BankServiceProxy() {
    _initBankServiceProxy();
  }
  
  public BankServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankServiceProxy();
  }
  
  private void _initBankServiceProxy() {
    try {
      bankService = (new web.services.BankServiceServiceLocator()).getBankService();
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
  
  public web.services.BankService getBankService() {
    if (bankService == null)
      _initBankServiceProxy();
    return bankService;
  }
  
  public java.lang.String description() throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.description();
  }
  
  public boolean hasFunds(web.models.BankClient bc, double value) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.hasFunds(bc, value);
  }
  
  public void removeFunds(web.models.BankClient bc, double value) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    bankService.removeFunds(bc, value);
  }
  
  public void addClient(web.models.BankClient bc, double value) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    bankService.addClient(bc, value);
  }
  
  public double getFunds(web.models.BankClient bc) throws java.rmi.RemoteException{
    if (bankService == null)
      _initBankServiceProxy();
    return bankService.getFunds(bc);
  }
  
  
}