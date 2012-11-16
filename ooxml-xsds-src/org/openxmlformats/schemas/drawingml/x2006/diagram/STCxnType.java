/*
 * XML Type:  ST_CxnType
 * Namespace: http://schemas.openxmlformats.org/drawingml/2006/diagram
 * Java type: org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.drawingml.x2006.diagram;


/**
 * An XML ST_CxnType(@http://schemas.openxmlformats.org/drawingml/2006/diagram).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType.
 */
public interface STCxnType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STCxnType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("stcxntypeca58type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PAR_OF = Enum.forString("parOf");
    static final Enum PRES_OF = Enum.forString("presOf");
    static final Enum PRES_PAR_OF = Enum.forString("presParOf");
    static final Enum UNKNOWN_RELATIONSHIP = Enum.forString("unknownRelationship");
    
    static final int INT_PAR_OF = Enum.INT_PAR_OF;
    static final int INT_PRES_OF = Enum.INT_PRES_OF;
    static final int INT_PRES_PAR_OF = Enum.INT_PRES_PAR_OF;
    static final int INT_UNKNOWN_RELATIONSHIP = Enum.INT_UNKNOWN_RELATIONSHIP;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.drawingml.x2006.diagram.STCxnType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PAR_OF
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_PAR_OF = 1;
        static final int INT_PRES_OF = 2;
        static final int INT_PRES_PAR_OF = 3;
        static final int INT_UNKNOWN_RELATIONSHIP = 4;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("parOf", INT_PAR_OF),
                new Enum("presOf", INT_PRES_OF),
                new Enum("presParOf", INT_PRES_PAR_OF),
                new Enum("unknownRelationship", INT_UNKNOWN_RELATIONSHIP),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
