//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: see version control commit date
//


package de.earthdawn.data;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.earthdawn.data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DISCIPLINEKARMASTEP_QNAME = new QName("http://earthdawn.com/discipline", "KARMASTEP");
    private final static QName _DISCIPLINEDEFENSE_QNAME = new QName("http://earthdawn.com/discipline", "DEFENSE");
    private final static QName _DISCIPLINEDISCIPLINETALENT_QNAME = new QName("http://earthdawn.com/discipline", "DISCIPLINETALENT");
    private final static QName _DISCIPLINESPELL_QNAME = new QName("http://earthdawn.com/discipline", "SPELL");
    private final static QName _DISCIPLINERECOVERYTEST_QNAME = new QName("http://earthdawn.com/discipline", "RECOVERYTEST");
    private final static QName _DISCIPLINEKARMA_QNAME = new QName("http://earthdawn.com/discipline", "KARMA");
    private final static QName _DISCIPLINEINITIATIVE_QNAME = new QName("http://earthdawn.com/discipline", "INITIATIVE");
    private final static QName _DISCIPLINEOPTIONALTALENT_QNAME = new QName("http://earthdawn.com/discipline", "OPTIONALTALENT");
    private final static QName _DISCIPLINEABILITY_QNAME = new QName("http://earthdawn.com/discipline", "ABILITY");
    private final static QName _HEALTHTypeRECOVERY_QNAME = new QName("http://earthdawn.com/datatypes", "RECOVERY");
    private final static QName _HEALTHTypeWOUNDS_QNAME = new QName("http://earthdawn.com/datatypes", "WOUNDS");
    private final static QName _HEALTHTypeDEATH_QNAME = new QName("http://earthdawn.com/datatypes", "DEATH");
    private final static QName _HEALTHTypeUNCONSCIOUSNESS_QNAME = new QName("http://earthdawn.com/datatypes", "UNCONSCIOUSNESS");
    private final static QName _TALENTSTypeOPTIONALTALENT_QNAME = new QName("http://earthdawn.com/character", "OPTIONALTALENT");
    private final static QName _TALENTSTypeDISZIPLINETALENT_QNAME = new QName("http://earthdawn.com/character", "DISZIPLINETALENT");
    private final static QName _EDCHARACTERCOINS_QNAME = new QName("http://earthdawn.com/character", "COINS");
    private final static QName _EDCHARACTERMOVEMENT_QNAME = new QName("http://earthdawn.com/character", "MOVEMENT");
    private final static QName _EDCHARACTERKARMA_QNAME = new QName("http://earthdawn.com/character", "KARMA");
    private final static QName _EDCHARACTERHEALTH_QNAME = new QName("http://earthdawn.com/character", "HEALTH");
    private final static QName _EDCHARACTERDISCIPLINE_QNAME = new QName("http://earthdawn.com/character", "DISCIPLINE");
    private final static QName _EDCHARACTERATTRIBUTE_QNAME = new QName("http://earthdawn.com/character", "ATTRIBUTE");
    private final static QName _EDCHARACTERPATTERNITEM_QNAME = new QName("http://earthdawn.com/character", "PATTERNITEM");
    private final static QName _EDCHARACTERPORTRAIT_QNAME = new QName("http://earthdawn.com/character", "PORTRAIT");
    private final static QName _EDCHARACTERTALENTS_QNAME = new QName("http://earthdawn.com/character", "TALENTS");
    private final static QName _EDCHARACTERCARRYING_QNAME = new QName("http://earthdawn.com/character", "CARRYING");
    private final static QName _EDCHARACTERDEFENSE_QNAME = new QName("http://earthdawn.com/character", "DEFENSE");
    private final static QName _EDCHARACTERDESCRIPTION_QNAME = new QName("http://earthdawn.com/character", "DESCRIPTION");
    private final static QName _EDCHARACTERITEM_QNAME = new QName("http://earthdawn.com/character", "ITEM");
    private final static QName _EDCHARACTERCOMMENT_QNAME = new QName("http://earthdawn.com/character", "COMMENT");
    private final static QName _EDCHARACTERINITIATIVE_QNAME = new QName("http://earthdawn.com/character", "INITIATIVE");
    private final static QName _EDCHARACTERWEAPON_QNAME = new QName("http://earthdawn.com/character", "WEAPON");
    private final static QName _EDCHARACTEREXPERIENCE_QNAME = new QName("http://earthdawn.com/character", "EXPERIENCE");
    private final static QName _EDCHARACTERAPPEARANCE_QNAME = new QName("http://earthdawn.com/character", "APPEARANCE");
    private final static QName _EDCHARACTERRACEABILITES_QNAME = new QName("http://earthdawn.com/character", "RACEABILITES");
    private final static QName _EDCHARACTERSPELLS_QNAME = new QName("http://earthdawn.com/character", "SPELLS");
    private final static QName _EDCHARACTERPROTECTION_QNAME = new QName("http://earthdawn.com/character", "PROTECTION");
    private final static QName _EDCHARACTERKARMARITUAL_QNAME = new QName("http://earthdawn.com/character", "KARMARITUAL");
    private final static QName _EDCHARACTERMAGICITEM_QNAME = new QName("http://earthdawn.com/character", "MAGICITEM");
    private final static QName _EDCHARACTERSKILL_QNAME = new QName("http://earthdawn.com/character", "SKILL");
    private final static QName _CAPABILITIESSKILL_QNAME = new QName("http://earthdawn.com/capability", "SKILL");
    private final static QName _CAPABILITIESTALENT_QNAME = new QName("http://earthdawn.com/capability", "TALENT");
    private final static QName _KNACKSSKILLKNACK_QNAME = new QName("http://earthdawn.com/knack", "SKILLKNACK");
    private final static QName _KNACKSTALENTKNACK_QNAME = new QName("http://earthdawn.com/knack", "TALENTKNACK");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.earthdawn.data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CIRCLENAMEType }
     * 
     */
    public CIRCLENAMEType createCIRCLENAMEType() {
        return new CIRCLENAMEType();
    }

    /**
     * Create an instance of {@link CARRYINGType }
     * 
     */
    public CARRYINGType createCARRYINGType() {
        return new CARRYINGType();
    }

    /**
     * Create an instance of {@link CHARACTERISTICS }
     * 
     */
    public CHARACTERISTICS createCHARACTERISTICS() {
        return new CHARACTERISTICS();
    }

    /**
     * Create an instance of {@link INITIATIVEType }
     * 
     */
    public INITIATIVEType createINITIATIVEType() {
        return new INITIATIVEType();
    }

    /**
     * Create an instance of {@link CAPABILITIES }
     * 
     */
    public CAPABILITIES createCAPABILITIES() {
        return new CAPABILITIES();
    }

    /**
     * Create an instance of {@link KNACKS }
     * 
     */
    public KNACKS createKNACKS() {
        return new KNACKS();
    }

    /**
     * Create an instance of {@link KNACKType }
     * 
     */
    public KNACKType createKNACKType() {
        return new KNACKType();
    }

    /**
     * Create an instance of {@link CHARACTERISTICSENCUMBRANCE }
     * 
     */
    public CHARACTERISTICSENCUMBRANCE createCHARACTERISTICSENCUMBRANCE() {
        return new CHARACTERISTICSENCUMBRANCE();
    }

    /**
     * Create an instance of {@link SPELLType }
     * 
     */
    public SPELLType createSPELLType() {
        return new SPELLType();
    }

    /**
     * Create an instance of {@link HEALTHType }
     * 
     */
    public HEALTHType createHEALTHType() {
        return new HEALTHType();
    }

    /**
     * Create an instance of {@link KNACKBASEType }
     * 
     */
    public KNACKBASEType createKNACKBASEType() {
        return new KNACKBASEType();
    }

    /**
     * Create an instance of {@link NAMEGIVERABILITYType }
     * 
     */
    public NAMEGIVERABILITYType createNAMEGIVERABILITYType() {
        return new NAMEGIVERABILITYType();
    }

    /**
     * Create an instance of {@link DEFENSEType }
     * 
     */
    public DEFENSEType createDEFENSEType() {
        return new DEFENSEType();
    }

    /**
     * Create an instance of {@link DEFENSEABILITYType }
     * 
     */
    public DEFENSEABILITYType createDEFENSEABILITYType() {
        return new DEFENSEABILITYType();
    }

    /**
     * Create an instance of {@link ARMORType }
     * 
     */
    public ARMORType createARMORType() {
        return new ARMORType();
    }

    /**
     * Create an instance of {@link DISZIPINABILITYType }
     * 
     */
    public DISZIPINABILITYType createDISZIPINABILITYType() {
        return new DISZIPINABILITYType();
    }

    /**
     * Create an instance of {@link CHARACTERISTICSHEALTHRATING }
     * 
     */
    public CHARACTERISTICSHEALTHRATING createCHARACTERISTICSHEALTHRATING() {
        return new CHARACTERISTICSHEALTHRATING();
    }

    /**
     * Create an instance of {@link EXPERIENCEType }
     * 
     */
    public EXPERIENCEType createEXPERIENCEType() {
        return new EXPERIENCEType();
    }

    /**
     * Create an instance of {@link ATTRIBUTEType }
     * 
     */
    public ATTRIBUTEType createATTRIBUTEType() {
        return new ATTRIBUTEType();
    }

    /**
     * Create an instance of {@link THREADRANKType }
     * 
     */
    public THREADRANKType createTHREADRANKType() {
        return new THREADRANKType();
    }

    /**
     * Create an instance of {@link NAMEGIVERS }
     * 
     */
    public NAMEGIVERS createNAMEGIVERS() {
        return new NAMEGIVERS();
    }

    /**
     * Create an instance of {@link SPELLS }
     * 
     */
    public SPELLS createSPELLS() {
        return new SPELLS();
    }

    /**
     * Create an instance of {@link LEGENDPOINTSType }
     * 
     */
    public LEGENDPOINTSType createLEGENDPOINTSType() {
        return new LEGENDPOINTSType();
    }

    /**
     * Create an instance of {@link STEPDICEType }
     * 
     */
    public STEPDICEType createSTEPDICEType() {
        return new STEPDICEType();
    }

    /**
     * Create an instance of {@link CAPABILITYType }
     * 
     */
    public CAPABILITYType createCAPABILITYType() {
        return new CAPABILITYType();
    }

    /**
     * Create an instance of {@link MAGICITEMType }
     * 
     */
    public MAGICITEMType createMAGICITEMType() {
        return new MAGICITEMType();
    }

    /**
     * Create an instance of {@link PATTERNITEMType }
     * 
     */
    public PATTERNITEMType createPATTERNITEMType() {
        return new PATTERNITEMType();
    }

    /**
     * Create an instance of {@link ITEMType }
     * 
     */
    public ITEMType createITEMType() {
        return new ITEMType();
    }

    /**
     * Create an instance of {@link TALENTSType }
     * 
     */
    public TALENTSType createTALENTSType() {
        return new TALENTSType();
    }

    /**
     * Create an instance of {@link TALENTABILITYType }
     * 
     */
    public TALENTABILITYType createTALENTABILITYType() {
        return new TALENTABILITYType();
    }

    /**
     * Create an instance of {@link WOUNDType }
     * 
     */
    public WOUNDType createWOUNDType() {
        return new WOUNDType();
    }

    /**
     * Create an instance of {@link SPELLDEFType }
     * 
     */
    public SPELLDEFType createSPELLDEFType() {
        return new SPELLDEFType();
    }

    /**
     * Create an instance of {@link APPEARANCEType }
     * 
     */
    public APPEARANCEType createAPPEARANCEType() {
        return new APPEARANCEType();
    }

    /**
     * Create an instance of {@link RANKType }
     * 
     */
    public RANKType createRANKType() {
        return new RANKType();
    }

    /**
     * Create an instance of {@link DISCIPLINE }
     * 
     */
    public DISCIPLINE createDISCIPLINE() {
        return new DISCIPLINE();
    }

    /**
     * Create an instance of {@link CHARACTERISTICSDEFENSERAITING }
     * 
     */
    public CHARACTERISTICSDEFENSERAITING createCHARACTERISTICSDEFENSERAITING() {
        return new CHARACTERISTICSDEFENSERAITING();
    }

    /**
     * Create an instance of {@link DISCIPLINEType }
     * 
     */
    public DISCIPLINEType createDISCIPLINEType() {
        return new DISCIPLINEType();
    }

    /**
     * Create an instance of {@link DEATHType }
     * 
     */
    public DEATHType createDEATHType() {
        return new DEATHType();
    }

    /**
     * Create an instance of {@link NAMEGIVERMOVEMENTType }
     * 
     */
    public NAMEGIVERMOVEMENTType createNAMEGIVERMOVEMENTType() {
        return new NAMEGIVERMOVEMENTType();
    }

    /**
     * Create an instance of {@link WEAPONType }
     * 
     */
    public WEAPONType createWEAPONType() {
        return new WEAPONType();
    }

    /**
     * Create an instance of {@link KARMAABILITYType }
     * 
     */
    public KARMAABILITYType createKARMAABILITYType() {
        return new KARMAABILITYType();
    }

    /**
     * Create an instance of {@link TALENTType }
     * 
     */
    public TALENTType createTALENTType() {
        return new TALENTType();
    }

    /**
     * Create an instance of {@link RECOVERYType }
     * 
     */
    public RECOVERYType createRECOVERYType() {
        return new RECOVERYType();
    }

    /**
     * Create an instance of {@link KARMAType }
     * 
     */
    public KARMAType createKARMAType() {
        return new KARMAType();
    }

    /**
     * Create an instance of {@link SPELLSType }
     * 
     */
    public SPELLSType createSPELLSType() {
        return new SPELLSType();
    }

    /**
     * Create an instance of {@link CHARACTERISTICSATTRIBUTECOST }
     * 
     */
    public CHARACTERISTICSATTRIBUTECOST createCHARACTERISTICSATTRIBUTECOST() {
        return new CHARACTERISTICSATTRIBUTECOST();
    }

    /**
     * Create an instance of {@link NAMEVALUEType }
     * 
     */
    public NAMEVALUEType createNAMEVALUEType() {
        return new NAMEVALUEType();
    }

    /**
     * Create an instance of {@link MOVEMENTType }
     * 
     */
    public MOVEMENTType createMOVEMENTType() {
        return new MOVEMENTType();
    }

    /**
     * Create an instance of {@link COINSType }
     * 
     */
    public COINSType createCOINSType() {
        return new COINSType();
    }

    /**
     * Create an instance of {@link CHARACTERISTICSSTEPDICETABLE }
     * 
     */
    public CHARACTERISTICSSTEPDICETABLE createCHARACTERISTICSSTEPDICETABLE() {
        return new CHARACTERISTICSSTEPDICETABLE();
    }

    /**
     * Create an instance of {@link SHIELDType }
     * 
     */
    public SHIELDType createSHIELDType() {
        return new SHIELDType();
    }

    /**
     * Create an instance of {@link EDCHARACTER }
     * 
     */
    public EDCHARACTER createEDCHARACTER() {
        return new EDCHARACTER();
    }

    /**
     * Create an instance of {@link CHARACTERISTICSMYSTICARMOR }
     * 
     */
    public CHARACTERISTICSMYSTICARMOR createCHARACTERISTICSMYSTICARMOR() {
        return new CHARACTERISTICSMYSTICARMOR();
    }

    /**
     * Create an instance of {@link PROTECTIONType }
     * 
     */
    public PROTECTIONType createPROTECTIONType() {
        return new PROTECTIONType();
    }

    /**
     * Create an instance of {@link SKILLType }
     * 
     */
    public SKILLType createSKILLType() {
        return new SKILLType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DISZIPINABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "KARMASTEP", scope = DISCIPLINE.class)
    public JAXBElement<DISZIPINABILITYType> createDISCIPLINEKARMASTEP(DISZIPINABILITYType value) {
        return new JAXBElement<DISZIPINABILITYType>(_DISCIPLINEKARMASTEP_QNAME, DISZIPINABILITYType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DEFENSEABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "DEFENSE", scope = DISCIPLINE.class)
    public JAXBElement<DEFENSEABILITYType> createDISCIPLINEDEFENSE(DEFENSEABILITYType value) {
        return new JAXBElement<DEFENSEABILITYType>(_DISCIPLINEDEFENSE_QNAME, DEFENSEABILITYType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TALENTABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "DISCIPLINETALENT", scope = DISCIPLINE.class)
    public JAXBElement<TALENTABILITYType> createDISCIPLINEDISCIPLINETALENT(TALENTABILITYType value) {
        return new JAXBElement<TALENTABILITYType>(_DISCIPLINEDISCIPLINETALENT_QNAME, TALENTABILITYType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIRCLENAMEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "SPELL", scope = DISCIPLINE.class)
    public JAXBElement<CIRCLENAMEType> createDISCIPLINESPELL(CIRCLENAMEType value) {
        return new JAXBElement<CIRCLENAMEType>(_DISCIPLINESPELL_QNAME, CIRCLENAMEType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DISZIPINABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "RECOVERYTEST", scope = DISCIPLINE.class)
    public JAXBElement<DISZIPINABILITYType> createDISCIPLINERECOVERYTEST(DISZIPINABILITYType value) {
        return new JAXBElement<DISZIPINABILITYType>(_DISCIPLINERECOVERYTEST_QNAME, DISZIPINABILITYType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KARMAABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "KARMA", scope = DISCIPLINE.class)
    public JAXBElement<KARMAABILITYType> createDISCIPLINEKARMA(KARMAABILITYType value) {
        return new JAXBElement<KARMAABILITYType>(_DISCIPLINEKARMA_QNAME, KARMAABILITYType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DISZIPINABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "INITIATIVE", scope = DISCIPLINE.class)
    public JAXBElement<DISZIPINABILITYType> createDISCIPLINEINITIATIVE(DISZIPINABILITYType value) {
        return new JAXBElement<DISZIPINABILITYType>(_DISCIPLINEINITIATIVE_QNAME, DISZIPINABILITYType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TALENTABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "OPTIONALTALENT", scope = DISCIPLINE.class)
    public JAXBElement<TALENTABILITYType> createDISCIPLINEOPTIONALTALENT(TALENTABILITYType value) {
        return new JAXBElement<TALENTABILITYType>(_DISCIPLINEOPTIONALTALENT_QNAME, TALENTABILITYType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIRCLENAMEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/discipline", name = "ABILITY", scope = DISCIPLINE.class)
    public JAXBElement<CIRCLENAMEType> createDISCIPLINEABILITY(CIRCLENAMEType value) {
        return new JAXBElement<CIRCLENAMEType>(_DISCIPLINEABILITY_QNAME, CIRCLENAMEType.class, DISCIPLINE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RECOVERYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/datatypes", name = "RECOVERY", scope = HEALTHType.class)
    public JAXBElement<RECOVERYType> createHEALTHTypeRECOVERY(RECOVERYType value) {
        return new JAXBElement<RECOVERYType>(_HEALTHTypeRECOVERY_QNAME, RECOVERYType.class, HEALTHType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WOUNDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/datatypes", name = "WOUNDS", scope = HEALTHType.class)
    public JAXBElement<WOUNDType> createHEALTHTypeWOUNDS(WOUNDType value) {
        return new JAXBElement<WOUNDType>(_HEALTHTypeWOUNDS_QNAME, WOUNDType.class, HEALTHType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DEATHType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/datatypes", name = "DEATH", scope = HEALTHType.class)
    public JAXBElement<DEATHType> createHEALTHTypeDEATH(DEATHType value) {
        return new JAXBElement<DEATHType>(_HEALTHTypeDEATH_QNAME, DEATHType.class, HEALTHType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DEATHType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/datatypes", name = "UNCONSCIOUSNESS", scope = HEALTHType.class)
    public JAXBElement<DEATHType> createHEALTHTypeUNCONSCIOUSNESS(DEATHType value) {
        return new JAXBElement<DEATHType>(_HEALTHTypeUNCONSCIOUSNESS_QNAME, DEATHType.class, HEALTHType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TALENTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "OPTIONALTALENT", scope = TALENTSType.class)
    public JAXBElement<TALENTType> createTALENTSTypeOPTIONALTALENT(TALENTType value) {
        return new JAXBElement<TALENTType>(_TALENTSTypeOPTIONALTALENT_QNAME, TALENTType.class, TALENTSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TALENTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "DISZIPLINETALENT", scope = TALENTSType.class)
    public JAXBElement<TALENTType> createTALENTSTypeDISZIPLINETALENT(TALENTType value) {
        return new JAXBElement<TALENTType>(_TALENTSTypeDISZIPLINETALENT_QNAME, TALENTType.class, TALENTSType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COINSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "COINS", scope = EDCHARACTER.class)
    public JAXBElement<COINSType> createEDCHARACTERCOINS(COINSType value) {
        return new JAXBElement<COINSType>(_EDCHARACTERCOINS_QNAME, COINSType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MOVEMENTType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "MOVEMENT", scope = EDCHARACTER.class)
    public JAXBElement<MOVEMENTType> createEDCHARACTERMOVEMENT(MOVEMENTType value) {
        return new JAXBElement<MOVEMENTType>(_EDCHARACTERMOVEMENT_QNAME, MOVEMENTType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KARMAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "KARMA", scope = EDCHARACTER.class)
    public JAXBElement<KARMAType> createEDCHARACTERKARMA(KARMAType value) {
        return new JAXBElement<KARMAType>(_EDCHARACTERKARMA_QNAME, KARMAType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HEALTHType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "HEALTH", scope = EDCHARACTER.class)
    public JAXBElement<HEALTHType> createEDCHARACTERHEALTH(HEALTHType value) {
        return new JAXBElement<HEALTHType>(_EDCHARACTERHEALTH_QNAME, HEALTHType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DISCIPLINEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "DISCIPLINE", scope = EDCHARACTER.class)
    public JAXBElement<DISCIPLINEType> createEDCHARACTERDISCIPLINE(DISCIPLINEType value) {
        return new JAXBElement<DISCIPLINEType>(_EDCHARACTERDISCIPLINE_QNAME, DISCIPLINEType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATTRIBUTEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "ATTRIBUTE", scope = EDCHARACTER.class)
    public JAXBElement<ATTRIBUTEType> createEDCHARACTERATTRIBUTE(ATTRIBUTEType value) {
        return new JAXBElement<ATTRIBUTEType>(_EDCHARACTERATTRIBUTE_QNAME, ATTRIBUTEType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PATTERNITEMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "PATTERNITEM", scope = EDCHARACTER.class)
    public JAXBElement<PATTERNITEMType> createEDCHARACTERPATTERNITEM(PATTERNITEMType value) {
        return new JAXBElement<PATTERNITEMType>(_EDCHARACTERPATTERNITEM_QNAME, PATTERNITEMType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "PORTRAIT", scope = EDCHARACTER.class)
    public JAXBElement<byte[]> createEDCHARACTERPORTRAIT(byte[] value) {
        return new JAXBElement<byte[]>(_EDCHARACTERPORTRAIT_QNAME, byte[].class, EDCHARACTER.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TALENTSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "TALENTS", scope = EDCHARACTER.class)
    public JAXBElement<TALENTSType> createEDCHARACTERTALENTS(TALENTSType value) {
        return new JAXBElement<TALENTSType>(_EDCHARACTERTALENTS_QNAME, TALENTSType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CARRYINGType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "CARRYING", scope = EDCHARACTER.class)
    public JAXBElement<CARRYINGType> createEDCHARACTERCARRYING(CARRYINGType value) {
        return new JAXBElement<CARRYINGType>(_EDCHARACTERCARRYING_QNAME, CARRYINGType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DEFENSEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "DEFENSE", scope = EDCHARACTER.class)
    public JAXBElement<DEFENSEType> createEDCHARACTERDEFENSE(DEFENSEType value) {
        return new JAXBElement<DEFENSEType>(_EDCHARACTERDEFENSE_QNAME, DEFENSEType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "DESCRIPTION", scope = EDCHARACTER.class)
    public JAXBElement<String> createEDCHARACTERDESCRIPTION(String value) {
        return new JAXBElement<String>(_EDCHARACTERDESCRIPTION_QNAME, String.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ITEMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "ITEM", scope = EDCHARACTER.class)
    public JAXBElement<ITEMType> createEDCHARACTERITEM(ITEMType value) {
        return new JAXBElement<ITEMType>(_EDCHARACTERITEM_QNAME, ITEMType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "COMMENT", scope = EDCHARACTER.class)
    public JAXBElement<String> createEDCHARACTERCOMMENT(String value) {
        return new JAXBElement<String>(_EDCHARACTERCOMMENT_QNAME, String.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link INITIATIVEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "INITIATIVE", scope = EDCHARACTER.class)
    public JAXBElement<INITIATIVEType> createEDCHARACTERINITIATIVE(INITIATIVEType value) {
        return new JAXBElement<INITIATIVEType>(_EDCHARACTERINITIATIVE_QNAME, INITIATIVEType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WEAPONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "WEAPON", scope = EDCHARACTER.class)
    public JAXBElement<WEAPONType> createEDCHARACTERWEAPON(WEAPONType value) {
        return new JAXBElement<WEAPONType>(_EDCHARACTERWEAPON_QNAME, WEAPONType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EXPERIENCEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "EXPERIENCE", scope = EDCHARACTER.class)
    public JAXBElement<EXPERIENCEType> createEDCHARACTEREXPERIENCE(EXPERIENCEType value) {
        return new JAXBElement<EXPERIENCEType>(_EDCHARACTEREXPERIENCE_QNAME, EXPERIENCEType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link APPEARANCEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "APPEARANCE", scope = EDCHARACTER.class)
    public JAXBElement<APPEARANCEType> createEDCHARACTERAPPEARANCE(APPEARANCEType value) {
        return new JAXBElement<APPEARANCEType>(_EDCHARACTERAPPEARANCE_QNAME, APPEARANCEType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "RACEABILITES", scope = EDCHARACTER.class)
    public JAXBElement<String> createEDCHARACTERRACEABILITES(String value) {
        return new JAXBElement<String>(_EDCHARACTERRACEABILITES_QNAME, String.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SPELLSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "SPELLS", scope = EDCHARACTER.class)
    public JAXBElement<SPELLSType> createEDCHARACTERSPELLS(SPELLSType value) {
        return new JAXBElement<SPELLSType>(_EDCHARACTERSPELLS_QNAME, SPELLSType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PROTECTIONType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "PROTECTION", scope = EDCHARACTER.class)
    public JAXBElement<PROTECTIONType> createEDCHARACTERPROTECTION(PROTECTIONType value) {
        return new JAXBElement<PROTECTIONType>(_EDCHARACTERPROTECTION_QNAME, PROTECTIONType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "KARMARITUAL", scope = EDCHARACTER.class)
    public JAXBElement<String> createEDCHARACTERKARMARITUAL(String value) {
        return new JAXBElement<String>(_EDCHARACTERKARMARITUAL_QNAME, String.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MAGICITEMType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "MAGICITEM", scope = EDCHARACTER.class)
    public JAXBElement<MAGICITEMType> createEDCHARACTERMAGICITEM(MAGICITEMType value) {
        return new JAXBElement<MAGICITEMType>(_EDCHARACTERMAGICITEM_QNAME, MAGICITEMType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SKILLType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/character", name = "SKILL", scope = EDCHARACTER.class)
    public JAXBElement<SKILLType> createEDCHARACTERSKILL(SKILLType value) {
        return new JAXBElement<SKILLType>(_EDCHARACTERSKILL_QNAME, SKILLType.class, EDCHARACTER.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAPABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/capability", name = "SKILL", scope = CAPABILITIES.class)
    public JAXBElement<CAPABILITYType> createCAPABILITIESSKILL(CAPABILITYType value) {
        return new JAXBElement<CAPABILITYType>(_CAPABILITIESSKILL_QNAME, CAPABILITYType.class, CAPABILITIES.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAPABILITYType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/capability", name = "TALENT", scope = CAPABILITIES.class)
    public JAXBElement<CAPABILITYType> createCAPABILITIESTALENT(CAPABILITYType value) {
        return new JAXBElement<CAPABILITYType>(_CAPABILITIESTALENT_QNAME, CAPABILITYType.class, CAPABILITIES.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KNACKBASEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/knack", name = "SKILLKNACK", scope = KNACKS.class)
    public JAXBElement<KNACKBASEType> createKNACKSSKILLKNACK(KNACKBASEType value) {
        return new JAXBElement<KNACKBASEType>(_KNACKSSKILLKNACK_QNAME, KNACKBASEType.class, KNACKS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KNACKBASEType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://earthdawn.com/knack", name = "TALENTKNACK", scope = KNACKS.class)
    public JAXBElement<KNACKBASEType> createKNACKSTALENTKNACK(KNACKBASEType value) {
        return new JAXBElement<KNACKBASEType>(_KNACKSTALENTKNACK_QNAME, KNACKBASEType.class, KNACKS.class, value);
    }

}
