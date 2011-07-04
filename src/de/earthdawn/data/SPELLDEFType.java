//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPELLDEF_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPELLDEF_type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="threads" type="{http://www.w3.org/2001/XMLSchema}string" default="0" />
 *       &lt;attribute name="weavingdifficulty" type="{http://www.w3.org/2001/XMLSchema}string" default="na" />
 *       &lt;attribute name="reattuningdifficulty" type="{http://earthdawn.com/datatypes}unsigned_int" default="0" />
 *       &lt;attribute name="castingdifficulty" type="{http://www.w3.org/2001/XMLSchema}string" default="TSD" />
 *       &lt;attribute name="range" type="{http://www.w3.org/2001/XMLSchema}string" default="s. text" />
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" default="s. text" />
 *       &lt;attribute name="effect" type="{http://www.w3.org/2001/XMLSchema}string" default="s. text" />
 *       &lt;attribute name="effectarea" type="{http://www.w3.org/2001/XMLSchema}string" default="s. text" />
 *       &lt;attribute name="bookref" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPELLDEF_type")
@XmlSeeAlso({
    SPELLType.class
})
public class SPELLDEFType {

    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String threads;
    @XmlAttribute
    protected String weavingdifficulty;
    @XmlAttribute
    protected Integer reattuningdifficulty;
    @XmlAttribute
    protected String castingdifficulty;
    @XmlAttribute
    protected String range;
    @XmlAttribute
    protected String duration;
    @XmlAttribute
    protected String effect;
    @XmlAttribute
    protected String effectarea;
    @XmlAttribute
    protected String bookref;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the threads property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreads() {
        if (threads == null) {
            return "0";
        } else {
            return threads;
        }
    }

    /**
     * Sets the value of the threads property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreads(String value) {
        this.threads = value;
    }

    /**
     * Gets the value of the weavingdifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeavingdifficulty() {
        if (weavingdifficulty == null) {
            return "na";
        } else {
            return weavingdifficulty;
        }
    }

    /**
     * Sets the value of the weavingdifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeavingdifficulty(String value) {
        this.weavingdifficulty = value;
    }

    /**
     * Gets the value of the reattuningdifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getReattuningdifficulty() {
        if (reattuningdifficulty == null) {
            return  0;
        } else {
            return reattuningdifficulty;
        }
    }

    /**
     * Sets the value of the reattuningdifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReattuningdifficulty(Integer value) {
        this.reattuningdifficulty = value;
    }

    /**
     * Gets the value of the castingdifficulty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCastingdifficulty() {
        if (castingdifficulty == null) {
            return "TSD";
        } else {
            return castingdifficulty;
        }
    }

    /**
     * Sets the value of the castingdifficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCastingdifficulty(String value) {
        this.castingdifficulty = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRange() {
        if (range == null) {
            return "s. text";
        } else {
            return range;
        }
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRange(String value) {
        this.range = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        if (duration == null) {
            return "s. text";
        } else {
            return duration;
        }
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the effect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffect() {
        if (effect == null) {
            return "s. text";
        } else {
            return effect;
        }
    }

    /**
     * Sets the value of the effect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffect(String value) {
        this.effect = value;
    }

    /**
     * Gets the value of the effectarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectarea() {
        if (effectarea == null) {
            return "s. text";
        } else {
            return effectarea;
        }
    }

    /**
     * Sets the value of the effectarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectarea(String value) {
        this.effectarea = value;
    }

    /**
     * Gets the value of the bookref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookref() {
        if (bookref == null) {
            return "";
        } else {
            return bookref;
        }
    }

    /**
     * Sets the value of the bookref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookref(String value) {
        this.bookref = value;
    }

}
