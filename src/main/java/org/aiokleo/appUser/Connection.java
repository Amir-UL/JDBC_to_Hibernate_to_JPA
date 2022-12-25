package org.aiokleo.appUser;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Connection {
    // Configuration
    // The application must supply JDBC connections.
    Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AppUser.class); // locating the connection configuration file
    SessionFactory sf = configuration.buildSessionFactory();
    Session session = sf.openSession();

    //
    Transaction t = session.beginTransaction();
    // save is depended on Session interface. Which also can't be used to instantiate
    // an Object. SessionFactory also an Interface.
    // We go Configuration in our hand


    public void configConnection(AppUser appUser) { // This method HAVE TO BE public to be accessed by Other classes from Other packages.
        this.session.save(appUser); // The magic word. Which belongs to session class. So, call session
        this.t.commit();
    }
}
