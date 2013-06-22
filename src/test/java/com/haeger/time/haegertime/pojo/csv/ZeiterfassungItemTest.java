package com.haeger.time.haegertime.pojo.csv;

import com.haeger.time.haegertime.dao.ZeiterfassungItemDAO;
import com.haeger.time.haegertime.daoimpl.csv.ZeiterfassungDAOImpl;
import com.haeger.time.haegertime.pojo.Kategorie;
import com.haeger.time.haegertime.pojo.ZeiterfassungItem;
import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * Komponententest fuer die ZeiterfassungItem-Klasse mit CSV-Mapping
 * 
 * @author Andreas
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
     * Testet das hinzufuegen mehrerer ZeiterfassungItem-Objekte
     * 
     */
    public void testZeiterfassungItemAdd(){
        
        ZeiterfassungItem item = new ZeiterfassungItem();
        
        item.setDatum(new Date());
        
        item.setDauer(2.0);
        
        item.setKategorie(new Kategorie("Test"));
        
        item.setMitarbeiterName("Tester");
        
        item.setTaetigkeit("Na was wohl...testen");
        
        ZeiterfassungItemDAO itemDao = new ZeiterfassungDAOImpl();
        
        itemDao.save(item);
        
    }
}
