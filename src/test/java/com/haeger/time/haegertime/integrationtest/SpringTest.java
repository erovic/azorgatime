
package com.haeger.time.haegertime.integrationtest;


import com.haeger.time.haegertime.mymodel.MyModel;
import junit.framework.TestCase;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Testet Bean-Injection der DAO-Implementierung
 * 
 * @author andreas
 */
public class SpringTest extends TestCase {
    
    public SpringTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    
    /**
     * 
     * Testet die Bean-Injection
     * 
     */
    public void testInjection(){
        
        ApplicationContext context = new ClassPathXmlApplicationContext(
                                            "META-INF/beans.xml");
        
        BeanFactory factory = context;
        
        MyModel model = (MyModel) factory.getBean("model");
        
        //model.testModel();
        
    }
    

}
