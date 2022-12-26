package org.aiokleo.appUser;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class Connection {
    // Configuration
    // The application must supply JDBC connections.
    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("of");
    public EntityManager em = emf.createEntityManager();
}
