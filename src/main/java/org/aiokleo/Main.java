package org.aiokleo;

import org.aiokleo.appUser.AppUser;
import org.aiokleo.appUser.Connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {

        AppUser appUser = new AppUser(11, "Amir", "amir@gmail.com", "2000-02-01");
        Config config = new Config();

        // Establishing Connection
        config.configConnection(appUser);

    }
    static class Config {
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

        void configConnection(AppUser appUser) {
            this.session.save(appUser); // The magic word. Which belongs to session class. So, call session
            this.t.commit();
        }
    }
}