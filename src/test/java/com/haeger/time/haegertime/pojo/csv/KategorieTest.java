package com.haeger.time.haegertime.pojo.csv;

import com.haeger.time.haegertime.dao.KategorieDAO;
import com.haeger.time.haegertime.daoimpl.csv.KategorieDAOImpl;
import com.haeger.time.haegertime.pojo.Kategorie;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * Komponententest fuer die Kategorie-Klasse mit CSV-Mapping
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
     * Dieser Test prueft das Serialisieren in das CSV-Format
     */
    public void testKategorieSerialize(){
        
        Kategorie kat1 = new Kategorie("Feedback");
        
        KategorieDAO kdao = new KategorieDAOImpl();
        
        //kdao.save(kat1);
        
    }
    
    /**
     * 
     * Dieser Test prueft das Serialisieren mehrerer Objekte in das
     * CSV-Format 
     * 
     */
    public void testKategorieSerialize2(){

        Kategorie kat1 = new Kategorie("Feedback");
              
        Kategorie kat2 = new Kategorie("Feedback2");
        
        ArrayList<Kategorie> liste = new ArrayList<Kategorie>();
        
        liste.add(kat1);
        
        liste.add(kat2);
        
        KategorieDAO kdao = new KategorieDAOImpl();
        
        kdao.save(liste);
        
        
    }
}
