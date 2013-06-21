package com.haeger.time.haegertime.test.pojo;


import com.haeger.time.haegertime.dao.KategorieDAO;
import com.haeger.time.haegertime.daoimpl.xml.KategorieDAOImpl;
import com.haeger.time.haegertime.pojo.Kategorie;
import junit.framework.TestCase;

/**
 *
 * Komponententest fuer die Kategorie-Klasse
 * 
 * @author Andreas
 */
public class KategorieTest extends TestCase {
    
    public KategorieTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     *Dieser Test prueft die Erstellung von Kategorie-Objekten
     */
    public void testKategorieAnlegen(){
        
        Kategorie kat1 = new Kategorie("Feedback");
        
        assertEquals("Feedback", kat1.getKategorieName());
    }
    
    /**
     * Dieser Test prueft das Serialisieren mit JAXB in ein XML-Format
     */
    public void testKategorieSerialize(){
        
        Kategorie kat1 = new Kategorie("Feedback");
        
        KategorieDAO kdao = new KategorieDAOImpl();
        
        kdao.save(kat1);
        
    }
}
