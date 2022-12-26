package org.aiokleo;

import org.aiokleo.appUser.AllNames;
import org.aiokleo.appUser.AppUser;
import org.aiokleo.appUser.Connection;
import org.aiokleo.devices.Device;
import org.aiokleo.devices.Laptop;
import org.aiokleo.devices.Phones;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Sending data to DB
        AllNames names = new AllNames("Afrida", "Zahan", "Dhoritry");
        Device device = new Device(9, true, true, true);
        Phones phones = new Phones(9, "Some Thing latest");
        Laptop laptop = new Laptop(9, "Any");
        AppUser appUser = new AppUser(9, names, "dhoritry@gmail.com", "2005-04-21", device, phones, laptop);

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