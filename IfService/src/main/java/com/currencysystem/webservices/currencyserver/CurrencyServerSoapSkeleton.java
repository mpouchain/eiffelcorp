/**
 * CurrencyServerSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.currencysystem.webservices.currencyserver;

public class CurrencyServerSoapSkeleton implements com.currencysystem.webservices.currencyserver.CurrencyServerSoap, org.apache.axis.wsdl.Skeleton {
    private com.currencysystem.webservices.currencyserver.CurrencyServerSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("activeCurrencies", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "ActiveCurrenciesResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "ActiveCurrencies"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/ActiveCurrencies");
        _myOperationsList.add(_oper);
        if (_myOperations.get("activeCurrencies") == null) {
            _myOperations.put("activeCurrencies", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("activeCurrencies")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "feedID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "URL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "userID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "action"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvFXFeedAction"), com.currencysystem.webservices.currencyserver.CurncsrvFXFeedAction.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("adminFXFeed", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AdminFXFeed"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/AdminFXFeed");
        _myOperationsList.add(_oper);
        if (_myOperations.get("adminFXFeed") == null) {
            _myOperations.put("adminFXFeed", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("adminFXFeed")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "multiple"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvFXModeMultiple"), com.currencysystem.webservices.currencyserver.CurncsrvFXModeMultiple.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "lockCurrencies"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvFXModeLock"), com.currencysystem.webservices.currencyserver.CurncsrvFXModeLock.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("adminFXMode", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AdminFXMode"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/AdminFXMode");
        _myOperationsList.add(_oper);
        if (_myOperations.get("adminFXMode") == null) {
            _myOperations.put("adminFXMode", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("adminFXMode")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("adminLoad", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AdminLoad"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/AdminLoad");
        _myOperationsList.add(_oper);
        if (_myOperations.get("adminLoad") == null) {
            _myOperations.put("adminLoad", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("adminLoad")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "text"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvMessageType"), com.currencysystem.webservices.currencyserver.CurncsrvMessageType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("adminMessage", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AdminMessage"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/AdminMessage");
        _myOperationsList.add(_oper);
        if (_myOperations.get("adminMessage") == null) {
            _myOperations.put("adminMessage", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("adminMessage")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "flags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvResetFlags"), com.currencysystem.webservices.currencyserver.CurncsrvResetFlags.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("adminReset", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AdminReset"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/AdminReset");
        _myOperationsList.add(_oper);
        if (_myOperations.get("adminReset") == null) {
            _myOperations.put("adminReset", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("adminReset")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("adminSave", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AdminSave"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/AdminSave");
        _myOperationsList.add(_oper);
        if (_myOperations.get("adminSave") == null) {
            _myOperations.put("adminSave", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("adminSave")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("adminUpdateNow", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AdminUpdateNow"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/AdminUpdateNow");
        _myOperationsList.add(_oper);
        if (_myOperations.get("adminUpdateNow") == null) {
            _myOperations.put("adminUpdateNow", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("adminUpdateNow")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("allCurrencies", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AllCurrenciesResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "AllCurrencies"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/AllCurrencies");
        _myOperationsList.add(_oper);
        if (_myOperations.get("allCurrencies") == null) {
            _myOperations.put("allCurrencies", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("allCurrencies")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "fromCurrency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "toCurrency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "rounding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "format"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "returnRate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvReturnRate"), com.currencysystem.webservices.currencyserver.CurncsrvReturnRate.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("convert", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "ConvertResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "Convert"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/Convert");
        _myOperationsList.add(_oper);
        if (_myOperations.get("convert") == null) {
            _myOperations.put("convert", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("convert")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("copyright", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CopyrightResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "Copyright"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/Copyright");
        _myOperationsList.add(_oper);
        if (_myOperations.get("copyright") == null) {
            _myOperations.put("copyright", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("copyright")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "activeOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("countryToCurrency", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CountryToCurrencyResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CountryToCurrency"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CountryToCurrency");
        _myOperationsList.add(_oper);
        if (_myOperations.get("countryToCurrency") == null) {
            _myOperations.put("countryToCurrency", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("countryToCurrency")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "returnCountry"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvReturnCountry"), com.currencysystem.webservices.currencyserver.CurncsrvReturnCountry.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyToCountry", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyToCountryResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyToCountry"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyToCountry");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyToCountry") == null) {
            _myOperations.put("currencyToCountry", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyToCountry")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyToDomain", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyToDomainResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyToDomain"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyToDomain");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyToDomain") == null) {
            _myOperations.put("currencyToDomain", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyToDomain")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "returnLocale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvReturnLocale"), com.currencysystem.webservices.currencyserver.CurncsrvReturnLocale.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyToLocale", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyToLocaleResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyToLocale"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyToLocale");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyToLocale") == null) {
            _myOperations.put("currencyToLocale", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyToLocale")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyCustom", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyCustomResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyCustom"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyCustom");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyCustom") == null) {
            _myOperations.put("currencyCustom", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyCustom")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "denomination"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvEntityDenomination"), com.currencysystem.webservices.currencyserver.CurncsrvEntityDenomination.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "titleStyle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyEntity", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyEntityResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyEntity"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyEntity");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyEntity") == null) {
            _myOperations.put("currencyEntity", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyEntity")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "activeOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyExists", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyExistsResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyExists"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyExists");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyExists") == null) {
            _myOperations.put("currencyExists", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyExists")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyFeeds", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyFeedsResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyFeeds"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyFeeds");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyFeeds") == null) {
            _myOperations.put("currencyFeeds", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyFeeds")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyHits", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyHitsResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyHits"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyHits");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyHits") == null) {
            _myOperations.put("currencyHits", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyHits")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyLegalTender", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyLegalTenderResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyLegalTender"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyLegalTender");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyLegalTender") == null) {
            _myOperations.put("currencyLegalTender", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyLegalTender")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "titleStyle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyName", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyNameResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyName"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyName");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyName") == null) {
            _myOperations.put("currencyName", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyName")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyPhysical", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyPhysicalResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyPhysical"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyPhysical");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyPhysical") == null) {
            _myOperations.put("currencyPhysical", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyPhysical")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyPopularity", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyPopularityResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyPopularity"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyPopularity");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyPopularity") == null) {
            _myOperations.put("currencyPopularity", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyPopularity")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyRegime", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyRegimeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyRegime"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyRegime");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyRegime") == null) {
            _myOperations.put("currencyRegime", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyRegime")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencySmallestUnit", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencySmallestUnitResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencySmallestUnit"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencySmallestUnit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencySmallestUnit") == null) {
            _myOperations.put("currencySmallestUnit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencySmallestUnit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "inflection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvSubunitInflection"), com.currencysystem.webservices.currencyserver.CurncsrvSubunitInflection.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "titleStyle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencySubunit", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencySubunitResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencySubunit"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencySubunit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencySubunit") == null) {
            _myOperations.put("currencySubunit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencySubunit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencySymbol", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencySymbolResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencySymbol"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencySymbol");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencySymbol") == null) {
            _myOperations.put("currencySymbol", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencySymbol")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyTriangulation", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyTriangulationResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyTriangulation"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyTriangulation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyTriangulation") == null) {
            _myOperations.put("currencyTriangulation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyTriangulation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "inflection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvUnitInflection"), com.currencysystem.webservices.currencyserver.CurncsrvUnitInflection.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "titleStyle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyUnit", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyUnitResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyUnit"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyUnit");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyUnit") == null) {
            _myOperations.put("currencyUnit", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyUnit")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("currencyWarning", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyWarningResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "CurrencyWarning"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/CurrencyWarning");
        _myOperationsList.add(_oper);
        if (_myOperations.get("currencyWarning") == null) {
            _myOperations.put("currencyWarning", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("currencyWarning")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "domain"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "activeOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("domainToCurrency", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "DomainToCurrencyResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "DomainToCurrency"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/DomainToCurrency");
        _myOperationsList.add(_oper);
        if (_myOperations.get("domainToCurrency") == null) {
            _myOperations.put("domainToCurrency", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("domainToCurrency")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "format"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "encoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "baseCurrency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "flags"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "serviceLicenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "serviceExpirationTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "serviceRenewalURL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "errorCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "errorMessage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("export", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "ExportResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "Export"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/Export");
        _myOperationsList.add(_oper);
        if (_myOperations.get("export") == null) {
            _myOperations.put("export", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("export")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "locale"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "activeOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("localeToCurrency", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "LocaleToCurrencyResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "LocaleToCurrency"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/LocaleToCurrency");
        _myOperationsList.add(_oper);
        if (_myOperations.get("localeToCurrency") == null) {
            _myOperations.put("localeToCurrency", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("localeToCurrency")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("message", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "MessageResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "Message"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/Message");
        _myOperationsList.add(_oper);
        if (_myOperations.get("message") == null) {
            _myOperations.put("message", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("message")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "baseCurrency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "toCurrency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "rounding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "format"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "returnRate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvReturnRate"), com.currencysystem.webservices.currencyserver.CurncsrvReturnRate.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rate", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "RateResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "Rate"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/Rate");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rate") == null) {
            _myOperations.put("rate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rate")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("source", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "SourceResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "Source"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/Source");
        _myOperationsList.add(_oper);
        if (_myOperations.get("source") == null) {
            _myOperations.put("source", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("source")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "currencies"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "information"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvTimeInformation"), com.currencysystem.webservices.currencyserver.CurncsrvTimeInformation.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "priority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvTimePriority"), com.currencysystem.webservices.currencyserver.CurncsrvTimePriority.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "returnTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "curncsrvReturnTime"), com.currencysystem.webservices.currencyserver.CurncsrvReturnTime.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("time", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "TimeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "Time"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/Time");
        _myOperationsList.add(_oper);
        if (_myOperations.get("time") == null) {
            _myOperations.put("time", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("time")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "licenseKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("version", _params, new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "VersionResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://webservices.currencysystem.com/currencyserver/", "Version"));
        _oper.setSoapAction("http://webservices.currencysystem.com/currencyserver/Version");
        _myOperationsList.add(_oper);
        if (_myOperations.get("version") == null) {
            _myOperations.put("version", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("version")).add(_oper);
    }

    public CurrencyServerSoapSkeleton() {
        this.impl = new com.currencysystem.webservices.currencyserver.CurrencyServerSoapImpl();
    }

    public CurrencyServerSoapSkeleton(com.currencysystem.webservices.currencyserver.CurrencyServerSoap impl) {
        this.impl = impl;
    }
    public java.lang.String activeCurrencies(java.lang.String licenseKey) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.activeCurrencies(licenseKey);
        return ret;
    }

    public void adminFXFeed(java.lang.String licenseKey, java.lang.String feedID, java.lang.String URL, java.lang.String userID, java.lang.String userName, java.lang.String password, com.currencysystem.webservices.currencyserver.CurncsrvFXFeedAction action) throws java.rmi.RemoteException
    {
        impl.adminFXFeed(licenseKey, feedID, URL, userID, userName, password, action);
    }

    public void adminFXMode(java.lang.String licenseKey, com.currencysystem.webservices.currencyserver.CurncsrvFXModeMultiple multiple, com.currencysystem.webservices.currencyserver.CurncsrvFXModeLock lockCurrencies) throws java.rmi.RemoteException
    {
        impl.adminFXMode(licenseKey, multiple, lockCurrencies);
    }

    public void adminLoad(java.lang.String licenseKey, java.lang.String file) throws java.rmi.RemoteException
    {
        impl.adminLoad(licenseKey, file);
    }

    public void adminMessage(java.lang.String licenseKey, java.lang.String text, com.currencysystem.webservices.currencyserver.CurncsrvMessageType type) throws java.rmi.RemoteException
    {
        impl.adminMessage(licenseKey, text, type);
    }

    public void adminReset(java.lang.String licenseKey, com.currencysystem.webservices.currencyserver.CurncsrvResetFlags flags) throws java.rmi.RemoteException
    {
        impl.adminReset(licenseKey, flags);
    }

    public void adminSave(java.lang.String licenseKey, java.lang.String file) throws java.rmi.RemoteException
    {
        impl.adminSave(licenseKey, file);
    }

    public void adminUpdateNow(java.lang.String licenseKey) throws java.rmi.RemoteException
    {
        impl.adminUpdateNow(licenseKey);
    }

    public java.lang.String allCurrencies(java.lang.String licenseKey) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.allCurrencies(licenseKey);
        return ret;
    }

    public java.lang.Object convert(java.lang.String licenseKey, java.lang.String fromCurrency, java.lang.String toCurrency, double amount, boolean rounding, java.lang.String format, com.currencysystem.webservices.currencyserver.CurncsrvReturnRate returnRate, java.lang.String time, java.lang.String type) throws java.rmi.RemoteException
    {
        java.lang.Object ret = impl.convert(licenseKey, fromCurrency, toCurrency, amount, rounding, format, returnRate, time, type);
        return ret;
    }

    public java.lang.String copyright(java.lang.String licenseKey) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.copyright(licenseKey);
        return ret;
    }

    public java.lang.String countryToCurrency(java.lang.String licenseKey, java.lang.String country, boolean activeOnly) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.countryToCurrency(licenseKey, country, activeOnly);
        return ret;
    }

    public java.lang.Object currencyToCountry(java.lang.String licenseKey, java.lang.String currency, com.currencysystem.webservices.currencyserver.CurncsrvReturnCountry returnCountry) throws java.rmi.RemoteException
    {
        java.lang.Object ret = impl.currencyToCountry(licenseKey, currency, returnCountry);
        return ret;
    }

    public java.lang.String currencyToDomain(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencyToDomain(licenseKey, currency);
        return ret;
    }

    public java.lang.Object currencyToLocale(java.lang.String licenseKey, java.lang.String currency, com.currencysystem.webservices.currencyserver.CurncsrvReturnLocale returnLocale) throws java.rmi.RemoteException
    {
        java.lang.Object ret = impl.currencyToLocale(licenseKey, currency, returnLocale);
        return ret;
    }

    public java.lang.String currencyCustom(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencyCustom(licenseKey, currency, locale);
        return ret;
    }

    public java.lang.String currencyEntity(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale, com.currencysystem.webservices.currencyserver.CurncsrvEntityDenomination denomination, boolean titleStyle) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencyEntity(licenseKey, currency, locale, denomination, titleStyle);
        return ret;
    }

    public boolean currencyExists(java.lang.String licenseKey, java.lang.String currency, boolean activeOnly) throws java.rmi.RemoteException
    {
        boolean ret = impl.currencyExists(licenseKey, currency, activeOnly);
        return ret;
    }

    public long currencyFeeds(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        long ret = impl.currencyFeeds(licenseKey, currency);
        return ret;
    }

    public long currencyHits(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        long ret = impl.currencyHits(licenseKey, currency);
        return ret;
    }

    public boolean currencyLegalTender(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        boolean ret = impl.currencyLegalTender(licenseKey, currency);
        return ret;
    }

    public java.lang.String currencyName(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale, boolean titleStyle) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencyName(licenseKey, currency, locale, titleStyle);
        return ret;
    }

    public boolean currencyPhysical(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        boolean ret = impl.currencyPhysical(licenseKey, currency);
        return ret;
    }

    public long currencyPopularity(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        long ret = impl.currencyPopularity(licenseKey, currency);
        return ret;
    }

    public java.lang.String currencyRegime(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencyRegime(licenseKey, currency);
        return ret;
    }

    public java.lang.String currencySmallestUnit(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencySmallestUnit(licenseKey, currency);
        return ret;
    }

    public java.lang.String currencySubunit(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale, com.currencysystem.webservices.currencyserver.CurncsrvSubunitInflection inflection, boolean titleStyle) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencySubunit(licenseKey, currency, locale, inflection, titleStyle);
        return ret;
    }

    public java.lang.String currencySymbol(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencySymbol(licenseKey, currency, locale);
        return ret;
    }

    public boolean currencyTriangulation(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        boolean ret = impl.currencyTriangulation(licenseKey, currency);
        return ret;
    }

    public java.lang.String currencyUnit(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale, com.currencysystem.webservices.currencyserver.CurncsrvUnitInflection inflection, boolean titleStyle) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.currencyUnit(licenseKey, currency, locale, inflection, titleStyle);
        return ret;
    }

    public boolean currencyWarning(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException
    {
        boolean ret = impl.currencyWarning(licenseKey, currency);
        return ret;
    }

    public java.lang.String domainToCurrency(java.lang.String licenseKey, java.lang.String domain, boolean activeOnly) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.domainToCurrency(licenseKey, domain, activeOnly);
        return ret;
    }

    public java.lang.String export(java.lang.String licenseKey, java.lang.String format, java.lang.String encoding, java.lang.String baseCurrency, java.lang.String locale, java.lang.String flags, java.lang.String serviceLicenseKey, java.lang.String serviceExpirationTime, java.lang.String serviceRenewalURL, java.lang.String errorCode, java.lang.String errorMessage, java.lang.String time, java.lang.String type) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.export(licenseKey, format, encoding, baseCurrency, locale, flags, serviceLicenseKey, serviceExpirationTime, serviceRenewalURL, errorCode, errorMessage, time, type);
        return ret;
    }

    public java.lang.String localeToCurrency(java.lang.String licenseKey, java.lang.String locale, boolean activeOnly) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.localeToCurrency(licenseKey, locale, activeOnly);
        return ret;
    }

    public java.lang.String message(java.lang.String licenseKey) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.message(licenseKey);
        return ret;
    }

    public java.lang.Object rate(java.lang.String licenseKey, java.lang.String baseCurrency, java.lang.String toCurrency, boolean rounding, java.lang.String format, com.currencysystem.webservices.currencyserver.CurncsrvReturnRate returnRate, java.lang.String time, java.lang.String type) throws java.rmi.RemoteException
    {
        java.lang.Object ret = impl.rate(licenseKey, baseCurrency, toCurrency, rounding, format, returnRate, time, type);
        return ret;
    }

    public java.lang.String source(java.lang.String licenseKey) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.source(licenseKey);
        return ret;
    }

    public java.lang.Object time(java.lang.String licenseKey, java.lang.String currencies, com.currencysystem.webservices.currencyserver.CurncsrvTimeInformation information, com.currencysystem.webservices.currencyserver.CurncsrvTimePriority priority, com.currencysystem.webservices.currencyserver.CurncsrvReturnTime returnTime, java.lang.String time, java.lang.String type) throws java.rmi.RemoteException
    {
        java.lang.Object ret = impl.time(licenseKey, currencies, information, priority, returnTime, time, type);
        return ret;
    }

    public java.lang.String version(java.lang.String licenseKey) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.version(licenseKey);
        return ret;
    }

}
