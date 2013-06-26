
package com.haeger.time.haegertime.pojo;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * Pojo zum Loggen von Vorgaengen
 * 
 * @author Andreas
 */

@Entity
public class Log {
    
    @Id
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datum;
    
    private String vorgang;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getVorgang() {
        return vorgang;
    }

    public void setVorgang(String vorgang) {
        this.vorgang = vorgang;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
