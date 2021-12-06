package fr.uge.corp.ifservice.web;

public class IfServiceProxy implements fr.uge.corp.ifservice.web.IfService {
  private String _endpoint = null;
  private fr.uge.corp.ifservice.web.IfService ifService = null;
  
  public IfServiceProxy() {
    _initIfServiceProxy();
  }
  
  public IfServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIfServiceProxy();
  }
  
  private void _initIfServiceProxy() {
    try {
      ifService = (new fr.uge.corp.ifservice.web.IfServiceServiceLocator()).getIfService();
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
  
  public fr.uge.corp.ifservice.web.IfService getIfService() {
    if (ifService == null)
      _initIfServiceProxy();
    return ifService;
  }
  
  public java.lang.String description() throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    return ifService.description();
  }
  
  public fr.uge.corp.ifservice.common.Product[] getAvailableProducts() throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    return ifService.getAvailableProducts();
  }
  
  public fr.uge.corp.ifservice.web.Cart getCartById(int id) throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    return ifService.getCartById(id);
  }
  
  public void validateCart(int id) throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    ifService.validateCart(id);
  }
  
  public void addToCart(int id, fr.uge.corp.ifservice.common.Product p) throws java.rmi.RemoteException{
    if (ifService == null)
      _initIfServiceProxy();
    ifService.addToCart(id, p);
  }
  
  
}