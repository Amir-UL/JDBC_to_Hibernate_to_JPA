package org.aiokleo.appUser;

import org.aiokleo.devices.Device;
import org.aiokleo.devices.Laptop;
import org.aiokleo.devices.Phones;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Connection {
    // Configuration
    // The application must supply JDBC connections.
    Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
            .addAnnotatedClass(AppUser.class)
            .addAnnotatedClass(Device.class)
            .addAnnotatedClass(Phones.class)
            .addAnnotatedClass(Laptop.class); // locating the connection configuration file
    SessionFactory sf = configuration.buildSessionFactory();
    Session session = sf.openSession();

    //
    Transaction t = session.beginTransaction();
    // save is depended on Session interface. Which also can't be used to instantiate
    // an Object. SessionFactory also an Interface.
    // We go Configuration in our hand


    public void setConnectionAppUser(AppUser appUser) { // This method HAVE TO BE public to be accessed by Other classes from Other packages.
        this.session.save(appUser); // The magic word. Which belongs to session class. So, call session
    }
    public void setConfigurationDevice(Device device){
        this.session.save(device);
    }

    public void setConfigurationPhones(Phones phones){
        this.session.save(phones);
    }

    public void setConfigurationLaptop(Laptop laptop){
        this.session.save(laptop);
    }
    public void setCommit(){
        this.t.commit();
    }

}
