//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HEALTH_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HEALTH_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RECOVERY" type="{http://earthdawn.com/datatypes}RECOVERY_type"/>
 *         &lt;element name="UNCONSCIOUSNESS" type="{http://earthdawn.com/datatypes}DEATH_type"/>
 *         &lt;element name="DEATH" type="{http://earthdawn.com/datatypes}DEATH_type"/>
 *         &lt;element name="WOUNDS" type="{http://earthdawn.com/datatypes}WOUND_type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="damage" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="blooddamage" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="depatterningrate" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HEALTH_type", propOrder = {
    "recovery",
    "unconsciousness",
    "death",
    "wounds"
})
public class HEALTHType {

    @XmlElement(name = "RECOVERY", required = true)
    protected RECOVERYType recovery;
    @XmlElement(name = "UNCONSCIOUSNESS", required = true)
    protected DEATHType unconsciousness;
    @XmlElement(name = "DEATH", required = true)
    protected DEATHType death;
    @XmlElement(name = "WOUNDS", required = true)
    protected WOUNDType wounds;
    @XmlAttribute(name = "damage")
    protected Integer damage;
    @XmlAttribute(name = "blooddamage")
    protected Integer blooddamage;
    @XmlAttribute(name = "depatterningrate")
    protected Integer depatterningrate;

    /**
     * Gets the value of the recovery property.
     * 
     * @return
     *     possible object is
     *     {@link RECOVERYType }
     *     
     */
    public RECOVERYType getRECOVERY() {
        return recovery;
    }

    /**
     * Sets the value of the recovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link RECOVERYType }
     *     
     */
    public void setRECOVERY(RECOVERYType value) {
        this.recovery = value;
    }

    /**
     * Gets the value of the unconsciousness property.
     * 
     * @return
     *     possible object is
     *     {@link DEATHType }
     *     
     */
    public DEATHType getUNCONSCIOUSNESS() {
        return unconsciousness;
    }

    /**
     * Sets the value of the unconsciousness property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEATHType }
     *     
     */
    public void setUNCONSCIOUSNESS(DEATHType value) {
        this.unconsciousness = value;
    }

    /**
     * Gets the value of the death property.
     * 
     * @return
     *     possible object is
     *     {@link DEATHType }
     *     
     */
    public DEATHType getDEATH() {
        return death;
    }

    /**
     * Sets the value of the death property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEATHType }
     *     
     */
    public void setDEATH(DEATHType value) {
        this.death = value;
    }

    /**
     * Gets the value of the wounds property.
     * 
     * @return
     *     possible object is
     *     {@link WOUNDType }
     *     
     */
    public WOUNDType getWOUNDS() {
        return wounds;
    }

    /**
     * Sets the value of the wounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link WOUNDType }
     *     
     */
    public void setWOUNDS(WOUNDType value) {
        this.wounds = value;
    }

    /**
     * Gets the value of the damage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDamage() {
        if (damage == null) {
            return  0;
        } else {
            return damage;
        }
    }

    /**
     * Sets the value of the damage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDamage(Integer value) {
        this.damage = value;
    }

    /**
     * Gets the value of the blooddamage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBlooddamage() {
        if (blooddamage == null) {
            return  0;
        } else {
            return blooddamage;
        }
    }

    /**
     * Sets the value of the blooddamage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBlooddamage(Integer value) {
        this.blooddamage = value;
    }

    /**
     * Gets the value of the depatterningrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDepatterningrate() {
        if (depatterningrate == null) {
            return  0;
        } else {
            return depatterningrate;
        }
    }

    /**
     * Sets the value of the depatterningrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepatterningrate(Integer value) {
        this.depatterningrate = value;
    }

}
