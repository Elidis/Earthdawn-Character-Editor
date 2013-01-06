//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemkind_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="itemkind_type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="ammunition"/>
 *     &lt;enumeration value="amulet"/>
 *     &lt;enumeration value="animal"/>
 *     &lt;enumeration value="armor"/>
 *     &lt;enumeration value="artisan"/>
 *     &lt;enumeration value="book"/>
 *     &lt;enumeration value="brooch"/>
 *     &lt;enumeration value="cloth"/>
 *     &lt;enumeration value="coins"/>
 *     &lt;enumeration value="drink"/>
 *     &lt;enumeration value="food"/>
 *     &lt;enumeration value="gems"/>
 *     &lt;enumeration value="instrument"/>
 *     &lt;enumeration value="kit"/>
 *     &lt;enumeration value="light"/>
 *     &lt;enumeration value="melee weapon"/>
 *     &lt;enumeration value="missile weapon"/>
 *     &lt;enumeration value="mount"/>
 *     &lt;enumeration value="paper"/>
 *     &lt;enumeration value="pot"/>
 *     &lt;enumeration value="potion"/>
 *     &lt;enumeration value="ration"/>
 *     &lt;enumeration value="ring"/>
 *     &lt;enumeration value="salve"/>
 *     &lt;enumeration value="shield"/>
 *     &lt;enumeration value="talisman"/>
 *     &lt;enumeration value="throwing weapon"/>
 *     &lt;enumeration value="tool"/>
 *     &lt;enumeration value="transport"/>
 *     &lt;enumeration value="vambrace"/>
 *     &lt;enumeration value="wand"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "itemkind_type")
@XmlEnum
public enum ItemkindType {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("ammunition")
    AMMUNITION("ammunition"),
    @XmlEnumValue("amulet")
    AMULET("amulet"),
    @XmlEnumValue("animal")
    ANIMAL("animal"),
    @XmlEnumValue("armor")
    ARMOR("armor"),
    @XmlEnumValue("artisan")
    ARTISAN("artisan"),
    @XmlEnumValue("book")
    BOOK("book"),
    @XmlEnumValue("brooch")
    BROOCH("brooch"),
    @XmlEnumValue("cloth")
    CLOTH("cloth"),
    @XmlEnumValue("coins")
    COINS("coins"),
    @XmlEnumValue("drink")
    DRINK("drink"),
    @XmlEnumValue("food")
    FOOD("food"),
    @XmlEnumValue("gems")
    GEMS("gems"),
    @XmlEnumValue("instrument")
    INSTRUMENT("instrument"),
    @XmlEnumValue("kit")
    KIT("kit"),
    @XmlEnumValue("light")
    LIGHT("light"),
    @XmlEnumValue("melee weapon")
    MELEE_WEAPON("melee weapon"),
    @XmlEnumValue("missile weapon")
    MISSILE_WEAPON("missile weapon"),
    @XmlEnumValue("mount")
    MOUNT("mount"),
    @XmlEnumValue("paper")
    PAPER("paper"),
    @XmlEnumValue("pot")
    POT("pot"),
    @XmlEnumValue("potion")
    POTION("potion"),
    @XmlEnumValue("ration")
    RATION("ration"),
    @XmlEnumValue("ring")
    RING("ring"),
    @XmlEnumValue("salve")
    SALVE("salve"),
    @XmlEnumValue("shield")
    SHIELD("shield"),
    @XmlEnumValue("talisman")
    TALISMAN("talisman"),
    @XmlEnumValue("throwing weapon")
    THROWING_WEAPON("throwing weapon"),
    @XmlEnumValue("tool")
    TOOL("tool"),
    @XmlEnumValue("transport")
    TRANSPORT("transport"),
    @XmlEnumValue("vambrace")
    VAMBRACE("vambrace"),
    @XmlEnumValue("wand")
    WAND("wand");
    private final String value;

    ItemkindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemkindType fromValue(String v) {
        for (ItemkindType c: ItemkindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
