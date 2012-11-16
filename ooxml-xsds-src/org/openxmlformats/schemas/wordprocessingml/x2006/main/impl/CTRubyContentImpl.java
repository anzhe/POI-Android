/*
 * XML Type:  CT_RubyContent
 * Namespace: http://schemas.openxmlformats.org/wordprocessingml/2006/main
 * Java type: org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent
 *
 * Automatically generated - do not modify.
 */
package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;
/**
 * An XML CT_RubyContent(@http://schemas.openxmlformats.org/wordprocessingml/2006/main).
 *
 * This is a complex type.
 */
public class CTRubyContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRubyContent
{
    
    public CTRubyContentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName R$0 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "r");
    private static final javax.xml.namespace.QName PROOFERR$2 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "proofErr");
    private static final javax.xml.namespace.QName PERMSTART$4 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permStart");
    private static final javax.xml.namespace.QName PERMEND$6 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "permEnd");
    private static final javax.xml.namespace.QName BOOKMARKSTART$8 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkStart");
    private static final javax.xml.namespace.QName BOOKMARKEND$10 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "bookmarkEnd");
    private static final javax.xml.namespace.QName MOVEFROMRANGESTART$12 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeStart");
    private static final javax.xml.namespace.QName MOVEFROMRANGEEND$14 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFromRangeEnd");
    private static final javax.xml.namespace.QName MOVETORANGESTART$16 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeStart");
    private static final javax.xml.namespace.QName MOVETORANGEEND$18 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveToRangeEnd");
    private static final javax.xml.namespace.QName COMMENTRANGESTART$20 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeStart");
    private static final javax.xml.namespace.QName COMMENTRANGEEND$22 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "commentRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLINSRANGESTART$24 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLINSRANGEEND$26 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlInsRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLDELRANGESTART$28 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLDELRANGEEND$30 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlDelRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVEFROMRANGESTART$32 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVEFROMRANGEEND$34 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveFromRangeEnd");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVETORANGESTART$36 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeStart");
    private static final javax.xml.namespace.QName CUSTOMXMLMOVETORANGEEND$38 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "customXmlMoveToRangeEnd");
    private static final javax.xml.namespace.QName INS$40 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "ins");
    private static final javax.xml.namespace.QName DEL$42 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "del");
    private static final javax.xml.namespace.QName MOVEFROM$44 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveFrom");
    private static final javax.xml.namespace.QName MOVETO$46 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "moveTo");
    private static final javax.xml.namespace.QName OMATHPARA$48 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMathPara");
    private static final javax.xml.namespace.QName OMATH$50 = 
        new javax.xml.namespace.QName("http://schemas.openxmlformats.org/officeDocument/2006/math", "oMath");
    
    
    /**
     * Gets a List of "r" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR> getRList()
    {
        final class RList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR get(int i)
                { return CTRubyContentImpl.this.getRArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR old = CTRubyContentImpl.this.getRArray(i);
                CTRubyContentImpl.this.setRArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR o)
                { CTRubyContentImpl.this.insertNewR(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR old = CTRubyContentImpl.this.getRArray(i);
                CTRubyContentImpl.this.removeR(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfRArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RList();
        }
    }
    
    /**
     * Gets array of all "r" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR[] getRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(R$0, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "r" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR getRArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR)get_store().find_element_user(R$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "r" element
     */
    public int sizeOfRArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(R$0);
        }
    }
    
    /**
     * Sets array of all "r" element
     */
    public void setRArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR[] rArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rArray, R$0);
        }
    }
    
    /**
     * Sets ith "r" element
     */
    public void setRArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR r)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR)get_store().find_element_user(R$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(r);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "r" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR insertNewR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR)get_store().insert_element_user(R$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "r" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR addNewR()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTR)get_store().add_element_user(R$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "r" element
     */
    public void removeR(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(R$0, i);
        }
    }
    
    /**
     * Gets a List of "proofErr" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr> getProofErrList()
    {
        final class ProofErrList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr get(int i)
                { return CTRubyContentImpl.this.getProofErrArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr old = CTRubyContentImpl.this.getProofErrArray(i);
                CTRubyContentImpl.this.setProofErrArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr o)
                { CTRubyContentImpl.this.insertNewProofErr(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr old = CTRubyContentImpl.this.getProofErrArray(i);
                CTRubyContentImpl.this.removeProofErr(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfProofErrArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProofErrList();
        }
    }
    
    /**
     * Gets array of all "proofErr" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr[] getProofErrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROOFERR$2, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "proofErr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr getProofErrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().find_element_user(PROOFERR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "proofErr" element
     */
    public int sizeOfProofErrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROOFERR$2);
        }
    }
    
    /**
     * Sets array of all "proofErr" element
     */
    public void setProofErrArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr[] proofErrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(proofErrArray, PROOFERR$2);
        }
    }
    
    /**
     * Sets ith "proofErr" element
     */
    public void setProofErrArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr proofErr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().find_element_user(PROOFERR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(proofErr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "proofErr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr insertNewProofErr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().insert_element_user(PROOFERR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "proofErr" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr addNewProofErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTProofErr)get_store().add_element_user(PROOFERR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "proofErr" element
     */
    public void removeProofErr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROOFERR$2, i);
        }
    }
    
    /**
     * Gets a List of "permStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart> getPermStartList()
    {
        final class PermStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart get(int i)
                { return CTRubyContentImpl.this.getPermStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart old = CTRubyContentImpl.this.getPermStartArray(i);
                CTRubyContentImpl.this.setPermStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart o)
                { CTRubyContentImpl.this.insertNewPermStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart old = CTRubyContentImpl.this.getPermStartArray(i);
                CTRubyContentImpl.this.removePermStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfPermStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PermStartList();
        }
    }
    
    /**
     * Gets array of all "permStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart[] getPermStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERMSTART$4, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "permStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart getPermStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().find_element_user(PERMSTART$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "permStart" element
     */
    public int sizeOfPermStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERMSTART$4);
        }
    }
    
    /**
     * Sets array of all "permStart" element
     */
    public void setPermStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart[] permStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(permStartArray, PERMSTART$4);
        }
    }
    
    /**
     * Sets ith "permStart" element
     */
    public void setPermStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart permStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().find_element_user(PERMSTART$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(permStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "permStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart insertNewPermStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().insert_element_user(PERMSTART$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "permStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart addNewPermStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPermStart)get_store().add_element_user(PERMSTART$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "permStart" element
     */
    public void removePermStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERMSTART$4, i);
        }
    }
    
    /**
     * Gets a List of "permEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm> getPermEndList()
    {
        final class PermEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm get(int i)
                { return CTRubyContentImpl.this.getPermEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm old = CTRubyContentImpl.this.getPermEndArray(i);
                CTRubyContentImpl.this.setPermEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm o)
                { CTRubyContentImpl.this.insertNewPermEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm old = CTRubyContentImpl.this.getPermEndArray(i);
                CTRubyContentImpl.this.removePermEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfPermEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PermEndList();
        }
    }
    
    /**
     * Gets array of all "permEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm[] getPermEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERMEND$6, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "permEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm getPermEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().find_element_user(PERMEND$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "permEnd" element
     */
    public int sizeOfPermEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERMEND$6);
        }
    }
    
    /**
     * Sets array of all "permEnd" element
     */
    public void setPermEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm[] permEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(permEndArray, PERMEND$6);
        }
    }
    
    /**
     * Sets ith "permEnd" element
     */
    public void setPermEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm permEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().find_element_user(PERMEND$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(permEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "permEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm insertNewPermEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().insert_element_user(PERMEND$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "permEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm addNewPermEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPerm)get_store().add_element_user(PERMEND$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "permEnd" element
     */
    public void removePermEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERMEND$6, i);
        }
    }
    
    /**
     * Gets a List of "bookmarkStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark> getBookmarkStartList()
    {
        final class BookmarkStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark get(int i)
                { return CTRubyContentImpl.this.getBookmarkStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark old = CTRubyContentImpl.this.getBookmarkStartArray(i);
                CTRubyContentImpl.this.setBookmarkStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark o)
                { CTRubyContentImpl.this.insertNewBookmarkStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark old = CTRubyContentImpl.this.getBookmarkStartArray(i);
                CTRubyContentImpl.this.removeBookmarkStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfBookmarkStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BookmarkStartList();
        }
    }
    
    /**
     * Gets array of all "bookmarkStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark[] getBookmarkStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOKMARKSTART$8, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bookmarkStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark getBookmarkStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().find_element_user(BOOKMARKSTART$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bookmarkStart" element
     */
    public int sizeOfBookmarkStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKMARKSTART$8);
        }
    }
    
    /**
     * Sets array of all "bookmarkStart" element
     */
    public void setBookmarkStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark[] bookmarkStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bookmarkStartArray, BOOKMARKSTART$8);
        }
    }
    
    /**
     * Sets ith "bookmarkStart" element
     */
    public void setBookmarkStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark bookmarkStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().find_element_user(BOOKMARKSTART$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bookmarkStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bookmarkStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark insertNewBookmarkStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().insert_element_user(BOOKMARKSTART$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bookmarkStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark addNewBookmarkStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTBookmark)get_store().add_element_user(BOOKMARKSTART$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "bookmarkStart" element
     */
    public void removeBookmarkStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKMARKSTART$8, i);
        }
    }
    
    /**
     * Gets a List of "bookmarkEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getBookmarkEndList()
    {
        final class BookmarkEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTRubyContentImpl.this.getBookmarkEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getBookmarkEndArray(i);
                CTRubyContentImpl.this.setBookmarkEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTRubyContentImpl.this.insertNewBookmarkEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getBookmarkEndArray(i);
                CTRubyContentImpl.this.removeBookmarkEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfBookmarkEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BookmarkEndList();
        }
    }
    
    /**
     * Gets array of all "bookmarkEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getBookmarkEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOOKMARKEND$10, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "bookmarkEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getBookmarkEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(BOOKMARKEND$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "bookmarkEnd" element
     */
    public int sizeOfBookmarkEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOKMARKEND$10);
        }
    }
    
    /**
     * Sets array of all "bookmarkEnd" element
     */
    public void setBookmarkEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] bookmarkEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bookmarkEndArray, BOOKMARKEND$10);
        }
    }
    
    /**
     * Sets ith "bookmarkEnd" element
     */
    public void setBookmarkEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange bookmarkEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(BOOKMARKEND$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bookmarkEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "bookmarkEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewBookmarkEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(BOOKMARKEND$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "bookmarkEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewBookmarkEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(BOOKMARKEND$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "bookmarkEnd" element
     */
    public void removeBookmarkEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOKMARKEND$10, i);
        }
    }
    
    /**
     * Gets a List of "moveFromRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark> getMoveFromRangeStartList()
    {
        final class MoveFromRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark get(int i)
                { return CTRubyContentImpl.this.getMoveFromRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTRubyContentImpl.this.getMoveFromRangeStartArray(i);
                CTRubyContentImpl.this.setMoveFromRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
                { CTRubyContentImpl.this.insertNewMoveFromRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTRubyContentImpl.this.getMoveFromRangeStartArray(i);
                CTRubyContentImpl.this.removeMoveFromRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfMoveFromRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveFromRangeStartList();
        }
    }
    
    /**
     * Gets array of all "moveFromRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] getMoveFromRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVEFROMRANGESTART$12, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark getMoveFromRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVEFROMRANGESTART$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveFromRangeStart" element
     */
    public int sizeOfMoveFromRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVEFROMRANGESTART$12);
        }
    }
    
    /**
     * Sets array of all "moveFromRangeStart" element
     */
    public void setMoveFromRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] moveFromRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveFromRangeStartArray, MOVEFROMRANGESTART$12);
        }
    }
    
    /**
     * Sets ith "moveFromRangeStart" element
     */
    public void setMoveFromRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark moveFromRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVEFROMRANGESTART$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveFromRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark insertNewMoveFromRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().insert_element_user(MOVEFROMRANGESTART$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark addNewMoveFromRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().add_element_user(MOVEFROMRANGESTART$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveFromRangeStart" element
     */
    public void removeMoveFromRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVEFROMRANGESTART$12, i);
        }
    }
    
    /**
     * Gets a List of "moveFromRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getMoveFromRangeEndList()
    {
        final class MoveFromRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTRubyContentImpl.this.getMoveFromRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getMoveFromRangeEndArray(i);
                CTRubyContentImpl.this.setMoveFromRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTRubyContentImpl.this.insertNewMoveFromRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getMoveFromRangeEndArray(i);
                CTRubyContentImpl.this.removeMoveFromRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfMoveFromRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveFromRangeEndList();
        }
    }
    
    /**
     * Gets array of all "moveFromRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getMoveFromRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVEFROMRANGEEND$14, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getMoveFromRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVEFROMRANGEEND$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveFromRangeEnd" element
     */
    public int sizeOfMoveFromRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVEFROMRANGEEND$14);
        }
    }
    
    /**
     * Sets array of all "moveFromRangeEnd" element
     */
    public void setMoveFromRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] moveFromRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveFromRangeEndArray, MOVEFROMRANGEEND$14);
        }
    }
    
    /**
     * Sets ith "moveFromRangeEnd" element
     */
    public void setMoveFromRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange moveFromRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVEFROMRANGEEND$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveFromRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewMoveFromRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(MOVEFROMRANGEEND$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewMoveFromRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(MOVEFROMRANGEEND$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveFromRangeEnd" element
     */
    public void removeMoveFromRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVEFROMRANGEEND$14, i);
        }
    }
    
    /**
     * Gets a List of "moveToRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark> getMoveToRangeStartList()
    {
        final class MoveToRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark get(int i)
                { return CTRubyContentImpl.this.getMoveToRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTRubyContentImpl.this.getMoveToRangeStartArray(i);
                CTRubyContentImpl.this.setMoveToRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark o)
                { CTRubyContentImpl.this.insertNewMoveToRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark old = CTRubyContentImpl.this.getMoveToRangeStartArray(i);
                CTRubyContentImpl.this.removeMoveToRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfMoveToRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveToRangeStartList();
        }
    }
    
    /**
     * Gets array of all "moveToRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] getMoveToRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVETORANGESTART$16, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark getMoveToRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVETORANGESTART$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveToRangeStart" element
     */
    public int sizeOfMoveToRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVETORANGESTART$16);
        }
    }
    
    /**
     * Sets array of all "moveToRangeStart" element
     */
    public void setMoveToRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark[] moveToRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveToRangeStartArray, MOVETORANGESTART$16);
        }
    }
    
    /**
     * Sets ith "moveToRangeStart" element
     */
    public void setMoveToRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark moveToRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().find_element_user(MOVETORANGESTART$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveToRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark insertNewMoveToRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().insert_element_user(MOVETORANGESTART$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark addNewMoveToRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMoveBookmark)get_store().add_element_user(MOVETORANGESTART$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveToRangeStart" element
     */
    public void removeMoveToRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVETORANGESTART$16, i);
        }
    }
    
    /**
     * Gets a List of "moveToRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getMoveToRangeEndList()
    {
        final class MoveToRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTRubyContentImpl.this.getMoveToRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getMoveToRangeEndArray(i);
                CTRubyContentImpl.this.setMoveToRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTRubyContentImpl.this.insertNewMoveToRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getMoveToRangeEndArray(i);
                CTRubyContentImpl.this.removeMoveToRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfMoveToRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveToRangeEndList();
        }
    }
    
    /**
     * Gets array of all "moveToRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getMoveToRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVETORANGEEND$18, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getMoveToRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVETORANGEEND$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveToRangeEnd" element
     */
    public int sizeOfMoveToRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVETORANGEEND$18);
        }
    }
    
    /**
     * Sets array of all "moveToRangeEnd" element
     */
    public void setMoveToRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] moveToRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveToRangeEndArray, MOVETORANGEEND$18);
        }
    }
    
    /**
     * Sets ith "moveToRangeEnd" element
     */
    public void setMoveToRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange moveToRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(MOVETORANGEEND$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveToRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewMoveToRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(MOVETORANGEEND$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewMoveToRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(MOVETORANGEEND$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveToRangeEnd" element
     */
    public void removeMoveToRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVETORANGEEND$18, i);
        }
    }
    
    /**
     * Gets a List of "commentRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getCommentRangeStartList()
    {
        final class CommentRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTRubyContentImpl.this.getCommentRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getCommentRangeStartArray(i);
                CTRubyContentImpl.this.setCommentRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTRubyContentImpl.this.insertNewCommentRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getCommentRangeStartArray(i);
                CTRubyContentImpl.this.removeCommentRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCommentRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CommentRangeStartList();
        }
    }
    
    /**
     * Gets array of all "commentRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getCommentRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENTRANGESTART$20, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "commentRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getCommentRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGESTART$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "commentRangeStart" element
     */
    public int sizeOfCommentRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTRANGESTART$20);
        }
    }
    
    /**
     * Sets array of all "commentRangeStart" element
     */
    public void setCommentRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] commentRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentRangeStartArray, COMMENTRANGESTART$20);
        }
    }
    
    /**
     * Sets ith "commentRangeStart" element
     */
    public void setCommentRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange commentRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGESTART$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(commentRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "commentRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewCommentRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(COMMENTRANGESTART$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "commentRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewCommentRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(COMMENTRANGESTART$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "commentRangeStart" element
     */
    public void removeCommentRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTRANGESTART$20, i);
        }
    }
    
    /**
     * Gets a List of "commentRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange> getCommentRangeEndList()
    {
        final class CommentRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange get(int i)
                { return CTRubyContentImpl.this.getCommentRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getCommentRangeEndArray(i);
                CTRubyContentImpl.this.setCommentRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange o)
                { CTRubyContentImpl.this.insertNewCommentRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange old = CTRubyContentImpl.this.getCommentRangeEndArray(i);
                CTRubyContentImpl.this.removeCommentRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCommentRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CommentRangeEndList();
        }
    }
    
    /**
     * Gets array of all "commentRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] getCommentRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENTRANGEEND$22, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "commentRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange getCommentRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGEEND$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "commentRangeEnd" element
     */
    public int sizeOfCommentRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTRANGEEND$22);
        }
    }
    
    /**
     * Sets array of all "commentRangeEnd" element
     */
    public void setCommentRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange[] commentRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentRangeEndArray, COMMENTRANGEEND$22);
        }
    }
    
    /**
     * Sets ith "commentRangeEnd" element
     */
    public void setCommentRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange commentRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().find_element_user(COMMENTRANGEEND$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(commentRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "commentRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange insertNewCommentRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().insert_element_user(COMMENTRANGEEND$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "commentRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange addNewCommentRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkupRange)get_store().add_element_user(COMMENTRANGEEND$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "commentRangeEnd" element
     */
    public void removeCommentRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTRANGEEND$22, i);
        }
    }
    
    /**
     * Gets a List of "customXmlInsRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange> getCustomXmlInsRangeStartList()
    {
        final class CustomXmlInsRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange get(int i)
                { return CTRubyContentImpl.this.getCustomXmlInsRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTRubyContentImpl.this.getCustomXmlInsRangeStartArray(i);
                CTRubyContentImpl.this.setCustomXmlInsRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTRubyContentImpl.this.insertNewCustomXmlInsRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTRubyContentImpl.this.getCustomXmlInsRangeStartArray(i);
                CTRubyContentImpl.this.removeCustomXmlInsRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCustomXmlInsRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlInsRangeStartList();
        }
    }
    
    /**
     * Gets array of all "customXmlInsRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] getCustomXmlInsRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLINSRANGESTART$24, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlInsRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlInsRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLINSRANGESTART$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlInsRangeStart" element
     */
    public int sizeOfCustomXmlInsRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLINSRANGESTART$24);
        }
    }
    
    /**
     * Sets array of all "customXmlInsRangeStart" element
     */
    public void setCustomXmlInsRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] customXmlInsRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlInsRangeStartArray, CUSTOMXMLINSRANGESTART$24);
        }
    }
    
    /**
     * Sets ith "customXmlInsRangeStart" element
     */
    public void setCustomXmlInsRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlInsRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLINSRANGESTART$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlInsRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlInsRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange insertNewCustomXmlInsRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLINSRANGESTART$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlInsRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlInsRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLINSRANGESTART$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlInsRangeStart" element
     */
    public void removeCustomXmlInsRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLINSRANGESTART$24, i);
        }
    }
    
    /**
     * Gets a List of "customXmlInsRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCustomXmlInsRangeEndList()
    {
        final class CustomXmlInsRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTRubyContentImpl.this.getCustomXmlInsRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRubyContentImpl.this.getCustomXmlInsRangeEndArray(i);
                CTRubyContentImpl.this.setCustomXmlInsRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTRubyContentImpl.this.insertNewCustomXmlInsRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRubyContentImpl.this.getCustomXmlInsRangeEndArray(i);
                CTRubyContentImpl.this.removeCustomXmlInsRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCustomXmlInsRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlInsRangeEndList();
        }
    }
    
    /**
     * Gets array of all "customXmlInsRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCustomXmlInsRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLINSRANGEEND$26, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlInsRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlInsRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLINSRANGEEND$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlInsRangeEnd" element
     */
    public int sizeOfCustomXmlInsRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLINSRANGEEND$26);
        }
    }
    
    /**
     * Sets array of all "customXmlInsRangeEnd" element
     */
    public void setCustomXmlInsRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] customXmlInsRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlInsRangeEndArray, CUSTOMXMLINSRANGEEND$26);
        }
    }
    
    /**
     * Sets ith "customXmlInsRangeEnd" element
     */
    public void setCustomXmlInsRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlInsRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLINSRANGEEND$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlInsRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlInsRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCustomXmlInsRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLINSRANGEEND$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlInsRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlInsRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLINSRANGEEND$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlInsRangeEnd" element
     */
    public void removeCustomXmlInsRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLINSRANGEEND$26, i);
        }
    }
    
    /**
     * Gets a List of "customXmlDelRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange> getCustomXmlDelRangeStartList()
    {
        final class CustomXmlDelRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange get(int i)
                { return CTRubyContentImpl.this.getCustomXmlDelRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTRubyContentImpl.this.getCustomXmlDelRangeStartArray(i);
                CTRubyContentImpl.this.setCustomXmlDelRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTRubyContentImpl.this.insertNewCustomXmlDelRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTRubyContentImpl.this.getCustomXmlDelRangeStartArray(i);
                CTRubyContentImpl.this.removeCustomXmlDelRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCustomXmlDelRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlDelRangeStartList();
        }
    }
    
    /**
     * Gets array of all "customXmlDelRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] getCustomXmlDelRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLDELRANGESTART$28, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlDelRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlDelRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLDELRANGESTART$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlDelRangeStart" element
     */
    public int sizeOfCustomXmlDelRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLDELRANGESTART$28);
        }
    }
    
    /**
     * Sets array of all "customXmlDelRangeStart" element
     */
    public void setCustomXmlDelRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] customXmlDelRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlDelRangeStartArray, CUSTOMXMLDELRANGESTART$28);
        }
    }
    
    /**
     * Sets ith "customXmlDelRangeStart" element
     */
    public void setCustomXmlDelRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlDelRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLDELRANGESTART$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlDelRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlDelRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange insertNewCustomXmlDelRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLDELRANGESTART$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlDelRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlDelRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLDELRANGESTART$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlDelRangeStart" element
     */
    public void removeCustomXmlDelRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLDELRANGESTART$28, i);
        }
    }
    
    /**
     * Gets a List of "customXmlDelRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCustomXmlDelRangeEndList()
    {
        final class CustomXmlDelRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTRubyContentImpl.this.getCustomXmlDelRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRubyContentImpl.this.getCustomXmlDelRangeEndArray(i);
                CTRubyContentImpl.this.setCustomXmlDelRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTRubyContentImpl.this.insertNewCustomXmlDelRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRubyContentImpl.this.getCustomXmlDelRangeEndArray(i);
                CTRubyContentImpl.this.removeCustomXmlDelRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCustomXmlDelRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlDelRangeEndList();
        }
    }
    
    /**
     * Gets array of all "customXmlDelRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCustomXmlDelRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLDELRANGEEND$30, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlDelRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlDelRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLDELRANGEEND$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlDelRangeEnd" element
     */
    public int sizeOfCustomXmlDelRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLDELRANGEEND$30);
        }
    }
    
    /**
     * Sets array of all "customXmlDelRangeEnd" element
     */
    public void setCustomXmlDelRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] customXmlDelRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlDelRangeEndArray, CUSTOMXMLDELRANGEEND$30);
        }
    }
    
    /**
     * Sets ith "customXmlDelRangeEnd" element
     */
    public void setCustomXmlDelRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlDelRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLDELRANGEEND$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlDelRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlDelRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCustomXmlDelRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLDELRANGEEND$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlDelRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlDelRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLDELRANGEEND$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlDelRangeEnd" element
     */
    public void removeCustomXmlDelRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLDELRANGEEND$30, i);
        }
    }
    
    /**
     * Gets a List of "customXmlMoveFromRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange> getCustomXmlMoveFromRangeStartList()
    {
        final class CustomXmlMoveFromRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange get(int i)
                { return CTRubyContentImpl.this.getCustomXmlMoveFromRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTRubyContentImpl.this.getCustomXmlMoveFromRangeStartArray(i);
                CTRubyContentImpl.this.setCustomXmlMoveFromRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTRubyContentImpl.this.insertNewCustomXmlMoveFromRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTRubyContentImpl.this.getCustomXmlMoveFromRangeStartArray(i);
                CTRubyContentImpl.this.removeCustomXmlMoveFromRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCustomXmlMoveFromRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlMoveFromRangeStartList();
        }
    }
    
    /**
     * Gets array of all "customXmlMoveFromRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] getCustomXmlMoveFromRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGESTART$32, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlMoveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlMoveFromRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlMoveFromRangeStart" element
     */
    public int sizeOfCustomXmlMoveFromRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLMOVEFROMRANGESTART$32);
        }
    }
    
    /**
     * Sets array of all "customXmlMoveFromRangeStart" element
     */
    public void setCustomXmlMoveFromRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] customXmlMoveFromRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlMoveFromRangeStartArray, CUSTOMXMLMOVEFROMRANGESTART$32);
        }
    }
    
    /**
     * Sets ith "customXmlMoveFromRangeStart" element
     */
    public void setCustomXmlMoveFromRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlMoveFromRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGESTART$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlMoveFromRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlMoveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange insertNewCustomXmlMoveFromRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGESTART$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlMoveFromRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlMoveFromRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLMOVEFROMRANGESTART$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlMoveFromRangeStart" element
     */
    public void removeCustomXmlMoveFromRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLMOVEFROMRANGESTART$32, i);
        }
    }
    
    /**
     * Gets a List of "customXmlMoveFromRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCustomXmlMoveFromRangeEndList()
    {
        final class CustomXmlMoveFromRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTRubyContentImpl.this.getCustomXmlMoveFromRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRubyContentImpl.this.getCustomXmlMoveFromRangeEndArray(i);
                CTRubyContentImpl.this.setCustomXmlMoveFromRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTRubyContentImpl.this.insertNewCustomXmlMoveFromRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRubyContentImpl.this.getCustomXmlMoveFromRangeEndArray(i);
                CTRubyContentImpl.this.removeCustomXmlMoveFromRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCustomXmlMoveFromRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlMoveFromRangeEndList();
        }
    }
    
    /**
     * Gets array of all "customXmlMoveFromRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCustomXmlMoveFromRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLMOVEFROMRANGEEND$34, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlMoveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlMoveFromRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlMoveFromRangeEnd" element
     */
    public int sizeOfCustomXmlMoveFromRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLMOVEFROMRANGEEND$34);
        }
    }
    
    /**
     * Sets array of all "customXmlMoveFromRangeEnd" element
     */
    public void setCustomXmlMoveFromRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] customXmlMoveFromRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlMoveFromRangeEndArray, CUSTOMXMLMOVEFROMRANGEEND$34);
        }
    }
    
    /**
     * Sets ith "customXmlMoveFromRangeEnd" element
     */
    public void setCustomXmlMoveFromRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlMoveFromRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVEFROMRANGEEND$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlMoveFromRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlMoveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCustomXmlMoveFromRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLMOVEFROMRANGEEND$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlMoveFromRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlMoveFromRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLMOVEFROMRANGEEND$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlMoveFromRangeEnd" element
     */
    public void removeCustomXmlMoveFromRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLMOVEFROMRANGEEND$34, i);
        }
    }
    
    /**
     * Gets a List of "customXmlMoveToRangeStart" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange> getCustomXmlMoveToRangeStartList()
    {
        final class CustomXmlMoveToRangeStartList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange get(int i)
                { return CTRubyContentImpl.this.getCustomXmlMoveToRangeStartArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTRubyContentImpl.this.getCustomXmlMoveToRangeStartArray(i);
                CTRubyContentImpl.this.setCustomXmlMoveToRangeStartArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange o)
                { CTRubyContentImpl.this.insertNewCustomXmlMoveToRangeStart(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange old = CTRubyContentImpl.this.getCustomXmlMoveToRangeStartArray(i);
                CTRubyContentImpl.this.removeCustomXmlMoveToRangeStart(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCustomXmlMoveToRangeStartArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlMoveToRangeStartList();
        }
    }
    
    /**
     * Gets array of all "customXmlMoveToRangeStart" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] getCustomXmlMoveToRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLMOVETORANGESTART$36, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlMoveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange getCustomXmlMoveToRangeStartArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlMoveToRangeStart" element
     */
    public int sizeOfCustomXmlMoveToRangeStartArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLMOVETORANGESTART$36);
        }
    }
    
    /**
     * Sets array of all "customXmlMoveToRangeStart" element
     */
    public void setCustomXmlMoveToRangeStartArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange[] customXmlMoveToRangeStartArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlMoveToRangeStartArray, CUSTOMXMLMOVETORANGESTART$36);
        }
    }
    
    /**
     * Sets ith "customXmlMoveToRangeStart" element
     */
    public void setCustomXmlMoveToRangeStartArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange customXmlMoveToRangeStart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().find_element_user(CUSTOMXMLMOVETORANGESTART$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlMoveToRangeStart);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlMoveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange insertNewCustomXmlMoveToRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().insert_element_user(CUSTOMXMLMOVETORANGESTART$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlMoveToRangeStart" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange addNewCustomXmlMoveToRangeStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTrackChange)get_store().add_element_user(CUSTOMXMLMOVETORANGESTART$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlMoveToRangeStart" element
     */
    public void removeCustomXmlMoveToRangeStart(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLMOVETORANGESTART$36, i);
        }
    }
    
    /**
     * Gets a List of "customXmlMoveToRangeEnd" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup> getCustomXmlMoveToRangeEndList()
    {
        final class CustomXmlMoveToRangeEndList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup get(int i)
                { return CTRubyContentImpl.this.getCustomXmlMoveToRangeEndArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRubyContentImpl.this.getCustomXmlMoveToRangeEndArray(i);
                CTRubyContentImpl.this.setCustomXmlMoveToRangeEndArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup o)
                { CTRubyContentImpl.this.insertNewCustomXmlMoveToRangeEnd(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup old = CTRubyContentImpl.this.getCustomXmlMoveToRangeEndArray(i);
                CTRubyContentImpl.this.removeCustomXmlMoveToRangeEnd(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfCustomXmlMoveToRangeEndArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CustomXmlMoveToRangeEndList();
        }
    }
    
    /**
     * Gets array of all "customXmlMoveToRangeEnd" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] getCustomXmlMoveToRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUSTOMXMLMOVETORANGEEND$38, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "customXmlMoveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup getCustomXmlMoveToRangeEndArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "customXmlMoveToRangeEnd" element
     */
    public int sizeOfCustomXmlMoveToRangeEndArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMXMLMOVETORANGEEND$38);
        }
    }
    
    /**
     * Sets array of all "customXmlMoveToRangeEnd" element
     */
    public void setCustomXmlMoveToRangeEndArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup[] customXmlMoveToRangeEndArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(customXmlMoveToRangeEndArray, CUSTOMXMLMOVETORANGEEND$38);
        }
    }
    
    /**
     * Sets ith "customXmlMoveToRangeEnd" element
     */
    public void setCustomXmlMoveToRangeEndArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup customXmlMoveToRangeEnd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().find_element_user(CUSTOMXMLMOVETORANGEEND$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(customXmlMoveToRangeEnd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "customXmlMoveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup insertNewCustomXmlMoveToRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().insert_element_user(CUSTOMXMLMOVETORANGEEND$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "customXmlMoveToRangeEnd" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup addNewCustomXmlMoveToRangeEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTMarkup)get_store().add_element_user(CUSTOMXMLMOVETORANGEEND$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "customXmlMoveToRangeEnd" element
     */
    public void removeCustomXmlMoveToRangeEnd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMXMLMOVETORANGEEND$38, i);
        }
    }
    
    /**
     * Gets a List of "ins" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange> getInsList()
    {
        final class InsList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange get(int i)
                { return CTRubyContentImpl.this.getInsArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTRubyContentImpl.this.getInsArray(i);
                CTRubyContentImpl.this.setInsArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTRubyContentImpl.this.insertNewIns(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTRubyContentImpl.this.getInsArray(i);
                CTRubyContentImpl.this.removeIns(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfInsArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InsList();
        }
    }
    
    /**
     * Gets array of all "ins" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] getInsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INS$40, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange getInsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(INS$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ins" element
     */
    public int sizeOfInsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INS$40);
        }
    }
    
    /**
     * Sets array of all "ins" element
     */
    public void setInsArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] insArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(insArray, INS$40);
        }
    }
    
    /**
     * Sets ith "ins" element
     */
    public void setInsArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange ins)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(INS$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ins);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange insertNewIns(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().insert_element_user(INS$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ins" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange addNewIns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().add_element_user(INS$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "ins" element
     */
    public void removeIns(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INS$40, i);
        }
    }
    
    /**
     * Gets a List of "del" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange> getDelList()
    {
        final class DelList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange get(int i)
                { return CTRubyContentImpl.this.getDelArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTRubyContentImpl.this.getDelArray(i);
                CTRubyContentImpl.this.setDelArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTRubyContentImpl.this.insertNewDel(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTRubyContentImpl.this.getDelArray(i);
                CTRubyContentImpl.this.removeDel(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfDelArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DelList();
        }
    }
    
    /**
     * Gets array of all "del" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] getDelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEL$42, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange getDelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(DEL$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "del" element
     */
    public int sizeOfDelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEL$42);
        }
    }
    
    /**
     * Sets array of all "del" element
     */
    public void setDelArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] delArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(delArray, DEL$42);
        }
    }
    
    /**
     * Sets ith "del" element
     */
    public void setDelArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange del)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(DEL$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(del);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange insertNewDel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().insert_element_user(DEL$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "del" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange addNewDel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().add_element_user(DEL$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "del" element
     */
    public void removeDel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEL$42, i);
        }
    }
    
    /**
     * Gets a List of "moveFrom" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange> getMoveFromList()
    {
        final class MoveFromList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange get(int i)
                { return CTRubyContentImpl.this.getMoveFromArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTRubyContentImpl.this.getMoveFromArray(i);
                CTRubyContentImpl.this.setMoveFromArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTRubyContentImpl.this.insertNewMoveFrom(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTRubyContentImpl.this.getMoveFromArray(i);
                CTRubyContentImpl.this.removeMoveFrom(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfMoveFromArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveFromList();
        }
    }
    
    /**
     * Gets array of all "moveFrom" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] getMoveFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVEFROM$44, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveFrom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange getMoveFromArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(MOVEFROM$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveFrom" element
     */
    public int sizeOfMoveFromArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVEFROM$44);
        }
    }
    
    /**
     * Sets array of all "moveFrom" element
     */
    public void setMoveFromArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] moveFromArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveFromArray, MOVEFROM$44);
        }
    }
    
    /**
     * Sets ith "moveFrom" element
     */
    public void setMoveFromArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange moveFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(MOVEFROM$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveFrom);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveFrom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange insertNewMoveFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().insert_element_user(MOVEFROM$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveFrom" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange addNewMoveFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().add_element_user(MOVEFROM$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveFrom" element
     */
    public void removeMoveFrom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVEFROM$44, i);
        }
    }
    
    /**
     * Gets a List of "moveTo" elements
     */
    public java.util.List<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange> getMoveToList()
    {
        final class MoveToList extends java.util.AbstractList<org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange>
        {
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange get(int i)
                { return CTRubyContentImpl.this.getMoveToArray(i); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange set(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTRubyContentImpl.this.getMoveToArray(i);
                CTRubyContentImpl.this.setMoveToArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange o)
                { CTRubyContentImpl.this.insertNewMoveTo(i).set(o); }
            
            public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange remove(int i)
            {
                org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange old = CTRubyContentImpl.this.getMoveToArray(i);
                CTRubyContentImpl.this.removeMoveTo(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfMoveToArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MoveToList();
        }
    }
    
    /**
     * Gets array of all "moveTo" elements
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] getMoveToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MOVETO$46, targetList);
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] result = new org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "moveTo" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange getMoveToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(MOVETO$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "moveTo" element
     */
    public int sizeOfMoveToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MOVETO$46);
        }
    }
    
    /**
     * Sets array of all "moveTo" element
     */
    public void setMoveToArray(org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange[] moveToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(moveToArray, MOVETO$46);
        }
    }
    
    /**
     * Sets ith "moveTo" element
     */
    public void setMoveToArray(int i, org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange moveTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().find_element_user(MOVETO$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(moveTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "moveTo" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange insertNewMoveTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().insert_element_user(MOVETO$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "moveTo" element
     */
    public org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange addNewMoveTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange target = null;
            target = (org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRunTrackChange)get_store().add_element_user(MOVETO$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "moveTo" element
     */
    public void removeMoveTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MOVETO$46, i);
        }
    }
    
    /**
     * Gets a List of "oMathPara" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara> getOMathParaList()
    {
        final class OMathParaList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara get(int i)
                { return CTRubyContentImpl.this.getOMathParaArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara old = CTRubyContentImpl.this.getOMathParaArray(i);
                CTRubyContentImpl.this.setOMathParaArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara o)
                { CTRubyContentImpl.this.insertNewOMathPara(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara old = CTRubyContentImpl.this.getOMathParaArray(i);
                CTRubyContentImpl.this.removeOMathPara(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfOMathParaArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new OMathParaList();
        }
    }
    
    /**
     * Gets array of all "oMathPara" elements
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara[] getOMathParaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OMATHPARA$48, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara[] result = new org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oMathPara" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara getOMathParaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().find_element_user(OMATHPARA$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "oMathPara" element
     */
    public int sizeOfOMathParaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OMATHPARA$48);
        }
    }
    
    /**
     * Sets array of all "oMathPara" element
     */
    public void setOMathParaArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara[] oMathParaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oMathParaArray, OMATHPARA$48);
        }
    }
    
    /**
     * Sets ith "oMathPara" element
     */
    public void setOMathParaArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara oMathPara)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().find_element_user(OMATHPARA$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(oMathPara);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "oMathPara" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara insertNewOMathPara(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().insert_element_user(OMATHPARA$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oMathPara" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara addNewOMathPara()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMathPara)get_store().add_element_user(OMATHPARA$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "oMathPara" element
     */
    public void removeOMathPara(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OMATHPARA$48, i);
        }
    }
    
    /**
     * Gets a List of "oMath" elements
     */
    public java.util.List<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath> getOMathList()
    {
        final class OMathList extends java.util.AbstractList<org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath>
        {
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath get(int i)
                { return CTRubyContentImpl.this.getOMathArray(i); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath set(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath o)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath old = CTRubyContentImpl.this.getOMathArray(i);
                CTRubyContentImpl.this.setOMathArray(i, o);
                return old;
            }
            
            public void add(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath o)
                { CTRubyContentImpl.this.insertNewOMath(i).set(o); }
            
            public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath remove(int i)
            {
                org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath old = CTRubyContentImpl.this.getOMathArray(i);
                CTRubyContentImpl.this.removeOMath(i);
                return old;
            }
            
            public int size()
                { return CTRubyContentImpl.this.sizeOfOMathArray(); }
            
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
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[] getOMathArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OMATH$50, targetList);
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[] result = new org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "oMath" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath getOMathArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().find_element_user(OMATH$50, i);
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
            return get_store().count_elements(OMATH$50);
        }
    }
    
    /**
     * Sets array of all "oMath" element
     */
    public void setOMathArray(org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath[] oMathArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(oMathArray, OMATH$50);
        }
    }
    
    /**
     * Sets ith "oMath" element
     */
    public void setOMathArray(int i, org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath oMath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().find_element_user(OMATH$50, i);
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
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath insertNewOMath(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().insert_element_user(OMATH$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "oMath" element
     */
    public org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath addNewOMath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath target = null;
            target = (org.openxmlformats.schemas.officeDocument.x2006.math.CTOMath)get_store().add_element_user(OMATH$50);
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
            get_store().remove_element(OMATH$50, i);
        }
    }
}
