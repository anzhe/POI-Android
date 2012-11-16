/*
 * XML Type:  CT_Fonts
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_Fonts(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTFonts extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTFonts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctfonts6623type");
    
    /**
     * Gets a List of "font" elements
     */
    java.util.List<org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont> getFontList();
    
    /**
     * Gets array of all "font" elements
     * @deprecated
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont[] getFontArray();
    
    /**
     * Gets ith "font" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont getFontArray(int i);
    
    /**
     * Returns number of "font" element
     */
    int sizeOfFontArray();
    
    /**
     * Sets array of all "font" element
     */
    void setFontArray(org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont[] fontArray);
    
    /**
     * Sets ith "font" element
     */
    void setFontArray(int i, org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont font);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "font" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont insertNewFont(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "font" element
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont addNewFont();
    
    /**
     * Removes the ith "font" element
     */
    void removeFont(int i);
    
    /**
     * Gets the "count" attribute
     */
    long getCount();
    
    /**
     * Gets (as xml) the "count" attribute
     */
    org.apache.xmlbeans.XmlUnsignedInt xgetCount();
    
    /**
     * True if has "count" attribute
     */
    boolean isSetCount();
    
    /**
     * Sets the "count" attribute
     */
    void setCount(long count);
    
    /**
     * Sets (as xml) the "count" attribute
     */
    void xsetCount(org.apache.xmlbeans.XmlUnsignedInt count);
    
    /**
     * Unsets the "count" attribute
     */
    void unsetCount();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
