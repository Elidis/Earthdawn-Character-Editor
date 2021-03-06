//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MOVEMENTATTRIBUTE_name_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MOVEMENTATTRIBUTE_name_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEX"/>
 *     &lt;enumeration value="STR"/>
 *     &lt;enumeration value="STR+DEX"/>
 *     &lt;enumeration value="MAX"/>
 *     &lt;enumeration value="na"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MOVEMENTATTRIBUTE_name_type")
@XmlEnum
public enum MOVEMENTATTRIBUTENameType {

    DEX("DEX"),
    STR("STR"),
    @XmlEnumValue("STR+DEX")
    STR_DEX("STR+DEX"),
    MAX("MAX"),
    @XmlEnumValue("na")
    NA("na");
    private final String value;

    MOVEMENTATTRIBUTENameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MOVEMENTATTRIBUTENameType fromValue(String v) {
        for (MOVEMENTATTRIBUTENameType c: MOVEMENTATTRIBUTENameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
