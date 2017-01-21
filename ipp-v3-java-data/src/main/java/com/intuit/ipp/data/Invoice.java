//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.14 at 04:24:27 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: QBO
 * 				Description: The Invoice entity
 * 				represents an invoice to a customer. Invoice could be based on
 * 				salesterm with invoice and due dates for payment. Invoice supports
 * 				sales tax, and shipping charges as a special line item. Invoice can
 * 				be printed and emailed to a customer.
 * 				Business Rules: [li] An invoice
 * 				must have at least one line that describes the item and an
 * 				amount.[/li][li] An invoice must have a reference to a customer in
 * 				the header.[/li]
 * 				Product: QBW
 * 				Description: An Invoice is a financial transaction representing
 * 				a request for payment for goods or services that have been sold. An
 * 				invoice is a form that records the details of a customer's purchase,
 * 				such as quantity and price of the goods or services. An invoice
 * 				records the amount owed by a customer who does not pay in full at
 * 				the time of purchase. If full payment is received at the time of
 * 				purchase, the sale may be recorded as a sales receipt, not an
 * 				invoice. An invoice must contain a valid customer reference in the
 * 				CustomerId field and at least one line item. The referenced customer
 * 				must already exist in the QuickBooks company at the desktop and any
 * 				line items must also already exists in the QuickBooks company, or
 * 				the attempt to sync will fail.[br /]In general, it is a good
 * 				practice to specify all the header fields if you have the data. You
 * 				should always specify the ARAccountId; otherwise a default AR
 * 				account will be used and this may give you unexpected results.[/br]
 * 				If you want to apply one tax to all the transaction line items, use
 * 				the TaxId or TaxGroupId field. If you want to use more than one tax,
 * 				you need to use Tax Line items instead.
 * 				Business Rules: [li] An
 * 				invoice must have at least one line that describes the item.
 * 				[/li][li] If an account is specified in the header, the account must
 * 				be of the Accounts Receivable (AR) type. [/li][li] An invoice must
 * 				have a reference to a customer in the header.[/li]
 * 			
 * 
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}SalesTransaction">
 *       &lt;sequence>
 *         &lt;element name="Deposit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AllowIPNPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowOnlinePayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowOnlineCreditCardPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowOnlineACHPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EInvoiceStatus" type="{http://schema.intuit.com/finance/v3}ETransactionStatusEnum" minOccurs="0"/>
 *         &lt;element name="ECloudStatusTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="invoiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="callToAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceStatusLog" type="{http://schema.intuit.com/finance/v3}StatusInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvoiceEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = {
    "deposit",
    "allowIPNPayment",
    "allowOnlinePayment",
    "allowOnlineCreditCardPayment",
    "allowOnlineACHPayment",
    "eInvoiceStatus",
    "eCloudStatusTimeStamp",
    "invoiceStatus",
    "callToAction",
    "invoiceStatusLog",
    "invoiceEx"
})
public class Invoice
    extends SalesTransaction
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Deposit")
    protected BigDecimal deposit;
    @XmlElement(name = "AllowIPNPayment")
    protected Boolean allowIPNPayment;
    @XmlElement(name = "AllowOnlinePayment")
    protected Boolean allowOnlinePayment;
    @XmlElement(name = "AllowOnlineCreditCardPayment")
    protected Boolean allowOnlineCreditCardPayment;
    @XmlElement(name = "AllowOnlineACHPayment")
    protected Boolean allowOnlineACHPayment;
    @XmlElement(name = "EInvoiceStatus")
    protected ETransactionStatusEnum eInvoiceStatus;
    @XmlElement(name = "ECloudStatusTimeStamp", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date eCloudStatusTimeStamp;
    protected String invoiceStatus;
    protected String callToAction;
    protected List<StatusInfo> invoiceStatusLog;
    @XmlElement(name = "InvoiceEx")
    protected IntuitAnyType invoiceEx;

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeposit(BigDecimal value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the allowIPNPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowIPNPayment() {
        return allowIPNPayment;
    }

    /**
     * Sets the value of the allowIPNPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowIPNPayment(Boolean value) {
        this.allowIPNPayment = value;
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
     * Gets the value of the eInvoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ETransactionStatusEnum }
     *     
     */
    public ETransactionStatusEnum getEInvoiceStatus() {
        return eInvoiceStatus;
    }

    /**
     * Sets the value of the eInvoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETransactionStatusEnum }
     *     
     */
    public void setEInvoiceStatus(ETransactionStatusEnum value) {
        this.eInvoiceStatus = value;
    }

    /**
     * Gets the value of the eCloudStatusTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getECloudStatusTimeStamp() {
        return eCloudStatusTimeStamp;
    }

    /**
     * Sets the value of the eCloudStatusTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECloudStatusTimeStamp(Date value) {
        this.eCloudStatusTimeStamp = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatus(String value) {
        this.invoiceStatus = value;
    }

    /**
     * Gets the value of the callToAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToAction() {
        return callToAction;
    }

    /**
     * Sets the value of the callToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallToAction(String value) {
        this.callToAction = value;
    }

    /**
     * Gets the value of the invoiceStatusLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceStatusLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceStatusLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInfo }
     * 
     * 
     */
    public List<StatusInfo> getInvoiceStatusLog() {
        if (invoiceStatusLog == null) {
            invoiceStatusLog = new ArrayList<StatusInfo>();
        }
        return this.invoiceStatusLog;
    }

    /**
     * Gets the value of the invoiceEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getInvoiceEx() {
        return invoiceEx;
    }

    /**
     * Sets the value of the invoiceEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setInvoiceEx(IntuitAnyType value) {
        this.invoiceEx = value;
    }

    /**
     * Sets the value of the invoiceStatusLog property.
     * 
     * @param invoiceStatusLog
     *     allowed object is
     *     {@link StatusInfo }
     *     
     */
    public void setInvoiceStatusLog(List<StatusInfo> invoiceStatusLog) {
        this.invoiceStatusLog = invoiceStatusLog;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Invoice)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Invoice that = ((Invoice) object);
        {
            BigDecimal lhsDeposit;
            lhsDeposit = this.getDeposit();
            BigDecimal rhsDeposit;
            rhsDeposit = that.getDeposit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deposit", lhsDeposit), LocatorUtils.property(thatLocator, "deposit", rhsDeposit), lhsDeposit, rhsDeposit)) {
                return false;
            }
        }
        {
            Boolean lhsAllowIPNPayment;
            lhsAllowIPNPayment = this.isAllowIPNPayment();
            Boolean rhsAllowIPNPayment;
            rhsAllowIPNPayment = that.isAllowIPNPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowIPNPayment", lhsAllowIPNPayment), LocatorUtils.property(thatLocator, "allowIPNPayment", rhsAllowIPNPayment), lhsAllowIPNPayment, rhsAllowIPNPayment)) {
                return false;
            }
        }
        {
            Boolean lhsAllowOnlinePayment;
            lhsAllowOnlinePayment = this.isAllowOnlinePayment();
            Boolean rhsAllowOnlinePayment;
            rhsAllowOnlinePayment = that.isAllowOnlinePayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowOnlinePayment", lhsAllowOnlinePayment), LocatorUtils.property(thatLocator, "allowOnlinePayment", rhsAllowOnlinePayment), lhsAllowOnlinePayment, rhsAllowOnlinePayment)) {
                return false;
            }
        }
        {
            Boolean lhsAllowOnlineCreditCardPayment;
            lhsAllowOnlineCreditCardPayment = this.isAllowOnlineCreditCardPayment();
            Boolean rhsAllowOnlineCreditCardPayment;
            rhsAllowOnlineCreditCardPayment = that.isAllowOnlineCreditCardPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowOnlineCreditCardPayment", lhsAllowOnlineCreditCardPayment), LocatorUtils.property(thatLocator, "allowOnlineCreditCardPayment", rhsAllowOnlineCreditCardPayment), lhsAllowOnlineCreditCardPayment, rhsAllowOnlineCreditCardPayment)) {
                return false;
            }
        }
        {
            Boolean lhsAllowOnlineACHPayment;
            lhsAllowOnlineACHPayment = this.isAllowOnlineACHPayment();
            Boolean rhsAllowOnlineACHPayment;
            rhsAllowOnlineACHPayment = that.isAllowOnlineACHPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "allowOnlineACHPayment", lhsAllowOnlineACHPayment), LocatorUtils.property(thatLocator, "allowOnlineACHPayment", rhsAllowOnlineACHPayment), lhsAllowOnlineACHPayment, rhsAllowOnlineACHPayment)) {
                return false;
            }
        }
        {
            ETransactionStatusEnum lhsEInvoiceStatus;
            lhsEInvoiceStatus = this.getEInvoiceStatus();
            ETransactionStatusEnum rhsEInvoiceStatus;
            rhsEInvoiceStatus = that.getEInvoiceStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eInvoiceStatus", lhsEInvoiceStatus), LocatorUtils.property(thatLocator, "eInvoiceStatus", rhsEInvoiceStatus), lhsEInvoiceStatus, rhsEInvoiceStatus)) {
                return false;
            }
        }
        {
            Date lhsECloudStatusTimeStamp;
            lhsECloudStatusTimeStamp = this.getECloudStatusTimeStamp();
            Date rhsECloudStatusTimeStamp;
            rhsECloudStatusTimeStamp = that.getECloudStatusTimeStamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eCloudStatusTimeStamp", lhsECloudStatusTimeStamp), LocatorUtils.property(thatLocator, "eCloudStatusTimeStamp", rhsECloudStatusTimeStamp), lhsECloudStatusTimeStamp, rhsECloudStatusTimeStamp)) {
                return false;
            }
        }
        {
            String lhsInvoiceStatus;
            lhsInvoiceStatus = this.getInvoiceStatus();
            String rhsInvoiceStatus;
            rhsInvoiceStatus = that.getInvoiceStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceStatus", lhsInvoiceStatus), LocatorUtils.property(thatLocator, "invoiceStatus", rhsInvoiceStatus), lhsInvoiceStatus, rhsInvoiceStatus)) {
                return false;
            }
        }
        {
            String lhsCallToAction;
            lhsCallToAction = this.getCallToAction();
            String rhsCallToAction;
            rhsCallToAction = that.getCallToAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "callToAction", lhsCallToAction), LocatorUtils.property(thatLocator, "callToAction", rhsCallToAction), lhsCallToAction, rhsCallToAction)) {
                return false;
            }
        }
        {
            List<StatusInfo> lhsInvoiceStatusLog;
            lhsInvoiceStatusLog = (((this.invoiceStatusLog!= null)&&(!this.invoiceStatusLog.isEmpty()))?this.getInvoiceStatusLog():null);
            List<StatusInfo> rhsInvoiceStatusLog;
            rhsInvoiceStatusLog = (((that.invoiceStatusLog!= null)&&(!that.invoiceStatusLog.isEmpty()))?that.getInvoiceStatusLog():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceStatusLog", lhsInvoiceStatusLog), LocatorUtils.property(thatLocator, "invoiceStatusLog", rhsInvoiceStatusLog), lhsInvoiceStatusLog, rhsInvoiceStatusLog)) {
                return false;
            }
        }
        {
            IntuitAnyType lhsInvoiceEx;
            lhsInvoiceEx = this.getInvoiceEx();
            IntuitAnyType rhsInvoiceEx;
            rhsInvoiceEx = that.getInvoiceEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceEx", lhsInvoiceEx), LocatorUtils.property(thatLocator, "invoiceEx", rhsInvoiceEx), lhsInvoiceEx, rhsInvoiceEx)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            BigDecimal theDeposit;
            theDeposit = this.getDeposit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deposit", theDeposit), currentHashCode, theDeposit);
        }
        {
            Boolean theAllowIPNPayment;
            theAllowIPNPayment = this.isAllowIPNPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowIPNPayment", theAllowIPNPayment), currentHashCode, theAllowIPNPayment);
        }
        {
            Boolean theAllowOnlinePayment;
            theAllowOnlinePayment = this.isAllowOnlinePayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowOnlinePayment", theAllowOnlinePayment), currentHashCode, theAllowOnlinePayment);
        }
        {
            Boolean theAllowOnlineCreditCardPayment;
            theAllowOnlineCreditCardPayment = this.isAllowOnlineCreditCardPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowOnlineCreditCardPayment", theAllowOnlineCreditCardPayment), currentHashCode, theAllowOnlineCreditCardPayment);
        }
        {
            Boolean theAllowOnlineACHPayment;
            theAllowOnlineACHPayment = this.isAllowOnlineACHPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "allowOnlineACHPayment", theAllowOnlineACHPayment), currentHashCode, theAllowOnlineACHPayment);
        }
        {
            ETransactionStatusEnum theEInvoiceStatus;
            theEInvoiceStatus = this.getEInvoiceStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eInvoiceStatus", theEInvoiceStatus), currentHashCode, theEInvoiceStatus);
        }
        {
            Date theECloudStatusTimeStamp;
            theECloudStatusTimeStamp = this.getECloudStatusTimeStamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eCloudStatusTimeStamp", theECloudStatusTimeStamp), currentHashCode, theECloudStatusTimeStamp);
        }
        {
            String theInvoiceStatus;
            theInvoiceStatus = this.getInvoiceStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceStatus", theInvoiceStatus), currentHashCode, theInvoiceStatus);
        }
        {
            String theCallToAction;
            theCallToAction = this.getCallToAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "callToAction", theCallToAction), currentHashCode, theCallToAction);
        }
        {
            List<StatusInfo> theInvoiceStatusLog;
            theInvoiceStatusLog = (((this.invoiceStatusLog!= null)&&(!this.invoiceStatusLog.isEmpty()))?this.getInvoiceStatusLog():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceStatusLog", theInvoiceStatusLog), currentHashCode, theInvoiceStatusLog);
        }
        {
            IntuitAnyType theInvoiceEx;
            theInvoiceEx = this.getInvoiceEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceEx", theInvoiceEx), currentHashCode, theInvoiceEx);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}