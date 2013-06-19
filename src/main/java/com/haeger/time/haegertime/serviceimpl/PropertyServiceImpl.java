package com.haeger.time.haegertime.serviceimpl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Properties;


/**
 *
 * Implementiert die Schnittstellendefinition der Schnittstelle PropertyService
 * 
 * @author Andreas
 */
public class PropertyServiceImpl{

    private static Properties properties = new Properties();
    
    /**
     * 
     * Liest aus Properties Wert zu uebergebenem Key aus
     * 
     * @param key
     * @return 
     */
    public static String getProperty(String key) {
                
        if(properties.size() == 0){
            loadProperties();
        }
        
        try{
            
            return properties.getProperty(key);
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
            return "";
            
        }
        
    }

    /**
     * 
     * Laed Properties aus Datei in statisches private Attribut properties
     * 
     */
    private static void loadProperties() {
        
        try{
            
            BufferedInputStream stream = new BufferedInputStream(
                                                new FileInputStream("src/main/resources/my.properties"));
            
            properties.load(stream);
            
            stream.close();
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
                
    }
    
}
