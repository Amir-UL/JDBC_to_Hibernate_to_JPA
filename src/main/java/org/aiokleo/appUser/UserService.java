package org.aiokleo.appUser;

public class UserService {
    public static void main(String[] args) {
        AppUser appUser = null;
        Connection c = new Connection();


        // Fetching the Data
        appUser = (AppUser)c.session.get(AppUser.class, 02);
        System.out.println(appUser);
    }
}
