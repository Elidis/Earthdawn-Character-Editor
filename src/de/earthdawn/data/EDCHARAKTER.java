//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.07 at 08:00:39 PM MEZ 
//


package de.earthdawn.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="ATTRIBUTE" type="{http://earthdawn.com}ATTRIBUTE_type" maxOccurs="unbounded"/>
 *         &lt;element name="DEFENSE" type="{http://earthdawn.com}DEFENSE_type"/>
 *         &lt;element name="HEALTH" type="{http://earthdawn.com}HEALTH_type"/>
 *         &lt;element name="MOVEMENT" type="{http://earthdawn.com}MOVEMENT_type"/>
 *         &lt;element name="INITIATIVE" type="{http://earthdawn.com}INITIATIVE_type"/>
 *         &lt;element name="CARRYING" type="{http://earthdawn.com}CARRYING_type"/>
 *         &lt;element name="KARMA" type="{http://earthdawn.com}KARMA_type"/>
 *         &lt;element name="EXPERIENCE" type="{http://earthdawn.com}EXPERIENCE_type"/>
 *         &lt;element name="DISCIPLINE" type="{http://earthdawn.com}DISCIPLINE_type" maxOccurs="3"/>
 *         &lt;element name="PROTECTION" type="{http://earthdawn.com}PROTECTION_type"/>
 *         &lt;element name="TALENTS" type="{http://earthdawn.com}TALENTS_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SPELLS" type="{http://earthdawn.com}SPELLS_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SKILL" type="{http://earthdawn.com}SKILL_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="WEAPON" type="{http://earthdawn.com}WEAPON_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MAGICITEM" type="{http://earthdawn.com}MAGICITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PATTERNITEM" type="{http://earthdawn.com}PATTERNITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ITEM" type="{http://earthdawn.com}ITEM_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="COINS" type="{http://earthdawn.com}COINS_type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KARMARITUAL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RACEABILITES" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMMENT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PORTRAIT" type="{http://www.w3.org/2001/XMLSchema}base64Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="APPEARANCE" type="{http://earthdawn.com}APPEARANCE_type"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "attributeOrDEFENSEOrHEALTH"
})
@XmlRootElement(name = "EDCHARAKTER")
public class EDCHARAKTER {

    @XmlElementRefs({
        @XmlElementRef(name = "CARRYING", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "TALENTS", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "COINS", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "DISCIPLINE", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "SPELLS", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "DEFENSE", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "MOVEMENT", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "HEALTH", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "ITEM", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "SKILL", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "DESCRIPTION", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "EXPERIENCE", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "INITIATIVE", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "COMMENT", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "KARMA", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "PORTRAIT", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "PROTECTION", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "PATTERNITEM", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "WEAPON", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "RACEABILITES", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "APPEARANCE", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "ATTRIBUTE", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "KARMARITUAL", namespace = "http://earthdawn.com", type = JAXBElement.class),
        @XmlElementRef(name = "MAGICITEM", namespace = "http://earthdawn.com", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> attributeOrDEFENSEOrHEALTH;
    @XmlAttribute(required = true)
    protected String name;

    /**
     * Gets the value of the attributeOrDEFENSEOrHEALTH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeOrDEFENSEOrHEALTH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATTRIBUTEOrDEFENSEOrHEALTH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CARRYINGType }{@code >}
     * {@link JAXBElement }{@code <}{@link TALENTSType }{@code >}
     * {@link JAXBElement }{@code <}{@link COINSType }{@code >}
     * {@link JAXBElement }{@code <}{@link DISCIPLINEType }{@code >}
     * {@link JAXBElement }{@code <}{@link HEALTHType }{@code >}
     * {@link JAXBElement }{@code <}{@link MOVEMENTType }{@code >}
     * {@link JAXBElement }{@code <}{@link DEFENSEType }{@code >}
     * {@link JAXBElement }{@code <}{@link SPELLSType }{@code >}
     * {@link JAXBElement }{@code <}{@link ITEMType }{@code >}
     * {@link JAXBElement }{@code <}{@link SKILLType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link EXPERIENCEType }{@code >}
     * {@link JAXBElement }{@code <}{@link INITIATIVEType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link KARMAType }{@code >}
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * {@link JAXBElement }{@code <}{@link PROTECTIONType }{@code >}
     * {@link JAXBElement }{@code <}{@link PATTERNITEMType }{@code >}
     * {@link JAXBElement }{@code <}{@link WEAPONType }{@code >}
     * {@link JAXBElement }{@code <}{@link APPEARANCEType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ATTRIBUTEType }{@code >}
     * {@link JAXBElement }{@code <}{@link MAGICITEMType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getATTRIBUTEOrDEFENSEOrHEALTH() {
        if (attributeOrDEFENSEOrHEALTH == null) {
            attributeOrDEFENSEOrHEALTH = new ArrayList<JAXBElement<?>>();
        }
        return this.attributeOrDEFENSEOrHEALTH;
    }

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

}