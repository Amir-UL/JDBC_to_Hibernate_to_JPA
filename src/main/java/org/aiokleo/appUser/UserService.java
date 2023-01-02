package org.aiokleo.appUser;

import org.aiokleo.devices.Device;

public class UserService {
    public static void main(String[] args) {
        Connection c = new Connection();

        // Fetching the Data
        AppUser appUser = c.em.find(AppUser.class, 4);
        System.out.println(appUser.getEmail());
    }
}
