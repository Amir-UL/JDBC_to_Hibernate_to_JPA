package org.aiokleo;

import org.aiokleo.appUser.AllNames;
import org.aiokleo.appUser.AppUser;
import org.aiokleo.appUser.Connection;
import org.aiokleo.devices.Device;


public class Main {

    public static void main(String[] args) {

        // Sending data to DB
        AllNames names = new AllNames("Amirul", "Islam", "Khalifa");
        AppUser appUser = new AppUser(16, names, "jamal@gmail.com", "2000-01-01");
        
//        Config config = new Config();

        // Establishing Connection
        Connection c = new Connection();
        c.configConnection(appUser);

    }
}