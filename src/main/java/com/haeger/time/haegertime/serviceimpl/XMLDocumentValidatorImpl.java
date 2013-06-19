/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.serviceimpl;


import com.haeger.time.haegertime.service.XMLDocumentValidator;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * Implementierung der Schnittstellendefinition XMLDocumentValidator
 * 
 * @author Andreas
 */
public class XMLDocumentValidatorImpl implements XMLDocumentValidator{

    /**
     * 
     * Validiert XML-Dokument, dass im uebergebenen filePath adressiert ist,
     * gegen das angegebene Schema
     * 
     * @param filePath
     * @return 
     */
    public boolean validateDocument(String filePath) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
    
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XMLDocumentValidatorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        Document doc = null;
        try {
            doc = builder.parse(new File(filePath));
        } catch (SAXException ex) {
            Logger.getLogger(XMLDocumentValidatorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(XMLDocumentValidatorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Source schemaFile;
        schemaFile = new StreamSource(new File(PropertyServiceImpl.getProperty("schemafile")));
        Schema schema = null;
        try {
            schema = schemaFactory.newSchema(schemaFile);
        } catch (SAXException ex) {
            Logger.getLogger(XMLDocumentValidatorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        Validator validator = schema.newValidator();
        try {
            validator.validate(new DOMSource(doc));
        } catch (SAXException ex) {
            Logger.getLogger(XMLDocumentValidatorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (IOException ex) {
            Logger.getLogger(XMLDocumentValidatorImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }
    
}
