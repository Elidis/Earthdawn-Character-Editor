//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="RANDOMNAME_RACE" type="{http://earthdawn.com/randomname}RANDOMNAME_RACE_type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "randomnamerace"
})
@XmlRootElement(name = "EDRANDOMNAME", namespace = "http://earthdawn.com/randomname")
public class EDRANDOMNAME {

    @XmlElement(name = "RANDOMNAME_RACE", namespace = "http://earthdawn.com/randomname", required = true)
    protected List<RANDOMNAMERACEType> randomnamerace;

    /**
     * Gets the value of the randomnamerace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the randomnamerace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRANDOMNAMERACE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RANDOMNAMERACEType }
     * 
     * 
     */
    public List<RANDOMNAMERACEType> getRANDOMNAMERACE() {
        if (randomnamerace == null) {
            randomnamerace = new ArrayList<RANDOMNAMERACEType>();
        }
        return this.randomnamerace;
    }

}
