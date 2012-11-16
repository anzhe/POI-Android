/*
 * XML Type:  ST_StrokeArrowType
 * Namespace: urn:schemas-microsoft-com:vml
 * Java type: schemasMicrosoftComVml.STStrokeArrowType
 *
 * Automatically generated - do not modify.
 */
package schemasMicrosoftComVml;


/**
 * An XML ST_StrokeArrowType(@urn:schemas-microsoft-com:vml).
 *
 * This is an atomic type that is a restriction of schemasMicrosoftComVml.STStrokeArrowType.
 */
public interface STStrokeArrowType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STStrokeArrowType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ststrokearrowtype7b4ftype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum NONE = Enum.forString("none");
    static final Enum BLOCK = Enum.forString("block");
    static final Enum CLASSIC = Enum.forString("classic");
    static final Enum OVAL = Enum.forString("oval");
    static final Enum DIAMOND = Enum.forString("diamond");
    static final Enum OPEN = Enum.forString("open");
    
    static final int INT_NONE = Enum.INT_NONE;
    static final int INT_BLOCK = Enum.INT_BLOCK;
    static final int INT_CLASSIC = Enum.INT_CLASSIC;
    static final int INT_OVAL = Enum.INT_OVAL;
    static final int INT_DIAMOND = Enum.INT_DIAMOND;
    static final int INT_OPEN = Enum.INT_OPEN;
    
    /**
     * Enumeration value class for schemasMicrosoftComVml.STStrokeArrowType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_NONE
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
        
        static final int INT_NONE = 1;
        static final int INT_BLOCK = 2;
        static final int INT_CLASSIC = 3;
        static final int INT_OVAL = 4;
        static final int INT_DIAMOND = 5;
        static final int INT_OPEN = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("none", INT_NONE),
                new Enum("block", INT_BLOCK),
                new Enum("classic", INT_CLASSIC),
                new Enum("oval", INT_OVAL),
                new Enum("diamond", INT_DIAMOND),
                new Enum("open", INT_OPEN),
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
