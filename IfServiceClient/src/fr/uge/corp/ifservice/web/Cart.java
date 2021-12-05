/**
 * Cart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.uge.corp.ifservice.web;

public class Cart  implements java.io.Serializable {
    private fr.uge.corp.ifservice.common.Product[] cart;

    private java.lang.String cartDescription;

    public Cart() {
    }

    public Cart(
           fr.uge.corp.ifservice.common.Product[] cart,
           java.lang.String cartDescription) {
           this.cart = cart;
           this.cartDescription = cartDescription;
    }


    /**
     * Gets the cart value for this Cart.
     * 
     * @return cart
     */
    public fr.uge.corp.ifservice.common.Product[] getCart() {
        return cart;
    }


    /**
     * Sets the cart value for this Cart.
     * 
     * @param cart
     */
    public void setCart(fr.uge.corp.ifservice.common.Product[] cart) {
        this.cart = cart;
    }


    /**
     * Gets the cartDescription value for this Cart.
     * 
     * @return cartDescription
     */
    public java.lang.String getCartDescription() {
        return cartDescription;
    }


    /**
     * Sets the cartDescription value for this Cart.
     * 
     * @param cartDescription
     */
    public void setCartDescription(java.lang.String cartDescription) {
        this.cartDescription = cartDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cart)) return false;
        Cart other = (Cart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cart==null && other.getCart()==null) || 
             (this.cart!=null &&
              java.util.Arrays.equals(this.cart, other.getCart()))) &&
            ((this.cartDescription==null && other.getCartDescription()==null) || 
             (this.cartDescription!=null &&
              this.cartDescription.equals(other.getCartDescription())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCart() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCart());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCart(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCartDescription() != null) {
            _hashCode += getCartDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://web.ifservice.corp.uge.fr", "Cart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.ifservice.corp.uge.fr", "cart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.ifservice.corp.uge.fr", "Product"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://web.ifservice.corp.uge.fr", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://web.ifservice.corp.uge.fr", "cartDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
