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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPELL_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPELL_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earthdawn.com/datatypes}SPELLDEF_type">
 *       &lt;attribute name="inmatrix" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *       &lt;attribute name="byspellability" type="{http://earthdawn.com/datatypes}yesno_type" default="no" />
 *       &lt;attribute name="type" use="required" type="{http://earthdawn.com/datatypes}spellkind_type" />
 *       &lt;attribute name="circle" use="required" type="{http://earthdawn.com/datatypes}circle_type" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPELL_type")
public class SPELLType
    extends SPELLDEFType
{

    @XmlAttribute(name = "inmatrix")
    protected YesnoType inmatrix;
    @XmlAttribute(name = "byspellability")
    protected YesnoType byspellability;
    @XmlAttribute(name = "type", required = true)
    protected SpellkindType type;
    @XmlAttribute(name = "circle", required = true)
    protected int circle;

    /**
     * Gets the value of the inmatrix property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getInmatrix() {
        if (inmatrix == null) {
            return YesnoType.NO;
        } else {
            return inmatrix;
        }
    }

    /**
     * Sets the value of the inmatrix property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setInmatrix(YesnoType value) {
        this.inmatrix = value;
    }

    /**
     * Gets the value of the byspellability property.
     * 
     * @return
     *     possible object is
     *     {@link YesnoType }
     *     
     */
    public YesnoType getByspellability() {
        if (byspellability == null) {
            return YesnoType.NO;
        } else {
            return byspellability;
        }
    }

    /**
     * Sets the value of the byspellability property.
     * 
     * @param value
     *     allowed object is
     *     {@link YesnoType }
     *     
     */
    public void setByspellability(YesnoType value) {
        this.byspellability = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SpellkindType }
     *     
     */
    public SpellkindType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpellkindType }
     *     
     */
    public void setType(SpellkindType value) {
        this.type = value;
    }

    /**
     * Gets the value of the circle property.
     * 
     */
    public int getCircle() {
        return circle;
    }

    /**
     * Sets the value of the circle property.
     * 
     */
    public void setCircle(int value) {
        this.circle = value;
    }

}
