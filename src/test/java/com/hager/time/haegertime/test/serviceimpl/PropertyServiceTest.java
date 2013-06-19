package com.hager.time.haegertime.test.serviceimpl;

import com.haeger.time.haegertime.serviceimpl.PropertyServiceImpl;
import junit.framework.TestCase;

/**
 *
 * Dieser Unit-Test prueft, ob die Properties korrekt ausgelegen werden koennens
 * 
 * @author Andreas
 */
public class PropertyServiceTest extends TestCase {
    
    public PropertyServiceTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    /**
     * 
     * Prueft ob die "test"-Property korrekt ausgelesen werden kanns
     * 
     */
    public void testReadProperty(){
        
        assertEquals(PropertyServiceImpl.getProperty("test"), "Dies ist ein Test");
        
    }
}
