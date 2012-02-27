//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for learnedby_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="learnedby_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="other"/>
 *     &lt;enumeration value="skill"/>
 *     &lt;enumeration value="talent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "learnedby_type")
@XmlEnum
public enum LearnedbyType {

    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("skill")
    SKILL("skill"),
    @XmlEnumValue("talent")
    TALENT("talent");
    private final String value;

    LearnedbyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LearnedbyType fromValue(String v) {
        for (LearnedbyType c: LearnedbyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}