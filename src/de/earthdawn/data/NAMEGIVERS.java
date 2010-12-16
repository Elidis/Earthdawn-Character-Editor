//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAMEGIVER" type="{http://earthdawn.com/namegiver}NAMEGIVERABILITY_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lang" use="required" type="{http://earthdawn.com/datatypes}language_type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "namegiver"
})
@XmlRootElement(name = "NAMEGIVERS", namespace = "http://earthdawn.com/namegiver")
public class NAMEGIVERS {

    @XmlElement(name = "NAMEGIVER", namespace = "http://earthdawn.com/namegiver")
    protected List<NAMEGIVERABILITYType> namegiver;
    @XmlAttribute(required = true)
    protected LanguageType lang;

    /**
     * Gets the value of the namegiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namegiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAMEGIVER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAMEGIVERABILITYType }
     * 
     * 
     */
    public List<NAMEGIVERABILITYType> getNAMEGIVER() {
        if (namegiver == null) {
            namegiver = new ArrayList<NAMEGIVERABILITYType>();
        }
        return this.namegiver;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLang(LanguageType value) {
        this.lang = value;
    }

}
