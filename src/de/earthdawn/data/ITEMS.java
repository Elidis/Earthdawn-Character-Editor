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
 *         &lt;element name="ARMOR" type="{http://earthdawn.com/datatypes}ARMOR_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SHIELD" type="{http://earthdawn.com/datatypes}SHIELD_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WEAPON" type="{http://earthdawn.com/datatypes}WEAPON_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AMMUNITION" type="{http://earthdawn.com/datatypes}AMMUNITION_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MAGICITEM" type="{http://earthdawn.com/datatypes}MAGICITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PATTERNITEM" type="{http://earthdawn.com/datatypes}PATTERNITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BLOODCHARMITEM" type="{http://earthdawn.com/datatypes}MAGICITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="THREADITEM" type="{http://earthdawn.com/datatypes}THREADITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ITEM" type="{http://earthdawn.com/datatypes}ITEM_type" maxOccurs="unbounded" minOccurs="0"/>
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
    "armor",
    "shield",
    "weapon",
    "ammunition",
    "magicitem",
    "patternitem",
    "bloodcharmitem",
    "threaditem",
    "item"
})
@XmlRootElement(name = "ITEMS", namespace = "http://earthdawn.com/items")
public class ITEMS {

    @XmlElement(name = "ARMOR", namespace = "http://earthdawn.com/items")
    protected List<ARMORType> armor;
    @XmlElement(name = "SHIELD", namespace = "http://earthdawn.com/items")
    protected List<SHIELDType> shield;
    @XmlElement(name = "WEAPON", namespace = "http://earthdawn.com/items")
    protected List<WEAPONType> weapon;
    @XmlElement(name = "AMMUNITION", namespace = "http://earthdawn.com/items")
    protected List<AMMUNITIONType> ammunition;
    @XmlElement(name = "MAGICITEM", namespace = "http://earthdawn.com/items")
    protected List<MAGICITEMType> magicitem;
    @XmlElement(name = "PATTERNITEM", namespace = "http://earthdawn.com/items")
    protected List<PATTERNITEMType> patternitem;
    @XmlElement(name = "BLOODCHARMITEM", namespace = "http://earthdawn.com/items")
    protected List<MAGICITEMType> bloodcharmitem;
    @XmlElement(name = "THREADITEM", namespace = "http://earthdawn.com/items")
    protected List<THREADITEMType> threaditem;
    @XmlElement(name = "ITEM", namespace = "http://earthdawn.com/items")
    protected List<ITEMType> item;
    @XmlAttribute(name = "lang", required = true)
    protected LanguageType lang;

    /**
     * Gets the value of the armor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the armor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARMOR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ARMORType }
     * 
     * 
     */
    public List<ARMORType> getARMOR() {
        if (armor == null) {
            armor = new ArrayList<ARMORType>();
        }
        return this.armor;
    }

    /**
     * Gets the value of the shield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHIELD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHIELDType }
     * 
     * 
     */
    public List<SHIELDType> getSHIELD() {
        if (shield == null) {
            shield = new ArrayList<SHIELDType>();
        }
        return this.shield;
    }

    /**
     * Gets the value of the weapon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weapon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWEAPON().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WEAPONType }
     * 
     * 
     */
    public List<WEAPONType> getWEAPON() {
        if (weapon == null) {
            weapon = new ArrayList<WEAPONType>();
        }
        return this.weapon;
    }

    /**
     * Gets the value of the ammunition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ammunition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAMMUNITION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AMMUNITIONType }
     * 
     * 
     */
    public List<AMMUNITIONType> getAMMUNITION() {
        if (ammunition == null) {
            ammunition = new ArrayList<AMMUNITIONType>();
        }
        return this.ammunition;
    }

    /**
     * Gets the value of the magicitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the magicitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAGICITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MAGICITEMType }
     * 
     * 
     */
    public List<MAGICITEMType> getMAGICITEM() {
        if (magicitem == null) {
            magicitem = new ArrayList<MAGICITEMType>();
        }
        return this.magicitem;
    }

    /**
     * Gets the value of the patternitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patternitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPATTERNITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PATTERNITEMType }
     * 
     * 
     */
    public List<PATTERNITEMType> getPATTERNITEM() {
        if (patternitem == null) {
            patternitem = new ArrayList<PATTERNITEMType>();
        }
        return this.patternitem;
    }

    /**
     * Gets the value of the bloodcharmitem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bloodcharmitem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBLOODCHARMITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MAGICITEMType }
     * 
     * 
     */
    public List<MAGICITEMType> getBLOODCHARMITEM() {
        if (bloodcharmitem == null) {
            bloodcharmitem = new ArrayList<MAGICITEMType>();
        }
        return this.bloodcharmitem;
    }

    /**
     * Gets the value of the threaditem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threaditem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTHREADITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link THREADITEMType }
     * 
     * 
     */
    public List<THREADITEMType> getTHREADITEM() {
        if (threaditem == null) {
            threaditem = new ArrayList<THREADITEMType>();
        }
        return this.threaditem;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getITEM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ITEMType }
     * 
     * 
     */
    public List<ITEMType> getITEM() {
        if (item == null) {
            item = new ArrayList<ITEMType>();
        }
        return this.item;
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
