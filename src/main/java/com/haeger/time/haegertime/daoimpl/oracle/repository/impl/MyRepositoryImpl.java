/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haeger.time.haegertime.daoimpl.oracle.repository.impl;

import com.haeger.time.haegertime.daoimpl.oracle.repository.MyRepository;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


/**
 *
 * @author Andreas
 */
public class MyRepositoryImpl<T, ID extends Serializable>  implements MyRepository<T, ID>{

    public void delete(T entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public <S extends T> S save(S entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<T> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<T> findAll(Sort sort) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public <S extends T> List<S> save(Iterable<S> itrbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void flush() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public T saveAndFlush(T t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteInBatch(Iterable<T> itrbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteAllInBatch() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Page<T> findAll(Pageable pgbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public T findOne(ID id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exists(ID id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Iterable<T> findAll(Iterable<ID> itrbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long count() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(ID id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(Iterable<? extends T> itrbl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    
}
