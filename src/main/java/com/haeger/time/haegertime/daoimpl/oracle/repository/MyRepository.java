/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.daoimpl.oracle.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Andreas
 */
public interface MyRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

	public void delete(T entity);
	
	public <S extends T> S save(S entity);
}
