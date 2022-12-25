package org.aiokleo;

import org.aiokleo.appUser.AppUser;
import org.aiokleo.appUser.Connection;


public class Main {

    public static void main(String[] args) {

        AppUser appUser = new AppUser(15, "Jamal", "jamal@gmail.com", "2000-01-01");
//        Config config = new Config();

        // Establishing Connection
        Connection c = new Connection();
        c.configConnection(appUser);

    }
}