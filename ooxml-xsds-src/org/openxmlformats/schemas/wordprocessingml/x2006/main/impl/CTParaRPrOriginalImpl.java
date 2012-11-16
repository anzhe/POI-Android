/*
 * XML Type:  CT_ParaRPrOriginal
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPrOriginal
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_ParaRPrOriginal(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTParaRPrOriginalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTParaRPrOriginal
{
    
    public CTParaRPrOriginalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INS$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
    private static final javax.xml.namespace.QName DEL$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
    private static final javax.xml.namespace.QName MOVEFROM$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFrom");
    private static final javax.xml.namespace.QName MOVETO$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveTo");
    private static final javax.xml.namespace.QName RSTYLE$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rStyle");
    private static final javax.xml.namespace.QName RFONTS$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rFonts");
    private static final javax.xml.namespace.QName B$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "b");
    private static final javax.xml.namespace.QName BCS$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bCs");
    private static final javax.xml.namespace.QName I$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "i");
    private static final javax.xml.namespace.QName ICS$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "iCs");
    private static final javax.xml.namespace.QName CAPS$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "caps");
    private static final javax.xml.namespace.QName SMALLCAPS$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "smallCaps");
    private static final javax.xml.namespace.QName STRIKE$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "strike");
    private static final javax.xml.namespace.QName DSTRIKE$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "dstrike");
    private static final javax.xml.namespace.QName OUTLINE$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "outline");
    private static final javax.xml.namespace.QName SHADOW$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shadow");
    private static final javax.xml.namespace.QName EMBOSS$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "emboss");
    private static final javax.xml.namespace.QName IMPRINT$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "imprint");
    private static final javax.xml.namespace.QName NOPROOF$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "noProof");
    private static final javax.xml.namespace.QName SNAPTOGRID$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "snapToGrid");
    private static final javax.xml.namespace.QName VANISH$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vanish");
    private static final javax.xml.namespace.QName WEBHIDDEN$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "webHidden");
    private static final javax.xml.namespace.QName COLOR$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "color");
    private static final javax.xml.namespace.QName SPACING$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "spacing");
    private static final javax.xml.namespace.QName W$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");
    private static final javax.xml.namespace.QName KERN$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "kern");
    private static final javax.xml.namespace.QName POSITION$52 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "position");
    private static final javax.xml.namespace.QName SZ$54 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "sz");
    private static final javax.xml.namespace.QName SZCS$56 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "szCs");
    private static final javax.xml.namespace.QName HIGHLIGHT$58 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "highlight");
    private static final javax.xml.namespace.QName U$60 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "u");
    private static final javax.xml.namespace.QName EFFECT$62 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "effect");
    private static final javax.xml.namespace.QName BDR$64 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bdr");
    private static final javax.xml.namespace.QName SHD$66 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "shd");
    private static final javax.xml.namespace.QName FITTEXT$68 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "fitText");
    private static final javax.xml.namespace.QName VERTALIGN$70 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "vertAlign");
    private static final javax.xml.namespace.QName RTL$72 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "rtl");
    private static final javax.xml.namespace.QName CS$74 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cs");
    private static final javax.xml.namespace.QName EM$76 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "em");
    private static final javax.xml.namespace.QName LANG$78 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "lang");
    private static final javax.xml.namespace.QName EASTASIANLAYOUT$80 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "eastAsianLayout");
    private static final javax.xml.namespace.QName SPECVANISH$82 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "specVanish");
    private static final javax.xml.namespace.QName OMATH$84 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "oMath");
    
    
    /**
     * Gets the "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(INS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ins" element
     */
    public boolean isSetIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INS$0) != 0;
        }
    }
    
    /**
     * Sets the "ins" element
     */
    public void setIns(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange ins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(INS$0, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(INS$0);
            }
            target.set(ins);
        }
    }
    
    /**
     * Appends and returns a new empty "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(INS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ins" element
     */
    public void unsetIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INS$0, 0);
        }
    }
    
    /**
     * Gets the "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(DEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "del" element
     */
    public boolean isSetDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEL$2) != 0;
        }
    }
    
    /**
     * Sets the "del" element
     */
    public void setDel(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange del)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(DEL$2, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(DEL$2);
            }
            target.set(del);
        }
    }
    
    /**
     * Appends and returns a new empty "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(DEL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "del" element
     */
    public void unsetDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEL$2, 0);
        }
    }
    
    /**
     * Gets the "moveFrom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getMoveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(MOVEFROM$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "moveFrom" element
     */
    public boolean isSetMoveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVEFROM$4) != 0;
        }
    }
    
    /**
     * Sets the "moveFrom" element
     */
    public void setMoveFrom(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange moveFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(MOVEFROM$4, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(MOVEFROM$4);
            }
            target.set(moveFrom);
        }
    }
    
    /**
     * Appends and returns a new empty "moveFrom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewMoveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(MOVEFROM$4);
            return target;
        }
    }
    
    /**
     * Unsets the "moveFrom" element
     */
    public void unsetMoveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVEFROM$4, 0);
        }
    }
    
    /**
     * Gets the "moveTo" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getMoveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(MOVETO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "moveTo" element
     */
    public boolean isSetMoveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVETO$6) != 0;
        }
    }
    
    /**
     * Sets the "moveTo" element
     */
    public void setMoveTo(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange moveTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(MOVETO$6, 0);
            if (target == null)
            {
                target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(MOVETO$6);
            }
            target.set(moveTo);
        }
    }
    
    /**
     * Appends and returns a new empty "moveTo" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewMoveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(MOVETO$6);
            return target;
        }
    }
    
    /**
     * Unsets the "moveTo" element
     */
    public void unsetMoveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVETO$6, 0);
        }
    }
    
    /**
     * Gets a List of "rStyle" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString> getRStyleList()
    {
        final class RStyleList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString get(int i)
                { return CTParaRPrOriginalImpl.this.getRStyleArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTParaRPrOriginalImpl.this.getRStyleArray(i);
                CTParaRPrOriginalImpl.this.setRStyleArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString o)
                { CTParaRPrOriginalImpl.this.insertNewRStyle(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString old = CTParaRPrOriginalImpl.this.getRStyleArray(i);
                CTParaRPrOriginalImpl.this.removeRStyle(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfRStyleArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RStyleList();
        }
    }
    
    /**
     * Gets array of all "rStyle" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] getRStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RSTYLE$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString getRStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(RSTYLE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rStyle" element
     */
    public int sizeOfRStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSTYLE$8);
        }
    }
    
    /**
     * Sets array of all "rStyle" element
     */
    public void setRStyleArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString[] rStyleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rStyleArray, RSTYLE$8);
        }
    }
    
    /**
     * Sets ith "rStyle" element
     */
    public void setRStyleArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString rStyle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().find_element_user(RSTYLE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rStyle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString insertNewRStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().insert_element_user(RSTYLE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rStyle" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString addNewRStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString)get_store().add_element_user(RSTYLE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "rStyle" element
     */
    public void removeRStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSTYLE$8, i);
        }
    }
    
    /**
     * Gets a List of "rFonts" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts> getRFontsList()
    {
        final class RFontsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts get(int i)
                { return CTParaRPrOriginalImpl.this.getRFontsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts old = CTParaRPrOriginalImpl.this.getRFontsArray(i);
                CTParaRPrOriginalImpl.this.setRFontsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts o)
                { CTParaRPrOriginalImpl.this.insertNewRFonts(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts old = CTParaRPrOriginalImpl.this.getRFontsArray(i);
                CTParaRPrOriginalImpl.this.removeRFonts(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfRFontsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RFontsList();
        }
    }
    
    /**
     * Gets array of all "rFonts" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts[] getRFontsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RFONTS$10, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts getRFontsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts)get_store().find_element_user(RFONTS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rFonts" element
     */
    public int sizeOfRFontsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RFONTS$10);
        }
    }
    
    /**
     * Sets array of all "rFonts" element
     */
    public void setRFontsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts[] rFontsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rFontsArray, RFONTS$10);
        }
    }
    
    /**
     * Sets ith "rFonts" element
     */
    public void setRFontsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts rFonts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts)get_store().find_element_user(RFONTS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rFonts);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts insertNewRFonts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts)get_store().insert_element_user(RFONTS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rFonts" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts addNewRFonts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts)get_store().add_element_user(RFONTS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "rFonts" element
     */
    public void removeRFonts(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RFONTS$10, i);
        }
    }
    
    /**
     * Gets a List of "b" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getBList()
    {
        final class BList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getBArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getBArray(i);
                CTParaRPrOriginalImpl.this.setBArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewB(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getBArray(i);
                CTParaRPrOriginalImpl.this.removeB(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfBArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BList();
        }
    }
    
    /**
     * Gets array of all "b" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(B$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "b" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(B$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "b" element
     */
    public int sizeOfBArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(B$12);
        }
    }
    
    /**
     * Sets array of all "b" element
     */
    public void setBArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] bArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bArray, B$12);
        }
    }
    
    /**
     * Sets ith "b" element
     */
    public void setBArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff b)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(B$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(b);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "b" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(B$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "b" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(B$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "b" element
     */
    public void removeB(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(B$12, i);
        }
    }
    
    /**
     * Gets a List of "bCs" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getBCsList()
    {
        final class BCsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getBCsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getBCsArray(i);
                CTParaRPrOriginalImpl.this.setBCsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewBCs(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getBCsArray(i);
                CTParaRPrOriginalImpl.this.removeBCs(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfBCsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BCsList();
        }
    }
    
    /**
     * Gets array of all "bCs" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getBCsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BCS$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getBCsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BCS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bCs" element
     */
    public int sizeOfBCsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BCS$14);
        }
    }
    
    /**
     * Sets array of all "bCs" element
     */
    public void setBCsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] bCsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bCsArray, BCS$14);
        }
    }
    
    /**
     * Sets ith "bCs" element
     */
    public void setBCsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff bCs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(BCS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bCs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewBCs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(BCS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewBCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(BCS$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "bCs" element
     */
    public void removeBCs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BCS$14, i);
        }
    }
    
    /**
     * Gets a List of "i" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getIList()
    {
        final class IList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getIArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getIArray(i);
                CTParaRPrOriginalImpl.this.setIArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewI(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getIArray(i);
                CTParaRPrOriginalImpl.this.removeI(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfIArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IList();
        }
    }
    
    /**
     * Gets array of all "i" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(I$16, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "i" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getIArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(I$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "i" element
     */
    public int sizeOfIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(I$16);
        }
    }
    
    /**
     * Sets array of all "i" element
     */
    public void setIArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] iValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iValueArray, I$16);
        }
    }
    
    /**
     * Sets ith "i" element
     */
    public void setIArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff iValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(I$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "i" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(I$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "i" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(I$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "i" element
     */
    public void removeI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(I$16, i);
        }
    }
    
    /**
     * Gets a List of "iCs" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getICsList()
    {
        final class ICsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getICsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getICsArray(i);
                CTParaRPrOriginalImpl.this.setICsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewICs(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getICsArray(i);
                CTParaRPrOriginalImpl.this.removeICs(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfICsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ICsList();
        }
    }
    
    /**
     * Gets array of all "iCs" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getICsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ICS$18, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "iCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getICsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ICS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "iCs" element
     */
    public int sizeOfICsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ICS$18);
        }
    }
    
    /**
     * Sets array of all "iCs" element
     */
    public void setICsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] iCsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(iCsArray, ICS$18);
        }
    }
    
    /**
     * Sets ith "iCs" element
     */
    public void setICsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff iCs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(ICS$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(iCs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "iCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewICs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(ICS$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "iCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewICs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(ICS$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "iCs" element
     */
    public void removeICs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ICS$18, i);
        }
    }
    
    /**
     * Gets a List of "caps" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getCapsList()
    {
        final class CapsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getCapsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getCapsArray(i);
                CTParaRPrOriginalImpl.this.setCapsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewCaps(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getCapsArray(i);
                CTParaRPrOriginalImpl.this.removeCaps(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfCapsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CapsList();
        }
    }
    
    /**
     * Gets array of all "caps" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getCapsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAPS$20, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "caps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getCapsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CAPS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "caps" element
     */
    public int sizeOfCapsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPS$20);
        }
    }
    
    /**
     * Sets array of all "caps" element
     */
    public void setCapsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] capsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(capsArray, CAPS$20);
        }
    }
    
    /**
     * Sets ith "caps" element
     */
    public void setCapsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff caps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CAPS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(caps);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "caps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewCaps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(CAPS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "caps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewCaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(CAPS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "caps" element
     */
    public void removeCaps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPS$20, i);
        }
    }
    
    /**
     * Gets a List of "smallCaps" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getSmallCapsList()
    {
        final class SmallCapsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getSmallCapsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getSmallCapsArray(i);
                CTParaRPrOriginalImpl.this.setSmallCapsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewSmallCaps(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getSmallCapsArray(i);
                CTParaRPrOriginalImpl.this.removeSmallCaps(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfSmallCapsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SmallCapsList();
        }
    }
    
    /**
     * Gets array of all "smallCaps" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getSmallCapsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SMALLCAPS$22, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "smallCaps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSmallCapsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SMALLCAPS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "smallCaps" element
     */
    public int sizeOfSmallCapsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMALLCAPS$22);
        }
    }
    
    /**
     * Sets array of all "smallCaps" element
     */
    public void setSmallCapsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] smallCapsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(smallCapsArray, SMALLCAPS$22);
        }
    }
    
    /**
     * Sets ith "smallCaps" element
     */
    public void setSmallCapsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff smallCaps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SMALLCAPS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(smallCaps);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "smallCaps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewSmallCaps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(SMALLCAPS$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "smallCaps" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSmallCaps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SMALLCAPS$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "smallCaps" element
     */
    public void removeSmallCaps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMALLCAPS$22, i);
        }
    }
    
    /**
     * Gets a List of "strike" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getStrikeList()
    {
        final class StrikeList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getStrikeArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getStrikeArray(i);
                CTParaRPrOriginalImpl.this.setStrikeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewStrike(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getStrikeArray(i);
                CTParaRPrOriginalImpl.this.removeStrike(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfStrikeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new StrikeList();
        }
    }
    
    /**
     * Gets array of all "strike" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getStrikeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRIKE$24, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "strike" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getStrikeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(STRIKE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "strike" element
     */
    public int sizeOfStrikeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRIKE$24);
        }
    }
    
    /**
     * Sets array of all "strike" element
     */
    public void setStrikeArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] strikeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(strikeArray, STRIKE$24);
        }
    }
    
    /**
     * Sets ith "strike" element
     */
    public void setStrikeArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff strike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(STRIKE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(strike);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "strike" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewStrike(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(STRIKE$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "strike" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewStrike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(STRIKE$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "strike" element
     */
    public void removeStrike(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRIKE$24, i);
        }
    }
    
    /**
     * Gets a List of "dstrike" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getDstrikeList()
    {
        final class DstrikeList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getDstrikeArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getDstrikeArray(i);
                CTParaRPrOriginalImpl.this.setDstrikeArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewDstrike(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getDstrikeArray(i);
                CTParaRPrOriginalImpl.this.removeDstrike(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfDstrikeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DstrikeList();
        }
    }
    
    /**
     * Gets array of all "dstrike" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getDstrikeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DSTRIKE$26, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dstrike" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getDstrikeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DSTRIKE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dstrike" element
     */
    public int sizeOfDstrikeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DSTRIKE$26);
        }
    }
    
    /**
     * Sets array of all "dstrike" element
     */
    public void setDstrikeArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] dstrikeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dstrikeArray, DSTRIKE$26);
        }
    }
    
    /**
     * Sets ith "dstrike" element
     */
    public void setDstrikeArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff dstrike)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(DSTRIKE$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dstrike);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dstrike" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewDstrike(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(DSTRIKE$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dstrike" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewDstrike()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(DSTRIKE$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "dstrike" element
     */
    public void removeDstrike(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DSTRIKE$26, i);
        }
    }
    
    /**
     * Gets a List of "outline" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getOutlineList()
    {
        final class OutlineList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getOutlineArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getOutlineArray(i);
                CTParaRPrOriginalImpl.this.setOutlineArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewOutline(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getOutlineArray(i);
                CTParaRPrOriginalImpl.this.removeOutline(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfOutlineArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OutlineList();
        }
    }
    
    /**
     * Gets array of all "outline" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getOutlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTLINE$28, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "outline" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getOutlineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(OUTLINE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "outline" element
     */
    public int sizeOfOutlineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTLINE$28);
        }
    }
    
    /**
     * Sets array of all "outline" element
     */
    public void setOutlineArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] outlineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outlineArray, OUTLINE$28);
        }
    }
    
    /**
     * Sets ith "outline" element
     */
    public void setOutlineArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff outline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(OUTLINE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outline);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outline" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewOutline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(OUTLINE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outline" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewOutline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(OUTLINE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "outline" element
     */
    public void removeOutline(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTLINE$28, i);
        }
    }
    
    /**
     * Gets a List of "shadow" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getShadowList()
    {
        final class ShadowList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getShadowArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getShadowArray(i);
                CTParaRPrOriginalImpl.this.setShadowArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewShadow(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getShadowArray(i);
                CTParaRPrOriginalImpl.this.removeShadow(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfShadowArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShadowList();
        }
    }
    
    /**
     * Gets array of all "shadow" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getShadowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHADOW$30, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "shadow" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getShadowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SHADOW$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "shadow" element
     */
    public int sizeOfShadowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHADOW$30);
        }
    }
    
    /**
     * Sets array of all "shadow" element
     */
    public void setShadowArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] shadowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shadowArray, SHADOW$30);
        }
    }
    
    /**
     * Sets ith "shadow" element
     */
    public void setShadowArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff shadow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SHADOW$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shadow);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shadow" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewShadow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(SHADOW$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shadow" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewShadow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SHADOW$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "shadow" element
     */
    public void removeShadow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHADOW$30, i);
        }
    }
    
    /**
     * Gets a List of "emboss" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getEmbossList()
    {
        final class EmbossList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getEmbossArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getEmbossArray(i);
                CTParaRPrOriginalImpl.this.setEmbossArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewEmboss(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getEmbossArray(i);
                CTParaRPrOriginalImpl.this.removeEmboss(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfEmbossArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EmbossList();
        }
    }
    
    /**
     * Gets array of all "emboss" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getEmbossArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMBOSS$32, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "emboss" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getEmbossArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(EMBOSS$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "emboss" element
     */
    public int sizeOfEmbossArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBOSS$32);
        }
    }
    
    /**
     * Sets array of all "emboss" element
     */
    public void setEmbossArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] embossArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(embossArray, EMBOSS$32);
        }
    }
    
    /**
     * Sets ith "emboss" element
     */
    public void setEmbossArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff emboss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(EMBOSS$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(emboss);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "emboss" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewEmboss(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(EMBOSS$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "emboss" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewEmboss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(EMBOSS$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "emboss" element
     */
    public void removeEmboss(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBOSS$32, i);
        }
    }
    
    /**
     * Gets a List of "imprint" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getImprintList()
    {
        final class ImprintList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getImprintArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getImprintArray(i);
                CTParaRPrOriginalImpl.this.setImprintArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewImprint(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getImprintArray(i);
                CTParaRPrOriginalImpl.this.removeImprint(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfImprintArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ImprintList();
        }
    }
    
    /**
     * Gets array of all "imprint" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getImprintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPRINT$34, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "imprint" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getImprintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(IMPRINT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "imprint" element
     */
    public int sizeOfImprintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPRINT$34);
        }
    }
    
    /**
     * Sets array of all "imprint" element
     */
    public void setImprintArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] imprintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(imprintArray, IMPRINT$34);
        }
    }
    
    /**
     * Sets ith "imprint" element
     */
    public void setImprintArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff imprint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(IMPRINT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(imprint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "imprint" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewImprint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(IMPRINT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "imprint" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewImprint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(IMPRINT$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "imprint" element
     */
    public void removeImprint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPRINT$34, i);
        }
    }
    
    /**
     * Gets a List of "noProof" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getNoProofList()
    {
        final class NoProofList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getNoProofArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getNoProofArray(i);
                CTParaRPrOriginalImpl.this.setNoProofArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewNoProof(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getNoProofArray(i);
                CTParaRPrOriginalImpl.this.removeNoProof(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfNoProofArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NoProofList();
        }
    }
    
    /**
     * Gets array of all "noProof" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getNoProofArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOPROOF$36, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "noProof" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getNoProofArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOPROOF$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "noProof" element
     */
    public int sizeOfNoProofArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOPROOF$36);
        }
    }
    
    /**
     * Sets array of all "noProof" element
     */
    public void setNoProofArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] noProofArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(noProofArray, NOPROOF$36);
        }
    }
    
    /**
     * Sets ith "noProof" element
     */
    public void setNoProofArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff noProof)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(NOPROOF$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(noProof);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "noProof" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewNoProof(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(NOPROOF$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "noProof" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewNoProof()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(NOPROOF$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "noProof" element
     */
    public void removeNoProof(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOPROOF$36, i);
        }
    }
    
    /**
     * Gets a List of "snapToGrid" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getSnapToGridList()
    {
        final class SnapToGridList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getSnapToGridArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getSnapToGridArray(i);
                CTParaRPrOriginalImpl.this.setSnapToGridArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewSnapToGrid(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getSnapToGridArray(i);
                CTParaRPrOriginalImpl.this.removeSnapToGrid(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfSnapToGridArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SnapToGridList();
        }
    }
    
    /**
     * Gets array of all "snapToGrid" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getSnapToGridArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SNAPTOGRID$38, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "snapToGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSnapToGridArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SNAPTOGRID$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "snapToGrid" element
     */
    public int sizeOfSnapToGridArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SNAPTOGRID$38);
        }
    }
    
    /**
     * Sets array of all "snapToGrid" element
     */
    public void setSnapToGridArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] snapToGridArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(snapToGridArray, SNAPTOGRID$38);
        }
    }
    
    /**
     * Sets ith "snapToGrid" element
     */
    public void setSnapToGridArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff snapToGrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SNAPTOGRID$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(snapToGrid);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "snapToGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewSnapToGrid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(SNAPTOGRID$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "snapToGrid" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSnapToGrid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SNAPTOGRID$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "snapToGrid" element
     */
    public void removeSnapToGrid(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SNAPTOGRID$38, i);
        }
    }
    
    /**
     * Gets a List of "vanish" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getVanishList()
    {
        final class VanishList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getVanishArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getVanishArray(i);
                CTParaRPrOriginalImpl.this.setVanishArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewVanish(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getVanishArray(i);
                CTParaRPrOriginalImpl.this.removeVanish(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfVanishArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new VanishList();
        }
    }
    
    /**
     * Gets array of all "vanish" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getVanishArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VANISH$40, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "vanish" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getVanishArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(VANISH$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "vanish" element
     */
    public int sizeOfVanishArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VANISH$40);
        }
    }
    
    /**
     * Sets array of all "vanish" element
     */
    public void setVanishArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] vanishArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(vanishArray, VANISH$40);
        }
    }
    
    /**
     * Sets ith "vanish" element
     */
    public void setVanishArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff vanish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(VANISH$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(vanish);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vanish" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewVanish(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(VANISH$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vanish" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewVanish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(VANISH$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "vanish" element
     */
    public void removeVanish(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VANISH$40, i);
        }
    }
    
    /**
     * Gets a List of "webHidden" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getWebHiddenList()
    {
        final class WebHiddenList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getWebHiddenArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getWebHiddenArray(i);
                CTParaRPrOriginalImpl.this.setWebHiddenArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewWebHidden(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getWebHiddenArray(i);
                CTParaRPrOriginalImpl.this.removeWebHidden(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfWebHiddenArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WebHiddenList();
        }
    }
    
    /**
     * Gets array of all "webHidden" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getWebHiddenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEBHIDDEN$42, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "webHidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getWebHiddenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(WEBHIDDEN$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "webHidden" element
     */
    public int sizeOfWebHiddenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEBHIDDEN$42);
        }
    }
    
    /**
     * Sets array of all "webHidden" element
     */
    public void setWebHiddenArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] webHiddenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(webHiddenArray, WEBHIDDEN$42);
        }
    }
    
    /**
     * Sets ith "webHidden" element
     */
    public void setWebHiddenArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff webHidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(WEBHIDDEN$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(webHidden);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "webHidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewWebHidden(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(WEBHIDDEN$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "webHidden" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewWebHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(WEBHIDDEN$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "webHidden" element
     */
    public void removeWebHidden(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEBHIDDEN$42, i);
        }
    }
    
    /**
     * Gets a List of "color" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor> getColorList()
    {
        final class ColorList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor get(int i)
                { return CTParaRPrOriginalImpl.this.getColorArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor old = CTParaRPrOriginalImpl.this.getColorArray(i);
                CTParaRPrOriginalImpl.this.setColorArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor o)
                { CTParaRPrOriginalImpl.this.insertNewColor(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor old = CTParaRPrOriginalImpl.this.getColorArray(i);
                CTParaRPrOriginalImpl.this.removeColor(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfColorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ColorList();
        }
    }
    
    /**
     * Gets array of all "color" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor[] getColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLOR$44, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "color" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor getColorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().find_element_user(COLOR$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "color" element
     */
    public int sizeOfColorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLOR$44);
        }
    }
    
    /**
     * Sets array of all "color" element
     */
    public void setColorArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor[] colorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colorArray, COLOR$44);
        }
    }
    
    /**
     * Sets ith "color" element
     */
    public void setColorArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().find_element_user(COLOR$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(color);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "color" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor insertNewColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().insert_element_user(COLOR$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "color" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor addNewColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTColor)get_store().add_element_user(COLOR$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "color" element
     */
    public void removeColor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLOR$44, i);
        }
    }
    
    /**
     * Gets a List of "spacing" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure> getSpacingList()
    {
        final class SpacingList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure get(int i)
                { return CTParaRPrOriginalImpl.this.getSpacingArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure old = CTParaRPrOriginalImpl.this.getSpacingArray(i);
                CTParaRPrOriginalImpl.this.setSpacingArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure o)
                { CTParaRPrOriginalImpl.this.insertNewSpacing(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure old = CTParaRPrOriginalImpl.this.getSpacingArray(i);
                CTParaRPrOriginalImpl.this.removeSpacing(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfSpacingArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SpacingList();
        }
    }
    
    /**
     * Gets array of all "spacing" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure[] getSpacingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPACING$46, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "spacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure getSpacingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(SPACING$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "spacing" element
     */
    public int sizeOfSpacingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPACING$46);
        }
    }
    
    /**
     * Sets array of all "spacing" element
     */
    public void setSpacingArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure[] spacingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(spacingArray, SPACING$46);
        }
    }
    
    /**
     * Sets ith "spacing" element
     */
    public void setSpacingArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure spacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().find_element_user(SPACING$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(spacing);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure insertNewSpacing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().insert_element_user(SPACING$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spacing" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure addNewSpacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedTwipsMeasure)get_store().add_element_user(SPACING$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "spacing" element
     */
    public void removeSpacing(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPACING$46, i);
        }
    }
    
    /**
     * Gets a List of "w" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale> getWList()
    {
        final class WList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale get(int i)
                { return CTParaRPrOriginalImpl.this.getWArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale old = CTParaRPrOriginalImpl.this.getWArray(i);
                CTParaRPrOriginalImpl.this.setWArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale o)
                { CTParaRPrOriginalImpl.this.insertNewW(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale old = CTParaRPrOriginalImpl.this.getWArray(i);
                CTParaRPrOriginalImpl.this.removeW(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfWArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WList();
        }
    }
    
    /**
     * Gets array of all "w" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale[] getWArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(W$48, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "w" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale getWArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale)get_store().find_element_user(W$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "w" element
     */
    public int sizeOfWArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(W$48);
        }
    }
    
    /**
     * Sets array of all "w" element
     */
    public void setWArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale[] wArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wArray, W$48);
        }
    }
    
    /**
     * Sets ith "w" element
     */
    public void setWArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale w)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale)get_store().find_element_user(W$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(w);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "w" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale insertNewW(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale)get_store().insert_element_user(W$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "w" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale addNewW()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextScale)get_store().add_element_user(W$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "w" element
     */
    public void removeW(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(W$48, i);
        }
    }
    
    /**
     * Gets a List of "kern" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure> getKernList()
    {
        final class KernList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure get(int i)
                { return CTParaRPrOriginalImpl.this.getKernArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure old = CTParaRPrOriginalImpl.this.getKernArray(i);
                CTParaRPrOriginalImpl.this.setKernArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure o)
                { CTParaRPrOriginalImpl.this.insertNewKern(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure old = CTParaRPrOriginalImpl.this.getKernArray(i);
                CTParaRPrOriginalImpl.this.removeKern(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfKernArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new KernList();
        }
    }
    
    /**
     * Gets array of all "kern" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] getKernArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KERN$50, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "kern" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure getKernArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(KERN$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "kern" element
     */
    public int sizeOfKernArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KERN$50);
        }
    }
    
    /**
     * Sets array of all "kern" element
     */
    public void setKernArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] kernArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(kernArray, KERN$50);
        }
    }
    
    /**
     * Sets ith "kern" element
     */
    public void setKernArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure kern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(KERN$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(kern);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "kern" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure insertNewKern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().insert_element_user(KERN$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "kern" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure addNewKern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(KERN$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "kern" element
     */
    public void removeKern(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KERN$50, i);
        }
    }
    
    /**
     * Gets a List of "position" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure> getPositionList()
    {
        final class PositionList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure get(int i)
                { return CTParaRPrOriginalImpl.this.getPositionArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure old = CTParaRPrOriginalImpl.this.getPositionArray(i);
                CTParaRPrOriginalImpl.this.setPositionArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure o)
                { CTParaRPrOriginalImpl.this.insertNewPosition(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure old = CTParaRPrOriginalImpl.this.getPositionArray(i);
                CTParaRPrOriginalImpl.this.removePosition(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfPositionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PositionList();
        }
    }
    
    /**
     * Gets array of all "position" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure[] getPositionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POSITION$52, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "position" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure getPositionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure)get_store().find_element_user(POSITION$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "position" element
     */
    public int sizeOfPositionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITION$52);
        }
    }
    
    /**
     * Sets array of all "position" element
     */
    public void setPositionArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure[] positionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(positionArray, POSITION$52);
        }
    }
    
    /**
     * Sets ith "position" element
     */
    public void setPositionArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure)get_store().find_element_user(POSITION$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(position);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "position" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure insertNewPosition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure)get_store().insert_element_user(POSITION$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "position" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure addNewPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSignedHpsMeasure)get_store().add_element_user(POSITION$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "position" element
     */
    public void removePosition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITION$52, i);
        }
    }
    
    /**
     * Gets a List of "sz" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure> getSzList()
    {
        final class SzList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure get(int i)
                { return CTParaRPrOriginalImpl.this.getSzArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure old = CTParaRPrOriginalImpl.this.getSzArray(i);
                CTParaRPrOriginalImpl.this.setSzArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure o)
                { CTParaRPrOriginalImpl.this.insertNewSz(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure old = CTParaRPrOriginalImpl.this.getSzArray(i);
                CTParaRPrOriginalImpl.this.removeSz(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfSzArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SzList();
        }
    }
    
    /**
     * Gets array of all "sz" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] getSzArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SZ$54, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure getSzArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(SZ$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sz" element
     */
    public int sizeOfSzArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SZ$54);
        }
    }
    
    /**
     * Sets array of all "sz" element
     */
    public void setSzArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] szArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(szArray, SZ$54);
        }
    }
    
    /**
     * Sets ith "sz" element
     */
    public void setSzArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure sz)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(SZ$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sz);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure insertNewSz(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().insert_element_user(SZ$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sz" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure addNewSz()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(SZ$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "sz" element
     */
    public void removeSz(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SZ$54, i);
        }
    }
    
    /**
     * Gets a List of "szCs" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure> getSzCsList()
    {
        final class SzCsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure get(int i)
                { return CTParaRPrOriginalImpl.this.getSzCsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure old = CTParaRPrOriginalImpl.this.getSzCsArray(i);
                CTParaRPrOriginalImpl.this.setSzCsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure o)
                { CTParaRPrOriginalImpl.this.insertNewSzCs(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure old = CTParaRPrOriginalImpl.this.getSzCsArray(i);
                CTParaRPrOriginalImpl.this.removeSzCs(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfSzCsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SzCsList();
        }
    }
    
    /**
     * Gets array of all "szCs" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] getSzCsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SZCS$56, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "szCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure getSzCsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(SZCS$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "szCs" element
     */
    public int sizeOfSzCsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SZCS$56);
        }
    }
    
    /**
     * Sets array of all "szCs" element
     */
    public void setSzCsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure[] szCsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(szCsArray, SZCS$56);
        }
    }
    
    /**
     * Sets ith "szCs" element
     */
    public void setSzCsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure szCs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().find_element_user(SZCS$56, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(szCs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "szCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure insertNewSzCs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().insert_element_user(SZCS$56, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "szCs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure addNewSzCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure)get_store().add_element_user(SZCS$56);
            return target;
        }
    }
    
    /**
     * Removes the ith "szCs" element
     */
    public void removeSzCs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SZCS$56, i);
        }
    }
    
    /**
     * Gets a List of "highlight" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight> getHighlightList()
    {
        final class HighlightList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight get(int i)
                { return CTParaRPrOriginalImpl.this.getHighlightArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight old = CTParaRPrOriginalImpl.this.getHighlightArray(i);
                CTParaRPrOriginalImpl.this.setHighlightArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight o)
                { CTParaRPrOriginalImpl.this.insertNewHighlight(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight old = CTParaRPrOriginalImpl.this.getHighlightArray(i);
                CTParaRPrOriginalImpl.this.removeHighlight(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfHighlightArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new HighlightList();
        }
    }
    
    /**
     * Gets array of all "highlight" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight[] getHighlightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HIGHLIGHT$58, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "highlight" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight getHighlightArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight)get_store().find_element_user(HIGHLIGHT$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "highlight" element
     */
    public int sizeOfHighlightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIGHLIGHT$58);
        }
    }
    
    /**
     * Sets array of all "highlight" element
     */
    public void setHighlightArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight[] highlightArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(highlightArray, HIGHLIGHT$58);
        }
    }
    
    /**
     * Sets ith "highlight" element
     */
    public void setHighlightArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight highlight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight)get_store().find_element_user(HIGHLIGHT$58, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(highlight);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "highlight" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight insertNewHighlight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight)get_store().insert_element_user(HIGHLIGHT$58, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "highlight" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight addNewHighlight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHighlight)get_store().add_element_user(HIGHLIGHT$58);
            return target;
        }
    }
    
    /**
     * Removes the ith "highlight" element
     */
    public void removeHighlight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIGHLIGHT$58, i);
        }
    }
    
    /**
     * Gets a List of "u" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline> getUList()
    {
        final class UList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline get(int i)
                { return CTParaRPrOriginalImpl.this.getUArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline old = CTParaRPrOriginalImpl.this.getUArray(i);
                CTParaRPrOriginalImpl.this.setUArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline o)
                { CTParaRPrOriginalImpl.this.insertNewU(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline old = CTParaRPrOriginalImpl.this.getUArray(i);
                CTParaRPrOriginalImpl.this.removeU(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfUArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UList();
        }
    }
    
    /**
     * Gets array of all "u" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline[] getUArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(U$60, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "u" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline getUArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline)get_store().find_element_user(U$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "u" element
     */
    public int sizeOfUArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(U$60);
        }
    }
    
    /**
     * Sets array of all "u" element
     */
    public void setUArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline[] uArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(uArray, U$60);
        }
    }
    
    /**
     * Sets ith "u" element
     */
    public void setUArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline u)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline)get_store().find_element_user(U$60, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(u);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "u" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline insertNewU(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline)get_store().insert_element_user(U$60, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "u" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline addNewU()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTUnderline)get_store().add_element_user(U$60);
            return target;
        }
    }
    
    /**
     * Removes the ith "u" element
     */
    public void removeU(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(U$60, i);
        }
    }
    
    /**
     * Gets a List of "effect" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect> getEffectList()
    {
        final class EffectList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect get(int i)
                { return CTParaRPrOriginalImpl.this.getEffectArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect old = CTParaRPrOriginalImpl.this.getEffectArray(i);
                CTParaRPrOriginalImpl.this.setEffectArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect o)
                { CTParaRPrOriginalImpl.this.insertNewEffect(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect old = CTParaRPrOriginalImpl.this.getEffectArray(i);
                CTParaRPrOriginalImpl.this.removeEffect(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfEffectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EffectList();
        }
    }
    
    /**
     * Gets array of all "effect" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect[] getEffectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EFFECT$62, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "effect" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect getEffectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect)get_store().find_element_user(EFFECT$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "effect" element
     */
    public int sizeOfEffectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EFFECT$62);
        }
    }
    
    /**
     * Sets array of all "effect" element
     */
    public void setEffectArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect[] effectArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(effectArray, EFFECT$62);
        }
    }
    
    /**
     * Sets ith "effect" element
     */
    public void setEffectArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect effect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect)get_store().find_element_user(EFFECT$62, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(effect);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "effect" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect insertNewEffect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect)get_store().insert_element_user(EFFECT$62, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "effect" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect addNewEffect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTextEffect)get_store().add_element_user(EFFECT$62);
            return target;
        }
    }
    
    /**
     * Removes the ith "effect" element
     */
    public void removeEffect(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EFFECT$62, i);
        }
    }
    
    /**
     * Gets a List of "bdr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder> getBdrList()
    {
        final class BdrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder get(int i)
                { return CTParaRPrOriginalImpl.this.getBdrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder old = CTParaRPrOriginalImpl.this.getBdrArray(i);
                CTParaRPrOriginalImpl.this.setBdrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder o)
                { CTParaRPrOriginalImpl.this.insertNewBdr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder old = CTParaRPrOriginalImpl.this.getBdrArray(i);
                CTParaRPrOriginalImpl.this.removeBdr(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfBdrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BdrList();
        }
    }
    
    /**
     * Gets array of all "bdr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder[] getBdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BDR$64, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder getBdrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(BDR$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bdr" element
     */
    public int sizeOfBdrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BDR$64);
        }
    }
    
    /**
     * Sets array of all "bdr" element
     */
    public void setBdrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder[] bdrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bdrArray, BDR$64);
        }
    }
    
    /**
     * Sets ith "bdr" element
     */
    public void setBdrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder bdr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().find_element_user(BDR$64, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bdr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder insertNewBdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().insert_element_user(BDR$64, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bdr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder addNewBdr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBorder)get_store().add_element_user(BDR$64);
            return target;
        }
    }
    
    /**
     * Removes the ith "bdr" element
     */
    public void removeBdr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BDR$64, i);
        }
    }
    
    /**
     * Gets a List of "shd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd> getShdList()
    {
        final class ShdList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd get(int i)
                { return CTParaRPrOriginalImpl.this.getShdArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd old = CTParaRPrOriginalImpl.this.getShdArray(i);
                CTParaRPrOriginalImpl.this.setShdArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd o)
                { CTParaRPrOriginalImpl.this.insertNewShd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd old = CTParaRPrOriginalImpl.this.getShdArray(i);
                CTParaRPrOriginalImpl.this.removeShd(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfShdArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ShdList();
        }
    }
    
    /**
     * Gets array of all "shd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd[] getShdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHD$66, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "shd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd getShdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().find_element_user(SHD$66, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "shd" element
     */
    public int sizeOfShdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHD$66);
        }
    }
    
    /**
     * Sets array of all "shd" element
     */
    public void setShdArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd[] shdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(shdArray, SHD$66);
        }
    }
    
    /**
     * Sets ith "shd" element
     */
    public void setShdArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd shd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().find_element_user(SHD$66, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(shd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "shd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd insertNewShd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().insert_element_user(SHD$66, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "shd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd addNewShd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTShd)get_store().add_element_user(SHD$66);
            return target;
        }
    }
    
    /**
     * Removes the ith "shd" element
     */
    public void removeShd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHD$66, i);
        }
    }
    
    /**
     * Gets a List of "fitText" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText> getFitTextList()
    {
        final class FitTextList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText get(int i)
                { return CTParaRPrOriginalImpl.this.getFitTextArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText old = CTParaRPrOriginalImpl.this.getFitTextArray(i);
                CTParaRPrOriginalImpl.this.setFitTextArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText o)
                { CTParaRPrOriginalImpl.this.insertNewFitText(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText old = CTParaRPrOriginalImpl.this.getFitTextArray(i);
                CTParaRPrOriginalImpl.this.removeFitText(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfFitTextArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FitTextList();
        }
    }
    
    /**
     * Gets array of all "fitText" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText[] getFitTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FITTEXT$68, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fitText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText getFitTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText)get_store().find_element_user(FITTEXT$68, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fitText" element
     */
    public int sizeOfFitTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FITTEXT$68);
        }
    }
    
    /**
     * Sets array of all "fitText" element
     */
    public void setFitTextArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText[] fitTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fitTextArray, FITTEXT$68);
        }
    }
    
    /**
     * Sets ith "fitText" element
     */
    public void setFitTextArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText fitText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText)get_store().find_element_user(FITTEXT$68, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fitText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fitText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText insertNewFitText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText)get_store().insert_element_user(FITTEXT$68, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fitText" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText addNewFitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFitText)get_store().add_element_user(FITTEXT$68);
            return target;
        }
    }
    
    /**
     * Removes the ith "fitText" element
     */
    public void removeFitText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FITTEXT$68, i);
        }
    }
    
    /**
     * Gets a List of "vertAlign" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun> getVertAlignList()
    {
        final class VertAlignList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun get(int i)
                { return CTParaRPrOriginalImpl.this.getVertAlignArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun old = CTParaRPrOriginalImpl.this.getVertAlignArray(i);
                CTParaRPrOriginalImpl.this.setVertAlignArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun o)
                { CTParaRPrOriginalImpl.this.insertNewVertAlign(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun old = CTParaRPrOriginalImpl.this.getVertAlignArray(i);
                CTParaRPrOriginalImpl.this.removeVertAlign(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfVertAlignArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new VertAlignList();
        }
    }
    
    /**
     * Gets array of all "vertAlign" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun[] getVertAlignArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERTALIGN$70, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "vertAlign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun getVertAlignArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun)get_store().find_element_user(VERTALIGN$70, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "vertAlign" element
     */
    public int sizeOfVertAlignArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTALIGN$70);
        }
    }
    
    /**
     * Sets array of all "vertAlign" element
     */
    public void setVertAlignArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun[] vertAlignArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(vertAlignArray, VERTALIGN$70);
        }
    }
    
    /**
     * Sets ith "vertAlign" element
     */
    public void setVertAlignArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun vertAlign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun)get_store().find_element_user(VERTALIGN$70, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(vertAlign);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "vertAlign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun insertNewVertAlign(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun)get_store().insert_element_user(VERTALIGN$70, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "vertAlign" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun addNewVertAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalAlignRun)get_store().add_element_user(VERTALIGN$70);
            return target;
        }
    }
    
    /**
     * Removes the ith "vertAlign" element
     */
    public void removeVertAlign(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTALIGN$70, i);
        }
    }
    
    /**
     * Gets a List of "rtl" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getRtlList()
    {
        final class RtlList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getRtlArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getRtlArray(i);
                CTParaRPrOriginalImpl.this.setRtlArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewRtl(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getRtlArray(i);
                CTParaRPrOriginalImpl.this.removeRtl(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfRtlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RtlList();
        }
    }
    
    /**
     * Gets array of all "rtl" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getRtlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RTL$72, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rtl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getRtlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(RTL$72, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rtl" element
     */
    public int sizeOfRtlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RTL$72);
        }
    }
    
    /**
     * Sets array of all "rtl" element
     */
    public void setRtlArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] rtlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rtlArray, RTL$72);
        }
    }
    
    /**
     * Sets ith "rtl" element
     */
    public void setRtlArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff rtl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(RTL$72, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rtl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rtl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewRtl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(RTL$72, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rtl" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewRtl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(RTL$72);
            return target;
        }
    }
    
    /**
     * Removes the ith "rtl" element
     */
    public void removeRtl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RTL$72, i);
        }
    }
    
    /**
     * Gets a List of "cs" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getCsList()
    {
        final class CsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getCsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getCsArray(i);
                CTParaRPrOriginalImpl.this.setCsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewCs(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getCsArray(i);
                CTParaRPrOriginalImpl.this.removeCs(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfCsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CsList();
        }
    }
    
    /**
     * Gets array of all "cs" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getCsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CS$74, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getCsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CS$74, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cs" element
     */
    public int sizeOfCsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CS$74);
        }
    }
    
    /**
     * Sets array of all "cs" element
     */
    public void setCsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] csArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(csArray, CS$74);
        }
    }
    
    /**
     * Sets ith "cs" element
     */
    public void setCsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff cs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(CS$74, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewCs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(CS$74, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cs" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewCs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(CS$74);
            return target;
        }
    }
    
    /**
     * Removes the ith "cs" element
     */
    public void removeCs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CS$74, i);
        }
    }
    
    /**
     * Gets a List of "em" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm> getEmList()
    {
        final class EmList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm get(int i)
                { return CTParaRPrOriginalImpl.this.getEmArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm old = CTParaRPrOriginalImpl.this.getEmArray(i);
                CTParaRPrOriginalImpl.this.setEmArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm o)
                { CTParaRPrOriginalImpl.this.insertNewEm(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm old = CTParaRPrOriginalImpl.this.getEmArray(i);
                CTParaRPrOriginalImpl.this.removeEm(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfEmArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EmList();
        }
    }
    
    /**
     * Gets array of all "em" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm[] getEmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EM$76, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "em" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm getEmArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm)get_store().find_element_user(EM$76, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "em" element
     */
    public int sizeOfEmArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EM$76);
        }
    }
    
    /**
     * Sets array of all "em" element
     */
    public void setEmArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm[] emArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emArray, EM$76);
        }
    }
    
    /**
     * Sets ith "em" element
     */
    public void setEmArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm em)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm)get_store().find_element_user(EM$76, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(em);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "em" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm insertNewEm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm)get_store().insert_element_user(EM$76, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "em" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm addNewEm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEm)get_store().add_element_user(EM$76);
            return target;
        }
    }
    
    /**
     * Removes the ith "em" element
     */
    public void removeEm(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EM$76, i);
        }
    }
    
    /**
     * Gets a List of "lang" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage> getLangList()
    {
        final class LangList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage get(int i)
                { return CTParaRPrOriginalImpl.this.getLangArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage old = CTParaRPrOriginalImpl.this.getLangArray(i);
                CTParaRPrOriginalImpl.this.setLangArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage o)
                { CTParaRPrOriginalImpl.this.insertNewLang(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage old = CTParaRPrOriginalImpl.this.getLangArray(i);
                CTParaRPrOriginalImpl.this.removeLang(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfLangArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LangList();
        }
    }
    
    /**
     * Gets array of all "lang" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage[] getLangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANG$78, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lang" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage getLangArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage)get_store().find_element_user(LANG$78, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lang" element
     */
    public int sizeOfLangArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANG$78);
        }
    }
    
    /**
     * Sets array of all "lang" element
     */
    public void setLangArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage[] langArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(langArray, LANG$78);
        }
    }
    
    /**
     * Sets ith "lang" element
     */
    public void setLangArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage)get_store().find_element_user(LANG$78, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lang);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lang" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage insertNewLang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage)get_store().insert_element_user(LANG$78, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lang" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage addNewLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLanguage)get_store().add_element_user(LANG$78);
            return target;
        }
    }
    
    /**
     * Removes the ith "lang" element
     */
    public void removeLang(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANG$78, i);
        }
    }
    
    /**
     * Gets a List of "eastAsianLayout" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout> getEastAsianLayoutList()
    {
        final class EastAsianLayoutList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout get(int i)
                { return CTParaRPrOriginalImpl.this.getEastAsianLayoutArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout old = CTParaRPrOriginalImpl.this.getEastAsianLayoutArray(i);
                CTParaRPrOriginalImpl.this.setEastAsianLayoutArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout o)
                { CTParaRPrOriginalImpl.this.insertNewEastAsianLayout(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout old = CTParaRPrOriginalImpl.this.getEastAsianLayoutArray(i);
                CTParaRPrOriginalImpl.this.removeEastAsianLayout(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfEastAsianLayoutArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EastAsianLayoutList();
        }
    }
    
    /**
     * Gets array of all "eastAsianLayout" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout[] getEastAsianLayoutArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EASTASIANLAYOUT$80, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eastAsianLayout" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout getEastAsianLayoutArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout)get_store().find_element_user(EASTASIANLAYOUT$80, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eastAsianLayout" element
     */
    public int sizeOfEastAsianLayoutArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EASTASIANLAYOUT$80);
        }
    }
    
    /**
     * Sets array of all "eastAsianLayout" element
     */
    public void setEastAsianLayoutArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout[] eastAsianLayoutArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eastAsianLayoutArray, EASTASIANLAYOUT$80);
        }
    }
    
    /**
     * Sets ith "eastAsianLayout" element
     */
    public void setEastAsianLayoutArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout eastAsianLayout)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout)get_store().find_element_user(EASTASIANLAYOUT$80, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eastAsianLayout);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eastAsianLayout" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout insertNewEastAsianLayout(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout)get_store().insert_element_user(EASTASIANLAYOUT$80, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eastAsianLayout" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout addNewEastAsianLayout()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEastAsianLayout)get_store().add_element_user(EASTASIANLAYOUT$80);
            return target;
        }
    }
    
    /**
     * Removes the ith "eastAsianLayout" element
     */
    public void removeEastAsianLayout(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EASTASIANLAYOUT$80, i);
        }
    }
    
    /**
     * Gets a List of "specVanish" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getSpecVanishList()
    {
        final class SpecVanishList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getSpecVanishArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getSpecVanishArray(i);
                CTParaRPrOriginalImpl.this.setSpecVanishArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewSpecVanish(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getSpecVanishArray(i);
                CTParaRPrOriginalImpl.this.removeSpecVanish(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfSpecVanishArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new SpecVanishList();
        }
    }
    
    /**
     * Gets array of all "specVanish" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getSpecVanishArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECVANISH$82, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specVanish" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getSpecVanishArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SPECVANISH$82, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specVanish" element
     */
    public int sizeOfSpecVanishArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECVANISH$82);
        }
    }
    
    /**
     * Sets array of all "specVanish" element
     */
    public void setSpecVanishArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] specVanishArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(specVanishArray, SPECVANISH$82);
        }
    }
    
    /**
     * Sets ith "specVanish" element
     */
    public void setSpecVanishArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff specVanish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(SPECVANISH$82, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(specVanish);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specVanish" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewSpecVanish(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(SPECVANISH$82, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specVanish" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewSpecVanish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(SPECVANISH$82);
            return target;
        }
    }
    
    /**
     * Removes the ith "specVanish" element
     */
    public void removeSpecVanish(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECVANISH$82, i);
        }
    }
    
    /**
     * Gets a List of "oMath" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff> getOMathList()
    {
        final class OMathList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff get(int i)
                { return CTParaRPrOriginalImpl.this.getOMathArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getOMathArray(i);
                CTParaRPrOriginalImpl.this.setOMathArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff o)
                { CTParaRPrOriginalImpl.this.insertNewOMath(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff old = CTParaRPrOriginalImpl.this.getOMathArray(i);
                CTParaRPrOriginalImpl.this.removeOMath(i);
                return old;
            }
            
            public int size()
                { return CTParaRPrOriginalImpl.this.sizeOfOMathArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OMathList();
        }
    }
    
    /**
     * Gets array of all "oMath" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] getOMathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OMATH$84, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oMath" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff getOMathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(OMATH$84, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oMath" element
     */
    public int sizeOfOMathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OMATH$84);
        }
    }
    
    /**
     * Sets array of all "oMath" element
     */
    public void setOMathArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff[] oMathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oMathArray, OMATH$84);
        }
    }
    
    /**
     * Sets ith "oMath" element
     */
    public void setOMathArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff oMath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().find_element_user(OMATH$84, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oMath);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oMath" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff insertNewOMath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().insert_element_user(OMATH$84, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oMath" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff addNewOMath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff)get_store().add_element_user(OMATH$84);
            return target;
        }
    }
    
    /**
     * Removes the ith "oMath" element
     */
    public void removeOMath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OMATH$84, i);
        }
    }
}
