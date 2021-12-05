/**
 * CurrencyServerSoapImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.currencysystem.webservices.currencyserver;

public class CurrencyServerSoapImpl implements com.currencysystem.webservices.currencyserver.CurrencyServerSoap{
    public java.lang.String activeCurrencies(java.lang.String licenseKey) throws java.rmi.RemoteException {
        return null;
    }

    public void adminFXFeed(java.lang.String licenseKey, java.lang.String feedID, java.lang.String URL, java.lang.String userID, java.lang.String userName, java.lang.String password, com.currencysystem.webservices.currencyserver.CurncsrvFXFeedAction action) throws java.rmi.RemoteException {
    }

    public void adminFXMode(java.lang.String licenseKey, com.currencysystem.webservices.currencyserver.CurncsrvFXModeMultiple multiple, com.currencysystem.webservices.currencyserver.CurncsrvFXModeLock lockCurrencies) throws java.rmi.RemoteException {
    }

    public void adminLoad(java.lang.String licenseKey, java.lang.String file) throws java.rmi.RemoteException {
    }

    public void adminMessage(java.lang.String licenseKey, java.lang.String text, com.currencysystem.webservices.currencyserver.CurncsrvMessageType type) throws java.rmi.RemoteException {
    }

    public void adminReset(java.lang.String licenseKey, com.currencysystem.webservices.currencyserver.CurncsrvResetFlags flags) throws java.rmi.RemoteException {
    }

    public void adminSave(java.lang.String licenseKey, java.lang.String file) throws java.rmi.RemoteException {
    }

    public void adminUpdateNow(java.lang.String licenseKey) throws java.rmi.RemoteException {
    }

    public java.lang.String allCurrencies(java.lang.String licenseKey) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.Object convert(java.lang.String licenseKey, java.lang.String fromCurrency, java.lang.String toCurrency, double amount, boolean rounding, java.lang.String format, com.currencysystem.webservices.currencyserver.CurncsrvReturnRate returnRate, java.lang.String time, java.lang.String type) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String copyright(java.lang.String licenseKey) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String countryToCurrency(java.lang.String licenseKey, java.lang.String country, boolean activeOnly) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.Object currencyToCountry(java.lang.String licenseKey, java.lang.String currency, com.currencysystem.webservices.currencyserver.CurncsrvReturnCountry returnCountry) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String currencyToDomain(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.Object currencyToLocale(java.lang.String licenseKey, java.lang.String currency, com.currencysystem.webservices.currencyserver.CurncsrvReturnLocale returnLocale) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String currencyCustom(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String currencyEntity(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale, com.currencysystem.webservices.currencyserver.CurncsrvEntityDenomination denomination, boolean titleStyle) throws java.rmi.RemoteException {
        return null;
    }

    public boolean currencyExists(java.lang.String licenseKey, java.lang.String currency, boolean activeOnly) throws java.rmi.RemoteException {
        return false;
    }

    public long currencyFeeds(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return -3;
    }

    public long currencyHits(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return -3;
    }

    public boolean currencyLegalTender(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return false;
    }

    public java.lang.String currencyName(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale, boolean titleStyle) throws java.rmi.RemoteException {
        return null;
    }

    public boolean currencyPhysical(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return false;
    }

    public long currencyPopularity(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return -3;
    }

    public java.lang.String currencyRegime(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String currencySmallestUnit(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String currencySubunit(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale, com.currencysystem.webservices.currencyserver.CurncsrvSubunitInflection inflection, boolean titleStyle) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String currencySymbol(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale) throws java.rmi.RemoteException {
        return null;
    }

    public boolean currencyTriangulation(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return false;
    }

    public java.lang.String currencyUnit(java.lang.String licenseKey, java.lang.String currency, java.lang.String locale, com.currencysystem.webservices.currencyserver.CurncsrvUnitInflection inflection, boolean titleStyle) throws java.rmi.RemoteException {
        return null;
    }

    public boolean currencyWarning(java.lang.String licenseKey, java.lang.String currency) throws java.rmi.RemoteException {
        return false;
    }

    public java.lang.String domainToCurrency(java.lang.String licenseKey, java.lang.String domain, boolean activeOnly) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String export(java.lang.String licenseKey, java.lang.String format, java.lang.String encoding, java.lang.String baseCurrency, java.lang.String locale, java.lang.String flags, java.lang.String serviceLicenseKey, java.lang.String serviceExpirationTime, java.lang.String serviceRenewalURL, java.lang.String errorCode, java.lang.String errorMessage, java.lang.String time, java.lang.String type) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String localeToCurrency(java.lang.String licenseKey, java.lang.String locale, boolean activeOnly) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String message(java.lang.String licenseKey) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.Object rate(java.lang.String licenseKey, java.lang.String baseCurrency, java.lang.String toCurrency, boolean rounding, java.lang.String format, com.currencysystem.webservices.currencyserver.CurncsrvReturnRate returnRate, java.lang.String time, java.lang.String type) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String source(java.lang.String licenseKey) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.Object time(java.lang.String licenseKey, java.lang.String currencies, com.currencysystem.webservices.currencyserver.CurncsrvTimeInformation information, com.currencysystem.webservices.currencyserver.CurncsrvTimePriority priority, com.currencysystem.webservices.currencyserver.CurncsrvReturnTime returnTime, java.lang.String time, java.lang.String type) throws java.rmi.RemoteException {
        return null;
    }

    public java.lang.String version(java.lang.String licenseKey) throws java.rmi.RemoteException {
        return null;
    }

}
