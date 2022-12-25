package org.aiokleo.appUser;

import org.aiokleo.devices.Device;

public class UserService {
    public static void main(String[] args) {
        Connection c = new Connection();


        // Fetching the Data
        AppUser appUser = c.session.get(AppUser.class, 2);
        System.out.println(appUser.getDevice());
    }
}
