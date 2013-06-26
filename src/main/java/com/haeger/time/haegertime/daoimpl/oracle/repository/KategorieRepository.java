package com.haeger.time.haegertime.daoimpl.oracle.repository;

import com.haeger.time.haegertime.pojo.Kategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * Reöpositoryinterface fuer Kategorie-Pojo
 * 
 * @author Andreas
 */
@Repository
public interface KategorieRepository extends JpaRepository<Kategorie, Long> {



}
