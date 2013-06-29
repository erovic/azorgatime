/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.integrationtest;

import com.haeger.time.haegertime.daoimpl.oracle.repository.KategorieRepository;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Andreas
 */
public class KategorieToDatabaseIntegrationTest extends TestCase {
    
    	@Autowired
	private KategorieRepository katrepo;
    
    public KategorieToDatabaseIntegrationTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    public void testInsertKategorie(){
        
        
        
    }
}
