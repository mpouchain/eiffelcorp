package web.services;

public class IfServiceProxy implements web.services.IfService {
  private String _endpoint = null;
  private web.services.IfService ifService = null;
  
  public IfServiceProxy() {
    _initIfServiceProxy();
  }
  
  public IfServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIfServiceProxy();
  }
  
  private void _initIfServiceProxy() {
    try {
      ifService = (new web.services.IfServiceServiceLocator()).getIfService();
      if (ifService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ifService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ifService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ifService != null)
      ((javax.xml.rpc.Stub)ifService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.services.IfService getIfService() {
    if (ifService == null)
      _initIfServiceProxy();
    return ifService;
  }
  
  public java.lang.String description() throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    return ifService.description();
  }
  
  public web.models.Product[] getAvailableProducts() throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    return ifService.getAvailableProducts();
  }
  
  public void validateCart(web.models.BankClient bc) throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    ifService.validateCart(bc);
  }
  
  public void addToCart(web.models.BankClient bc, web.models.Product p) throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    ifService.addToCart(bc, p);
  }
  
  public java.lang.String getRmiProducts() throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    return ifService.getRmiProducts();
  }
  
  
}