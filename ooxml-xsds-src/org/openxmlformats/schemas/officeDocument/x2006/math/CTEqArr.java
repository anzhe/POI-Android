/*
 * XML Type:  CT_EqArr
 * Namespace: http://schemas.openxmlformats.org/officeDocument/2006/math
 * Java type: org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArr
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.officeDocument.x2006.math;


/**
 * An XML CT_EqArr(@http://schemas.openxmlformats.org/officeDocument/2006/math).
 *
 * This is a complex type.
 */
public interface CTEqArr extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CTEqArr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sE130CAA0A01A7CDE5A2B4FEB8B311707").resolveHandle("cteqarr9667type");
    
    /**
     * Gets the "eqArrPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr getEqArrPr();
    
    /**
     * True if has "eqArrPr" element
     */
    boolean isSetEqArrPr();
    
    /**
     * Sets the "eqArrPr" element
     */
    void setEqArrPr(org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr eqArrPr);
    
    /**
     * Appends and returns a new empty "eqArrPr" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTEqArrPr addNewEqArrPr();
    
    /**
     * Unsets the "eqArrPr" element
     */
    void unsetEqArrPr();
    
    /**
     * Gets a List of "e" elements
     */
    java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg> getEList();
    
    /**
     * Gets array of all "e" elements
     * @deprecated
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg[] getEArray();
    
    /**
     * Gets ith "e" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg getEArray(int i);
    
    /**
     * Returns number of "e" element
     */
    int sizeOfEArray();
    
    /**
     * Sets array of all "e" element
     */
    void setEArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg[] eArray);
    
    /**
     * Sets ith "e" element
     */
    void setEArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg e);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "e" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg insertNewE(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "e" element
     */
    org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathArg addNewE();
    
    /**
     * Removes the ith "e" element
     */
    void removeE(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
}
