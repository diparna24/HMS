package com.cg.hsm.util;
import javax.persistence.Persistence;
import javax.persistence.*;
/**
 * This class provides jpa connection to the database
 * @author Pranjali Chaudhari
 *
 */
public class DBUtil {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");  
    protected EntityManager entityManager=entityManagerFactory.createEntityManager();

}
