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
        AllNames names = new AllNames("Zohir", "Ryhan", "Forid");
        Device device = new Device(3, true, true, false);
        Phones phones = new Phones(3, "Lava Some Version");
        Laptop laptop = new Laptop(3, null);
        AppUser appUser = new AppUser(3, names, "ryhangmail.com", "1980-01-01", device, phones, laptop);


        // Establishing Connection
        Connection c = new Connection();

        c.setConnectionAppUser(appUser);
        c.setConfigurationDevice(device);
        c.setConfigurationPhones(phones);
        c.setConfigurationLaptop(laptop);
        c.setCommit();

    }
}