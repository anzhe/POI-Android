/*
 * XML Type:  CT_UnderlineProperty
 * Namespace: http://schemas.openxmlformats.org/spreadsheetml/2006/main
 * Java type: org.openxmlformats.schemas.spreadsheetml.x2006.main.CTUnderlineProperty
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.spreadsheetml.x2006.main;


/**
 * An XML CT_UnderlineProperty(@http://schemas.openxmlformats.org/spreadsheetml/2006/main).
 *
 * This is a complex type.
 */
public interface CTUnderlineProperty extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTUnderlineProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("ctunderlineproperty8e20type");
    
    /**
     * Gets the "val" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.Enum getVal();
    
    /**
     * Gets (as xml) the "val" attribute
     */
    org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues xgetVal();
    
    /**
     * True if has "val" attribute
     */
    boolean isSetVal();
    
    /**
     * Sets the "val" attribute
     */
    void setVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues.Enum val);
    
    /**
     * Sets (as xml) the "val" attribute
     */
    void xsetVal(org.openxmlformats.schemas.spreadsheetml.x2006.main.STUnderlineValues val);
    
    /**
     * Unsets the "val" attribute
     */
    void unsetVal();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
