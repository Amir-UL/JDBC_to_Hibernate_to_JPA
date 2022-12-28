package org.aiokleo;

import org.aiokleo.appUser.AllNames;
import org.aiokleo.appUser.AppUser;
import org.aiokleo.appUser.Connection;
import org.aiokleo.devices.Device;
import org.aiokleo.devices.Laptop;
import org.aiokleo.devices.Phones;


public class Main {

    public static void main(String[] args) {

        // Sending data to DB
        AllNames names = new AllNames("Afrida", "Zahan", "Dhoritry");
        Device device = new Device( true, true, true);
        Phones phones = new Phones( "Some Thing latest");
        Laptop laptop = new Laptop( "Any");
        AppUser appUser = new AppUser(names, "dhoritry@gmail.com", "2005-04-21", device, phones, laptop);

        // Establishing Connection
        Connection c = new Connection();

        c.em.getTransaction().begin();
        c.em.persist(appUser);
        c.em.persist(device);
        c.em.persist(phones);
        c.em.persist(laptop);
        c.em.getTransaction().commit();

    }
}