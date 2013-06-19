
package com.haeger.time.haegertime.service;

import org.w3c.dom.Document;

/**
 * Schnittstelle für die Implementierung eines XMLDocument-Validators
 * @author Andreas
 */
public interface XMLDocumentValidator {
    
    public boolean validateDocument(String filePath);
    
}
