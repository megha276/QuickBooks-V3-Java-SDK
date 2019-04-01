//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.31 at 04:10:34 PM PDT 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryErrorTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryErrorTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Missing Info"/>
 *     &lt;enumeration value="Undeliverable"/>
 *     &lt;enumeration value="Delivery Server Down"/>
 *     &lt;enumeration value="Bounced Email"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryErrorTypeEnum")
@XmlEnum
public enum DeliveryErrorTypeEnum {

    @XmlEnumValue("Missing Info")
    MISSING_INFO("Missing Info"),
    @XmlEnumValue("Undeliverable")
    UNDELIVERABLE("Undeliverable"),
    @XmlEnumValue("Delivery Server Down")
    DELIVERY_SERVER_DOWN("Delivery Server Down"),
    @XmlEnumValue("Bounced Email")
    BOUNCED_EMAIL("Bounced Email");
    private final String value;

    DeliveryErrorTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryErrorTypeEnum fromValue(String v) {
        for (DeliveryErrorTypeEnum c: DeliveryErrorTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
