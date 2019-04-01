//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.31 at 04:10:34 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * 				Represents a User with an Intuit account.  Note that based on privacy restrictions, information returned may be
 * 				limited depending on calling origin and/or calling user permissions (ex: a user may be able to look up all of
 * 				their information, but not the information regarding other users).
 * 
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity">
 *       &lt;sequence>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailAddr" type="{http://schema.intuit.com/finance/v3}EmailAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Addr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://schema.intuit.com/finance/v3}TelephoneNumber" maxOccurs="unbounded"/>
 *         &lt;element name="LocaleCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocaleLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocaleTimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NameValueAttr" type="{http://schema.intuit.com/finance/v3}NameValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "displayName",
    "title",
    "givenName",
    "middleName",
    "familyName",
    "suffix",
    "emailAddr",
    "addr",
    "phoneNumber",
    "localeCountry",
    "localeLanguage",
    "localePostalCode",
    "localeTimeZone",
    "nameValueAttr"
})
public class User
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "EmailAddr")
    protected List<EmailAddress> emailAddr;
    @XmlElement(name = "Addr")
    protected List<PhysicalAddress> addr;
    @XmlElement(name = "PhoneNumber", required = true)
    protected List<TelephoneNumber> phoneNumber;
    @XmlElement(name = "LocaleCountry")
    protected String localeCountry;
    @XmlElement(name = "LocaleLanguage")
    protected String localeLanguage;
    @XmlElement(name = "LocalePostalCode")
    protected String localePostalCode;
    @XmlElement(name = "LocaleTimeZone")
    protected String localeTimeZone;
    @XmlElement(name = "NameValueAttr")
    protected List<NameValue> nameValueAttr;

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the emailAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddress }
     * 
     * 
     */
    public List<EmailAddress> getEmailAddr() {
        if (emailAddr == null) {
            emailAddr = new ArrayList<EmailAddress>();
        }
        return this.emailAddr;
    }

    /**
     * Gets the value of the addr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhysicalAddress }
     * 
     * 
     */
    public List<PhysicalAddress> getAddr() {
        if (addr == null) {
            addr = new ArrayList<PhysicalAddress>();
        }
        return this.addr;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelephoneNumber }
     * 
     * 
     */
    public List<TelephoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<TelephoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the localeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleCountry() {
        return localeCountry;
    }

    /**
     * Sets the value of the localeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleCountry(String value) {
        this.localeCountry = value;
    }

    /**
     * Gets the value of the localeLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleLanguage() {
        return localeLanguage;
    }

    /**
     * Sets the value of the localeLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleLanguage(String value) {
        this.localeLanguage = value;
    }

    /**
     * Gets the value of the localePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalePostalCode() {
        return localePostalCode;
    }

    /**
     * Sets the value of the localePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalePostalCode(String value) {
        this.localePostalCode = value;
    }

    /**
     * Gets the value of the localeTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocaleTimeZone() {
        return localeTimeZone;
    }

    /**
     * Sets the value of the localeTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocaleTimeZone(String value) {
        this.localeTimeZone = value;
    }

    /**
     * Gets the value of the nameValueAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameValueAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameValueAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValue }
     * 
     * 
     */
    public List<NameValue> getNameValueAttr() {
        if (nameValueAttr == null) {
            nameValueAttr = new ArrayList<NameValue>();
        }
        return this.nameValueAttr;
    }

    /**
     * Sets the value of the emailAddr property.
     * 
     * @param emailAddr
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setEmailAddr(List<EmailAddress> emailAddr) {
        this.emailAddr = emailAddr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param addr
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setAddr(List<PhysicalAddress> addr) {
        this.addr = addr;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param phoneNumber
     *     allowed object is
     *     {@link TelephoneNumber }
     *     
     */
    public void setPhoneNumber(List<TelephoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets the value of the nameValueAttr property.
     * 
     * @param nameValueAttr
     *     allowed object is
     *     {@link NameValue }
     *     
     */
    public void setNameValueAttr(List<NameValue> nameValueAttr) {
        this.nameValueAttr = nameValueAttr;
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
        final User that = ((User) object);
        {
            String lhsDisplayName;
            lhsDisplayName = this.getDisplayName();
            String rhsDisplayName;
            rhsDisplayName = that.getDisplayName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "displayName", lhsDisplayName), LocatorUtils.property(thatLocator, "displayName", rhsDisplayName), lhsDisplayName, rhsDisplayName, (this.displayName!= null), (that.displayName!= null))) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, (this.title!= null), (that.title!= null))) {
                return false;
            }
        }
        {
            String lhsGivenName;
            lhsGivenName = this.getGivenName();
            String rhsGivenName;
            rhsGivenName = that.getGivenName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "givenName", lhsGivenName), LocatorUtils.property(thatLocator, "givenName", rhsGivenName), lhsGivenName, rhsGivenName, (this.givenName!= null), (that.givenName!= null))) {
                return false;
            }
        }
        {
            String lhsMiddleName;
            lhsMiddleName = this.getMiddleName();
            String rhsMiddleName;
            rhsMiddleName = that.getMiddleName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "middleName", lhsMiddleName), LocatorUtils.property(thatLocator, "middleName", rhsMiddleName), lhsMiddleName, rhsMiddleName, (this.middleName!= null), (that.middleName!= null))) {
                return false;
            }
        }
        {
            String lhsFamilyName;
            lhsFamilyName = this.getFamilyName();
            String rhsFamilyName;
            rhsFamilyName = that.getFamilyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "familyName", lhsFamilyName), LocatorUtils.property(thatLocator, "familyName", rhsFamilyName), lhsFamilyName, rhsFamilyName, (this.familyName!= null), (that.familyName!= null))) {
                return false;
            }
        }
        {
            String lhsSuffix;
            lhsSuffix = this.getSuffix();
            String rhsSuffix;
            rhsSuffix = that.getSuffix();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "suffix", lhsSuffix), LocatorUtils.property(thatLocator, "suffix", rhsSuffix), lhsSuffix, rhsSuffix, (this.suffix!= null), (that.suffix!= null))) {
                return false;
            }
        }
        {
            List<EmailAddress> lhsEmailAddr;
            lhsEmailAddr = (((this.emailAddr!= null)&&(!this.emailAddr.isEmpty()))?this.getEmailAddr():null);
            List<EmailAddress> rhsEmailAddr;
            rhsEmailAddr = (((that.emailAddr!= null)&&(!that.emailAddr.isEmpty()))?that.getEmailAddr():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "emailAddr", lhsEmailAddr), LocatorUtils.property(thatLocator, "emailAddr", rhsEmailAddr), lhsEmailAddr, rhsEmailAddr, ((this.emailAddr!= null)&&(!this.emailAddr.isEmpty())), ((that.emailAddr!= null)&&(!that.emailAddr.isEmpty())))) {
                return false;
            }
        }
        {
            List<PhysicalAddress> lhsAddr;
            lhsAddr = (((this.addr!= null)&&(!this.addr.isEmpty()))?this.getAddr():null);
            List<PhysicalAddress> rhsAddr;
            rhsAddr = (((that.addr!= null)&&(!that.addr.isEmpty()))?that.getAddr():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "addr", lhsAddr), LocatorUtils.property(thatLocator, "addr", rhsAddr), lhsAddr, rhsAddr, ((this.addr!= null)&&(!this.addr.isEmpty())), ((that.addr!= null)&&(!that.addr.isEmpty())))) {
                return false;
            }
        }
        {
            List<TelephoneNumber> lhsPhoneNumber;
            lhsPhoneNumber = (((this.phoneNumber!= null)&&(!this.phoneNumber.isEmpty()))?this.getPhoneNumber():null);
            List<TelephoneNumber> rhsPhoneNumber;
            rhsPhoneNumber = (((that.phoneNumber!= null)&&(!that.phoneNumber.isEmpty()))?that.getPhoneNumber():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phoneNumber", lhsPhoneNumber), LocatorUtils.property(thatLocator, "phoneNumber", rhsPhoneNumber), lhsPhoneNumber, rhsPhoneNumber, ((this.phoneNumber!= null)&&(!this.phoneNumber.isEmpty())), ((that.phoneNumber!= null)&&(!that.phoneNumber.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsLocaleCountry;
            lhsLocaleCountry = this.getLocaleCountry();
            String rhsLocaleCountry;
            rhsLocaleCountry = that.getLocaleCountry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localeCountry", lhsLocaleCountry), LocatorUtils.property(thatLocator, "localeCountry", rhsLocaleCountry), lhsLocaleCountry, rhsLocaleCountry, (this.localeCountry!= null), (that.localeCountry!= null))) {
                return false;
            }
        }
        {
            String lhsLocaleLanguage;
            lhsLocaleLanguage = this.getLocaleLanguage();
            String rhsLocaleLanguage;
            rhsLocaleLanguage = that.getLocaleLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localeLanguage", lhsLocaleLanguage), LocatorUtils.property(thatLocator, "localeLanguage", rhsLocaleLanguage), lhsLocaleLanguage, rhsLocaleLanguage, (this.localeLanguage!= null), (that.localeLanguage!= null))) {
                return false;
            }
        }
        {
            String lhsLocalePostalCode;
            lhsLocalePostalCode = this.getLocalePostalCode();
            String rhsLocalePostalCode;
            rhsLocalePostalCode = that.getLocalePostalCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localePostalCode", lhsLocalePostalCode), LocatorUtils.property(thatLocator, "localePostalCode", rhsLocalePostalCode), lhsLocalePostalCode, rhsLocalePostalCode, (this.localePostalCode!= null), (that.localePostalCode!= null))) {
                return false;
            }
        }
        {
            String lhsLocaleTimeZone;
            lhsLocaleTimeZone = this.getLocaleTimeZone();
            String rhsLocaleTimeZone;
            rhsLocaleTimeZone = that.getLocaleTimeZone();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "localeTimeZone", lhsLocaleTimeZone), LocatorUtils.property(thatLocator, "localeTimeZone", rhsLocaleTimeZone), lhsLocaleTimeZone, rhsLocaleTimeZone, (this.localeTimeZone!= null), (that.localeTimeZone!= null))) {
                return false;
            }
        }
        {
            List<NameValue> lhsNameValueAttr;
            lhsNameValueAttr = (((this.nameValueAttr!= null)&&(!this.nameValueAttr.isEmpty()))?this.getNameValueAttr():null);
            List<NameValue> rhsNameValueAttr;
            rhsNameValueAttr = (((that.nameValueAttr!= null)&&(!that.nameValueAttr.isEmpty()))?that.getNameValueAttr():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameValueAttr", lhsNameValueAttr), LocatorUtils.property(thatLocator, "nameValueAttr", rhsNameValueAttr), lhsNameValueAttr, rhsNameValueAttr, ((this.nameValueAttr!= null)&&(!this.nameValueAttr.isEmpty())), ((that.nameValueAttr!= null)&&(!that.nameValueAttr.isEmpty())))) {
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
            String theDisplayName;
            theDisplayName = this.getDisplayName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "displayName", theDisplayName), currentHashCode, theDisplayName, (this.displayName!= null));
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle, (this.title!= null));
        }
        {
            String theGivenName;
            theGivenName = this.getGivenName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "givenName", theGivenName), currentHashCode, theGivenName, (this.givenName!= null));
        }
        {
            String theMiddleName;
            theMiddleName = this.getMiddleName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "middleName", theMiddleName), currentHashCode, theMiddleName, (this.middleName!= null));
        }
        {
            String theFamilyName;
            theFamilyName = this.getFamilyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "familyName", theFamilyName), currentHashCode, theFamilyName, (this.familyName!= null));
        }
        {
            String theSuffix;
            theSuffix = this.getSuffix();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "suffix", theSuffix), currentHashCode, theSuffix, (this.suffix!= null));
        }
        {
            List<EmailAddress> theEmailAddr;
            theEmailAddr = (((this.emailAddr!= null)&&(!this.emailAddr.isEmpty()))?this.getEmailAddr():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "emailAddr", theEmailAddr), currentHashCode, theEmailAddr, ((this.emailAddr!= null)&&(!this.emailAddr.isEmpty())));
        }
        {
            List<PhysicalAddress> theAddr;
            theAddr = (((this.addr!= null)&&(!this.addr.isEmpty()))?this.getAddr():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "addr", theAddr), currentHashCode, theAddr, ((this.addr!= null)&&(!this.addr.isEmpty())));
        }
        {
            List<TelephoneNumber> thePhoneNumber;
            thePhoneNumber = (((this.phoneNumber!= null)&&(!this.phoneNumber.isEmpty()))?this.getPhoneNumber():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phoneNumber", thePhoneNumber), currentHashCode, thePhoneNumber, ((this.phoneNumber!= null)&&(!this.phoneNumber.isEmpty())));
        }
        {
            String theLocaleCountry;
            theLocaleCountry = this.getLocaleCountry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localeCountry", theLocaleCountry), currentHashCode, theLocaleCountry, (this.localeCountry!= null));
        }
        {
            String theLocaleLanguage;
            theLocaleLanguage = this.getLocaleLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localeLanguage", theLocaleLanguage), currentHashCode, theLocaleLanguage, (this.localeLanguage!= null));
        }
        {
            String theLocalePostalCode;
            theLocalePostalCode = this.getLocalePostalCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localePostalCode", theLocalePostalCode), currentHashCode, theLocalePostalCode, (this.localePostalCode!= null));
        }
        {
            String theLocaleTimeZone;
            theLocaleTimeZone = this.getLocaleTimeZone();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "localeTimeZone", theLocaleTimeZone), currentHashCode, theLocaleTimeZone, (this.localeTimeZone!= null));
        }
        {
            List<NameValue> theNameValueAttr;
            theNameValueAttr = (((this.nameValueAttr!= null)&&(!this.nameValueAttr.isEmpty()))?this.getNameValueAttr():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameValueAttr", theNameValueAttr), currentHashCode, theNameValueAttr, ((this.nameValueAttr!= null)&&(!this.nameValueAttr.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
