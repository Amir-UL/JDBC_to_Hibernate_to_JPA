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
        AllNames names = new AllNames("Arman", "Malik", "Khureshi");
        Device device = new Device(6, true, true, true);
        Phones phones = new Phones(6, "Some Thing latest");
        Laptop laptop = new Laptop(6, "Any");
        AppUser appUser = new AppUser(7, names, "arman@gmail.com", "1999-03-07", device, phones, laptop);

        // Establishing Connection
        Connection c = new Connection();

        // The Object is In Persistent State
        // I can Still UPDATE the DATA.
        appUser.setDate_of_birth(LocalDate.parse("2000-09-11"));

        // If if place the STATEMENT after t.commit();
        // The UPDATE won't Work
        // Because the Object already in Detach State
        // I could manually Specify this by c.session.detach();

        c.setConnectionAppUser(appUser);
        c.setConfigurationDevice(device);
        c.setConfigurationPhones(phones);
        c.setConfigurationLaptop(laptop);
        c.t.commit();

    }
}