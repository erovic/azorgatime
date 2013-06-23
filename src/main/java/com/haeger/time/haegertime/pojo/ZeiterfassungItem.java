package com.haeger.time.haegertime.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Ein Objekt dieser Klasse stellt einen vollständigen Zeiterfassungssatz dar
 *
 * @author Andreas
 */

@XmlRootElement
public class ZeiterfassungItem {
    
    private String mitarbeiterName;
    
    private Date datum;
    
    private String taetigkeit;
    
    private double dauer;
    
    private Kategorie kategorie;
    
    private String monat;
    
    private String jahr;
    
    public String getMonat(){
        return monat;
    }
    
    public String getJahr(){
        return jahr;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public String getMitarbeiterName() {
        return mitarbeiterName;
    }

    public void setMitarbeiterName(String mitarbeiterName) {
        this.mitarbeiterName = mitarbeiterName;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        
        this.datum = datum;
        
        SimpleDateFormat fmt = new SimpleDateFormat();
        
        fmt.applyPattern("MMMM");
        
        this.monat = fmt.format(datum);
        
        fmt.applyPattern("yyyy");
        
        this.jahr = fmt.format(datum);
        
    }

    public String getTaetigkeit() {
        return taetigkeit;
    }

    public void setTaetigkeit(String taetigkeit) {
        this.taetigkeit = taetigkeit;
    }

    public double getDauer() {
        return dauer;
    }

    public void setDauer(double dauer) {
        this.dauer = dauer;
    }
    
   public ZeiterfassungItem(){
       
   }
  
    
}
