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
        AllNames names = new AllNames("Amir", "Hamza", "Arif");
        Device device = new Device(4, true, true, true);
        Phones phones = new Phones(4, "Some Thing latest");
        Laptop laptop = new Laptop(4, "Any");
        AppUser appUser = new AppUser(4, names, "arif@gmail.com", "2000-01-01", device, phones, laptop);


        // Establishing Connection
        Connection c = new Connection();

        c.setConnectionAppUser(appUser);
        c.setConfigurationDevice(device);
        c.setConfigurationPhones(phones);
        c.setConfigurationLaptop(laptop);
        c.setCommit();

    }
}