//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.01 at 11:44:24 AM MEZ 
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZAUBERLISTE_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZAUBERLISTE_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ZAUBER" type="{http://earthdawn.de}ZAUBER_type" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="disziplin" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZAUBERLISTE_type", propOrder = {
    "zauber"
})
public class ZAUBERLISTEType {

    @XmlElement(name = "ZAUBER")
    protected List<ZAUBERType> zauber;
    @XmlAttribute(required = true)
    protected String disziplin;

    /**
     * Gets the value of the zauber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zauber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZAUBER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZAUBERType }
     * 
     * 
     */
    public List<ZAUBERType> getZAUBER() {
        if (zauber == null) {
            zauber = new ArrayList<ZAUBERType>();
        }
        return this.zauber;
    }

    /**
     * Gets the value of the disziplin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisziplin() {
        return disziplin;
    }

    /**
     * Sets the value of the disziplin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisziplin(String value) {
        this.disziplin = value;
    }

}
