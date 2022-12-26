package org.aiokleo.appUser;

import org.aiokleo.devices.Device;

public class UserService {
    public static void main(String[] args) {
        Connection c = new Connection();


        // Fetching the Data
        AppUser appUser = c.session.get(AppUser.class, 3 );
        System.out.println(appUser.getDevice());

        // Level 01 cashing is Done by Hibernate Automatically
        // We can Ensure that by running this lines of Cods
        // Hibernate will Execute SQL Once for these two Object as The Object is Already Stored.


        AppUser User = c.session.get(AppUser.class, 7 );
        System.out.println(User.getDate_of_birth());

    }
}
