/*
 * XML Type:  ST_TLOleChartBuildType
 * Namespace: http://schemas.openxmlformats.org/presentationml/2006/main
 * Java type: org.openxmlformats.schemas.presentationml.x2006.main.STTLOleChartBuildType
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.presentationml.x2006.main;


/**
 * An XML ST_TLOleChartBuildType(@http://schemas.openxmlformats.org/presentationml/2006/main).
 *
 * This is an atomic type that is a restriction of org.openxmlformats.schemas.presentationml.x2006.main.STTLOleChartBuildType.
 */
public interface STTLOleChartBuildType extends org.apache.xmlbeans.XmlToken
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(STTLOleChartBuildType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("sttlolechartbuildtype0dc5type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ALL_AT_ONCE = Enum.forString("allAtOnce");
    static final Enum SERIES = Enum.forString("series");
    static final Enum CATEGORY = Enum.forString("category");
    static final Enum SERIES_EL = Enum.forString("seriesEl");
    static final Enum CATEGORY_EL = Enum.forString("categoryEl");
    
    static final int INT_ALL_AT_ONCE = Enum.INT_ALL_AT_ONCE;
    static final int INT_SERIES = Enum.INT_SERIES;
    static final int INT_CATEGORY = Enum.INT_CATEGORY;
    static final int INT_SERIES_EL = Enum.INT_SERIES_EL;
    static final int INT_CATEGORY_EL = Enum.INT_CATEGORY_EL;
    
    /**
     * Enumeration value class for org.openxmlformats.schemas.presentationml.x2006.main.STTLOleChartBuildType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ALL_AT_ONCE
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
        
        static final int INT_ALL_AT_ONCE = 1;
        static final int INT_SERIES = 2;
        static final int INT_CATEGORY = 3;
        static final int INT_SERIES_EL = 4;
        static final int INT_CATEGORY_EL = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("allAtOnce", INT_ALL_AT_ONCE),
                new Enum("series", INT_SERIES),
                new Enum("category", INT_CATEGORY),
                new Enum("seriesEl", INT_SERIES_EL),
                new Enum("categoryEl", INT_CATEGORY_EL),
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
