//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.09 at 08:12:32 PM MEZ 
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
 * <p>Java class for MAGICITEM_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAGICITEM_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}ITEM_type">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="THREADRANK" type="{http://earthdawn.com/datatypes}THREADRANK_type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="maxthreads" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="spelldefense" use="required" type="{http://earthdawn.com/datatypes}unsigned_int" />
 *       &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAGICITEM_type", propOrder = {
    "threadrank"
})
public class MAGICITEMType
    extends ITEMType
{

    @XmlElement(name = "THREADRANK")
    protected List<THREADRANKType> threadrank;
    @XmlAttribute(required = true)
    protected int maxthreads;
    @XmlAttribute(required = true)
    protected int spelldefense;
    @XmlAttribute(required = true)
    protected String description;

    /**
     * Gets the value of the threadrank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threadrank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTHREADRANK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THREADRANKType }
     * 
     * 
     */
    public List<THREADRANKType> getTHREADRANK() {
        if (threadrank == null) {
            threadrank = new ArrayList<THREADRANKType>();
        }
        return this.threadrank;
    }

    /**
     * Gets the value of the maxthreads property.
     * 
     */
    public int getMaxthreads() {
        return maxthreads;
    }

    /**
     * Sets the value of the maxthreads property.
     * 
     */
    public void setMaxthreads(int value) {
        this.maxthreads = value;
    }

    /**
     * Gets the value of the spelldefense property.
     * 
     */
    public int getSpelldefense() {
        return spelldefense;
    }

    /**
     * Sets the value of the spelldefense property.
     * 
     */
    public void setSpelldefense(int value) {
        this.spelldefense = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
