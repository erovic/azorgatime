package com.haeger.time.haegertime.test.pojo;

import com.haeger.time.haegertime.dao.ZeiterfassungItemDAO;
import com.haeger.time.haegertime.daoimpl.xml.ZeiterfassungItemDAOImpl;
import com.haeger.time.haegertime.pojo.Kategorie;
import com.haeger.time.haegertime.pojo.ZeiterfassungItem;
import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * Komponententest fuer die ZeiterfassungItem-Klasse
 * 
 * @author andreas
 */
public class ZeiterfassungItemTest extends TestCase {
    
    public ZeiterfassungItemTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    
    /**
     * 
     * Erzeugt ein ZeiterfassungItem-Objekt
     * 
     */
    public void testZeiterfassungItemAnlegen(){
        
        ZeiterfassungItem item = new ZeiterfassungItem();
        
        Date dt = new Date();
        
        item.setDatum(dt);
        
        item.setDauer(2.5);
        
        Kategorie kat1 = new Kategorie("Feedback");
        
        item.setKategorie(kat1);
        
        item.setMitarbeiterName("rkkrazyivan");
        
        item.setTaetigkeit("Code Review");
        
        assertEquals(item.getDatum().toString(), dt.toString());
        
        assertEquals(item.getDauer(), 2.5);
        
        assertEquals(item.getKategorie(), kat1);
        
        assertEquals(item.getMitarbeiterName(), "rkkrazyivan");
        
        assertEquals(item.getTaetigkeit(), "Code Review");
               
    }
    
    /**
     * 
     * Prueft die Serialisierung eines ZeiterfassungItem-Objekts
     * 
     */
    public void testZeiterfassungItemSerialize(){
        
        ZeiterfassungItem item = new ZeiterfassungItem();
        
        Date dt = new Date();
        
        item.setDatum(dt);
        
        item.setDauer(2.5);
        
        Kategorie kat1 = new Kategorie("Feedback");
        
        item.setKategorie(kat1);
        
        item.setMitarbeiterName("rkkrazyivan");
        
        item.setTaetigkeit("Code Review");
        
        ZeiterfassungItemDAO zdao = new ZeiterfassungItemDAOImpl();
        
        zdao.save(item);
    }
}
