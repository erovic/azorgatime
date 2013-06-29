/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.daoimpl.oracle.repository.impl;

import com.haeger.time.haegertime.daoimpl.oracle.repository.MyRepository;
import com.haeger.time.haegertime.pojo.Log;
import java.io.Serializable;
import javax.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 *
 * @author Andreas
 */
public class MyRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements MyRepository<T, ID>{

    	private EntityManager entityManager;
	
	public MyRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		this.entityManager = entityManager;
	}
    
    public <S extends T> S performNew(S entity) {
		Log log;
		log = new Log();
                log.setDatum(null);
                log.setVorgang("Speichern von " + entity.getClass().toString());
		//super.save(log);
		return super.save(entity);
    }

    public <S extends T> S performEdit(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
