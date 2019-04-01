//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.31 at 04:10:34 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateTimeAdapter;
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
 * 				Product: ALL
 * 				Description: Metadata for the instance of the entity. All properties are read only.
 * 			
 * 
 * <p>Java class for ModificationMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModificationMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreatedByRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedByRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/>
 *         &lt;element name="LastUpdatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastChangedInQB" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Synchronized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificationMetaData", propOrder = {
    "createdByRef",
    "createTime",
    "lastModifiedByRef",
    "lastUpdatedTime",
    "lastChangedInQB",
    "_synchronized"
})
public class ModificationMetaData implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CreatedByRef")
    protected ReferenceType createdByRef;
    @XmlElement(name = "CreateTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date createTime;
    @XmlElement(name = "LastModifiedByRef")
    protected ReferenceType lastModifiedByRef;
    @XmlElement(name = "LastUpdatedTime", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date lastUpdatedTime;
    @XmlElement(name = "LastChangedInQB", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date lastChangedInQB;
    @XmlElement(name = "Synchronized")
    protected Boolean _synchronized;

    /**
     * Gets the value of the createdByRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getCreatedByRef() {
        return createdByRef;
    }

    /**
     * Sets the value of the createdByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setCreatedByRef(ReferenceType value) {
        this.createdByRef = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(Date value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the lastModifiedByRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getLastModifiedByRef() {
        return lastModifiedByRef;
    }

    /**
     * Sets the value of the lastModifiedByRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setLastModifiedByRef(ReferenceType value) {
        this.lastModifiedByRef = value;
    }

    /**
     * Gets the value of the lastUpdatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * Sets the value of the lastUpdatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedTime(Date value) {
        this.lastUpdatedTime = value;
    }

    /**
     * Gets the value of the lastChangedInQB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getLastChangedInQB() {
        return lastChangedInQB;
    }

    /**
     * Sets the value of the lastChangedInQB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangedInQB(Date value) {
        this.lastChangedInQB = value;
    }

    /**
     * Gets the value of the synchronized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSynchronized() {
        return _synchronized;
    }

    /**
     * Sets the value of the synchronized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynchronized(Boolean value) {
        this._synchronized = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ModificationMetaData that = ((ModificationMetaData) object);
        {
            ReferenceType lhsCreatedByRef;
            lhsCreatedByRef = this.getCreatedByRef();
            ReferenceType rhsCreatedByRef;
            rhsCreatedByRef = that.getCreatedByRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createdByRef", lhsCreatedByRef), LocatorUtils.property(thatLocator, "createdByRef", rhsCreatedByRef), lhsCreatedByRef, rhsCreatedByRef, (this.createdByRef!= null), (that.createdByRef!= null))) {
                return false;
            }
        }
        {
            Date lhsCreateTime;
            lhsCreateTime = this.getCreateTime();
            Date rhsCreateTime;
            rhsCreateTime = that.getCreateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createTime", lhsCreateTime), LocatorUtils.property(thatLocator, "createTime", rhsCreateTime), lhsCreateTime, rhsCreateTime, (this.createTime!= null), (that.createTime!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsLastModifiedByRef;
            lhsLastModifiedByRef = this.getLastModifiedByRef();
            ReferenceType rhsLastModifiedByRef;
            rhsLastModifiedByRef = that.getLastModifiedByRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastModifiedByRef", lhsLastModifiedByRef), LocatorUtils.property(thatLocator, "lastModifiedByRef", rhsLastModifiedByRef), lhsLastModifiedByRef, rhsLastModifiedByRef, (this.lastModifiedByRef!= null), (that.lastModifiedByRef!= null))) {
                return false;
            }
        }
        {
            Date lhsLastUpdatedTime;
            lhsLastUpdatedTime = this.getLastUpdatedTime();
            Date rhsLastUpdatedTime;
            rhsLastUpdatedTime = that.getLastUpdatedTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastUpdatedTime", lhsLastUpdatedTime), LocatorUtils.property(thatLocator, "lastUpdatedTime", rhsLastUpdatedTime), lhsLastUpdatedTime, rhsLastUpdatedTime, (this.lastUpdatedTime!= null), (that.lastUpdatedTime!= null))) {
                return false;
            }
        }
        {
            Date lhsLastChangedInQB;
            lhsLastChangedInQB = this.getLastChangedInQB();
            Date rhsLastChangedInQB;
            rhsLastChangedInQB = that.getLastChangedInQB();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastChangedInQB", lhsLastChangedInQB), LocatorUtils.property(thatLocator, "lastChangedInQB", rhsLastChangedInQB), lhsLastChangedInQB, rhsLastChangedInQB, (this.lastChangedInQB!= null), (that.lastChangedInQB!= null))) {
                return false;
            }
        }
        {
            Boolean lhsSynchronized;
            lhsSynchronized = this.isSynchronized();
            Boolean rhsSynchronized;
            rhsSynchronized = that.isSynchronized();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_synchronized", lhsSynchronized), LocatorUtils.property(thatLocator, "_synchronized", rhsSynchronized), lhsSynchronized, rhsSynchronized, (this._synchronized!= null), (that._synchronized!= null))) {
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
        int currentHashCode = 1;
        {
            ReferenceType theCreatedByRef;
            theCreatedByRef = this.getCreatedByRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createdByRef", theCreatedByRef), currentHashCode, theCreatedByRef, (this.createdByRef!= null));
        }
        {
            Date theCreateTime;
            theCreateTime = this.getCreateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createTime", theCreateTime), currentHashCode, theCreateTime, (this.createTime!= null));
        }
        {
            ReferenceType theLastModifiedByRef;
            theLastModifiedByRef = this.getLastModifiedByRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastModifiedByRef", theLastModifiedByRef), currentHashCode, theLastModifiedByRef, (this.lastModifiedByRef!= null));
        }
        {
            Date theLastUpdatedTime;
            theLastUpdatedTime = this.getLastUpdatedTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastUpdatedTime", theLastUpdatedTime), currentHashCode, theLastUpdatedTime, (this.lastUpdatedTime!= null));
        }
        {
            Date theLastChangedInQB;
            theLastChangedInQB = this.getLastChangedInQB();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastChangedInQB", theLastChangedInQB), currentHashCode, theLastChangedInQB, (this.lastChangedInQB!= null));
        }
        {
            Boolean theSynchronized;
            theSynchronized = this.isSynchronized();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_synchronized", theSynchronized), currentHashCode, theSynchronized, (this._synchronized!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
