//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.31 at 04:10:34 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: QBO
 * 				Description: Specifies various fields
 * 				required for emailing different transaction
 * 			
 * 
 * <p>Java class for EmailDeliveryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailDeliveryInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="DeliveryAddress" type="{http://schema.intuit.com/finance/v3}EmailAddress" minOccurs="0"/>
 *         &lt;element name="DeliveryAddressCc" type="{http://schema.intuit.com/finance/v3}EmailAddress" minOccurs="0"/>
 *         &lt;element name="DeliveryAddressBcc" type="{http://schema.intuit.com/finance/v3}EmailAddress" minOccurs="0"/>
 *         &lt;element name="EmailMessage" type="{http://schema.intuit.com/finance/v3}EmailMessage" minOccurs="0"/>
 *         &lt;element name="AllowOnlinePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowOnlineCreditCardPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowOnlineACHPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeliveryInfo" type="{http://schema.intuit.com/finance/v3}TransactionDeliveryInfo" minOccurs="0"/>
 *         &lt;element name="ETransactionStatus" type="{http://schema.intuit.com/finance/v3}ETransactionStatusEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailDeliveryInfo", propOrder = {
    "deliveryAddress",
    "deliveryAddressCc",
    "deliveryAddressBcc",
    "emailMessage",
    "allowOnlinePayment",
    "allowOnlineCreditCardPayment",
    "allowOnlineACHPayment",
    "deliveryInfo",
    "eTransactionStatus"
})
public class EmailDeliveryInfo
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DeliveryAddress")
    protected EmailAddress deliveryAddress;
    @XmlElement(name = "DeliveryAddressCc")
    protected EmailAddress deliveryAddressCc;
    @XmlElement(name = "DeliveryAddressBcc")
    protected EmailAddress deliveryAddressBcc;
    @XmlElement(name = "EmailMessage")
    protected EmailMessage emailMessage;
    @XmlElement(name = "AllowOnlinePayment")
    protected Boolean allowOnlinePayment;
    @XmlElement(name = "AllowOnlineCreditCardPayment")
    protected Boolean allowOnlineCreditCardPayment;
    @XmlElement(name = "AllowOnlineACHPayment")
    protected Boolean allowOnlineACHPayment;
    @XmlElement(name = "DeliveryInfo")
    protected TransactionDeliveryInfo deliveryInfo;
    @XmlElement(name = "ETransactionStatus")
    protected ETransactionStatusEnum eTransactionStatus;

    /**
     * Gets the value of the deliveryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    /**
     * Sets the value of the deliveryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setDeliveryAddress(EmailAddress value) {
        this.deliveryAddress = value;
    }

    /**
     * Gets the value of the deliveryAddressCc property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getDeliveryAddressCc() {
        return deliveryAddressCc;
    }

    /**
     * Sets the value of the deliveryAddressCc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setDeliveryAddressCc(EmailAddress value) {
        this.deliveryAddressCc = value;
    }

    /**
     * Gets the value of the deliveryAddressBcc property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getDeliveryAddressBcc() {
        return deliveryAddressBcc;
    }

    /**
     * Sets the value of the deliveryAddressBcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setDeliveryAddressBcc(EmailAddress value) {
        this.deliveryAddressBcc = value;
    }

    /**
     * Gets the value of the emailMessage property.
     * 
     * @return
     *     possible object is
     *     {@link EmailMessage }
     *     
     */
    public EmailMessage getEmailMessage() {
        return emailMessage;
    }

    /**
     * Sets the value of the emailMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailMessage }
     *     
     */
    public void setEmailMessage(EmailMessage value) {
        this.emailMessage = value;
    }

    /**
     * Gets the value of the allowOnlinePayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOnlinePayment() {
        return allowOnlinePayment;
    }

    /**
     * Sets the value of the allowOnlinePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOnlinePayment(Boolean value) {
        this.allowOnlinePayment = value;
    }

    /**
     * Gets the value of the allowOnlineCreditCardPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOnlineCreditCardPayment() {
        return allowOnlineCreditCardPayment;
    }

    /**
     * Sets the value of the allowOnlineCreditCardPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOnlineCreditCardPayment(Boolean value) {
        this.allowOnlineCreditCardPayment = value;
    }

    /**
     * Gets the value of the allowOnlineACHPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOnlineACHPayment() {
        return allowOnlineACHPayment;
    }

    /**
     * Sets the value of the allowOnlineACHPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOnlineACHPayment(Boolean value) {
        this.allowOnlineACHPayment = value;
    }

    /**
     * Gets the value of the deliveryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDeliveryInfo }
     *     
     */
    public TransactionDeliveryInfo getDeliveryInfo() {
        return deliveryInfo;
    }

    /**
     * Sets the value of the deliveryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDeliveryInfo }
     *     
     */
    public void setDeliveryInfo(TransactionDeliveryInfo value) {
        this.deliveryInfo = value;
    }

    /**
     * Gets the value of the eTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ETransactionStatusEnum }
     *     
     */
    public ETransactionStatusEnum getETransactionStatus() {
        return eTransactionStatus;
    }

    /**
     * Sets the value of the eTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETransactionStatusEnum }
     *     
     */
    public void setETransactionStatus(ETransactionStatusEnum value) {
        this.eTransactionStatus = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EmailDeliveryInfo that = ((EmailDeliveryInfo) object);
        {
            EmailAddress lhsDeliveryAddress;
            lhsDeliveryAddress = this.getDeliveryAddress();
            EmailAddress rhsDeliveryAddress;
            rhsDeliveryAddress = that.getDeliveryAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryAddress", lhsDeliveryAddress), LocatorUtils.property(thatLocator, "deliveryAddress", rhsDeliveryAddress), lhsDeliveryAddress, rhsDeliveryAddress, (this.deliveryAddress!= null), (that.deliveryAddress!= null))) {
                return false;
            }
        }
        {
            EmailAddress lhsDeliveryAddressCc;
            lhsDeliveryAddressCc = this.getDeliveryAddressCc();
            EmailAddress rhsDeliveryAddressCc;
            rhsDeliveryAddressCc = that.getDeliveryAddressCc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryAddressCc", lhsDeliveryAddressCc), LocatorUtils.property(thatLocator, "deliveryAddressCc", rhsDeliveryAddressCc), lhsDeliveryAddressCc, rhsDeliveryAddressCc, (this.deliveryAddressCc!= null), (that.deliveryAddressCc!= null))) {
                return false;
            }
        }
        {
            EmailAddress lhsDeliveryAddressBcc;
            lhsDeliveryAddressBcc = this.getDeliveryAddressBcc();
            EmailAddress rhsDeliveryAddressBcc;
            rhsDeliveryAddressBcc = that.getDeliveryAddressBcc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryAddressBcc", lhsDeliveryAddressBcc), LocatorUtils.property(thatLocator, "deliveryAddressBcc", rhsDeliveryAddressBcc), lhsDeliveryAddressBcc, rhsDeliveryAddressBcc, (this.deliveryAddressBcc!= null), (that.deliveryAddressBcc!= null))) {
                return false;
            }
        }
        {
            EmailMessage lhsEmailMessage;
            lhsEmailMessage = this.getEmailMessage();
            EmailMessage rhsEmailMessage;
            rhsEmailMessage = that.getEmailMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailMessage", lhsEmailMessage), LocatorUtils.property(thatLocator, "emailMessage", rhsEmailMessage), lhsEmailMessage, rhsEmailMessage, (this.emailMessage!= null), (that.emailMessage!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAllowOnlinePayment;
            lhsAllowOnlinePayment = this.isAllowOnlinePayment();
            Boolean rhsAllowOnlinePayment;
            rhsAllowOnlinePayment = that.isAllowOnlinePayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowOnlinePayment", lhsAllowOnlinePayment), LocatorUtils.property(thatLocator, "allowOnlinePayment", rhsAllowOnlinePayment), lhsAllowOnlinePayment, rhsAllowOnlinePayment, (this.allowOnlinePayment!= null), (that.allowOnlinePayment!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAllowOnlineCreditCardPayment;
            lhsAllowOnlineCreditCardPayment = this.isAllowOnlineCreditCardPayment();
            Boolean rhsAllowOnlineCreditCardPayment;
            rhsAllowOnlineCreditCardPayment = that.isAllowOnlineCreditCardPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowOnlineCreditCardPayment", lhsAllowOnlineCreditCardPayment), LocatorUtils.property(thatLocator, "allowOnlineCreditCardPayment", rhsAllowOnlineCreditCardPayment), lhsAllowOnlineCreditCardPayment, rhsAllowOnlineCreditCardPayment, (this.allowOnlineCreditCardPayment!= null), (that.allowOnlineCreditCardPayment!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAllowOnlineACHPayment;
            lhsAllowOnlineACHPayment = this.isAllowOnlineACHPayment();
            Boolean rhsAllowOnlineACHPayment;
            rhsAllowOnlineACHPayment = that.isAllowOnlineACHPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowOnlineACHPayment", lhsAllowOnlineACHPayment), LocatorUtils.property(thatLocator, "allowOnlineACHPayment", rhsAllowOnlineACHPayment), lhsAllowOnlineACHPayment, rhsAllowOnlineACHPayment, (this.allowOnlineACHPayment!= null), (that.allowOnlineACHPayment!= null))) {
                return false;
            }
        }
        {
            TransactionDeliveryInfo lhsDeliveryInfo;
            lhsDeliveryInfo = this.getDeliveryInfo();
            TransactionDeliveryInfo rhsDeliveryInfo;
            rhsDeliveryInfo = that.getDeliveryInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deliveryInfo", lhsDeliveryInfo), LocatorUtils.property(thatLocator, "deliveryInfo", rhsDeliveryInfo), lhsDeliveryInfo, rhsDeliveryInfo, (this.deliveryInfo!= null), (that.deliveryInfo!= null))) {
                return false;
            }
        }
        {
            ETransactionStatusEnum lhsETransactionStatus;
            lhsETransactionStatus = this.getETransactionStatus();
            ETransactionStatusEnum rhsETransactionStatus;
            rhsETransactionStatus = that.getETransactionStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eTransactionStatus", lhsETransactionStatus), LocatorUtils.property(thatLocator, "eTransactionStatus", rhsETransactionStatus), lhsETransactionStatus, rhsETransactionStatus, (this.eTransactionStatus!= null), (that.eTransactionStatus!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            EmailAddress theDeliveryAddress;
            theDeliveryAddress = this.getDeliveryAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryAddress", theDeliveryAddress), currentHashCode, theDeliveryAddress, (this.deliveryAddress!= null));
        }
        {
            EmailAddress theDeliveryAddressCc;
            theDeliveryAddressCc = this.getDeliveryAddressCc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryAddressCc", theDeliveryAddressCc), currentHashCode, theDeliveryAddressCc, (this.deliveryAddressCc!= null));
        }
        {
            EmailAddress theDeliveryAddressBcc;
            theDeliveryAddressBcc = this.getDeliveryAddressBcc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryAddressBcc", theDeliveryAddressBcc), currentHashCode, theDeliveryAddressBcc, (this.deliveryAddressBcc!= null));
        }
        {
            EmailMessage theEmailMessage;
            theEmailMessage = this.getEmailMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emailMessage", theEmailMessage), currentHashCode, theEmailMessage, (this.emailMessage!= null));
        }
        {
            Boolean theAllowOnlinePayment;
            theAllowOnlinePayment = this.isAllowOnlinePayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowOnlinePayment", theAllowOnlinePayment), currentHashCode, theAllowOnlinePayment, (this.allowOnlinePayment!= null));
        }
        {
            Boolean theAllowOnlineCreditCardPayment;
            theAllowOnlineCreditCardPayment = this.isAllowOnlineCreditCardPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowOnlineCreditCardPayment", theAllowOnlineCreditCardPayment), currentHashCode, theAllowOnlineCreditCardPayment, (this.allowOnlineCreditCardPayment!= null));
        }
        {
            Boolean theAllowOnlineACHPayment;
            theAllowOnlineACHPayment = this.isAllowOnlineACHPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowOnlineACHPayment", theAllowOnlineACHPayment), currentHashCode, theAllowOnlineACHPayment, (this.allowOnlineACHPayment!= null));
        }
        {
            TransactionDeliveryInfo theDeliveryInfo;
            theDeliveryInfo = this.getDeliveryInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deliveryInfo", theDeliveryInfo), currentHashCode, theDeliveryInfo, (this.deliveryInfo!= null));
        }
        {
            ETransactionStatusEnum theETransactionStatus;
            theETransactionStatus = this.getETransactionStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eTransactionStatus", theETransactionStatus), currentHashCode, theETransactionStatus, (this.eTransactionStatus!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
